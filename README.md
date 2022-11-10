# 2223_desarrolloserviciosoapjaxws-equipo2
*2223_desarrolloserviciosoapjaxws-equipo2 created by GitHub Classroom*

### Team members
- Isabel María González Rodríguez
- Sara Palma Rodríguez


## BookService
1. Create a new java project in IntelliJ IDE, with JDK version ***corretto-1.8.0_342***.
2. Add a org.iesvi.ws.Book Interface with books attributes and indicate methods.
3. Add a org.iesvi.ws.BookImpl Class that implements the org.iesvi.ws.Book Interface.
4. Add a BookPublish where we create an endpoint for the service.
5. Run the endpoint and write into the navigation bar of a browser `http://localhost:1516/WS/Books?wsdl` to check the WS Definitions, which will appears as follows:
![image](https://user-images.githubusercontent.com/98974760/200937201-168acd41-7b92-4386-80ac-4697088c722c.png)

In the WSDL file we find the following:
- The location for the definitions of the input parameters and the responses output by each WebMethod in XSD schema format.
![image](https://user-images.githubusercontent.com/98974760/200973966-06f04dfe-ab31-4487-8a6d-5a526b1717dd.png)

- The different messages possible between Client and Service as defined in the XSD schema.
![image](https://user-images.githubusercontent.com/98974760/200974270-5d585ffa-d13b-4453-89e8-3f8af33d422f.png)

- The different operations that can be run, and the definition of input and output messages that each operation uses.
![image](https://user-images.githubusercontent.com/98974760/200974768-8e3ecf97-fcb4-4d81-b40a-0e55a2cf3fc3.png)

- The different port bindings for each operation.
![image](https://user-images.githubusercontent.com/98974760/200974955-95ff0bc7-f58f-4ed9-962e-79410e9ab086.png)

- And finally, the main service definition with its assigned port bindings.
![image](https://user-images.githubusercontent.com/98974760/200975067-fa147d72-4f78-4825-b760-f816f3af2fd2.png)


## BookClient
1. Generate the client code with the command `wsimport -s . http://localhost:1516/WS/Books?wsdl`
<br> **NOTE:** If you use Windows make sure that wsimport is in the system PATH or write the full path where it is located.
2. Copy the .java files into the **src** directory.
3. Add a org.iesvi.ws.BookClient Class where we use the generated classes.
4. In order to run the client, the service must be running.


## Testing the service
We have 2 ways of testing that the service works:

- By running the BookClient class at BookClient/src/org/iesvi/ws/BookClient.java which does some test inserts, deletions, and listings.
- By importing the SOAPUI project located at the root of this Git Repository and running its test suite.

### IntelliJ Testing
To test with the IDE, we just have to run the BookService to publish the WebService, and then go to the BookClient and run the main method of the BookClient class.
It will run some code automatically and output results into the console.
Results and exceptions will be output in the BookService terminal, while the BookClient terminal will output anything that the user programs it to do, or the default test listings.

WARNING: The tests don't use random values, so tests will work only once unless the test code is modified, as a duplicated ID check was implemented into the service. The test suite for SOAPUI has been prepared to do a cleanup as a last test case, so it should not have this issue.

### SOAPUI Testing
We would first need to import the project into the application:

![image](https://user-images.githubusercontent.com/98974760/200980227-df015be6-2e95-4e91-b25e-74ea69169948.png)

This would give us access to the following tree structure:

![image](https://user-images.githubusercontent.com/98974760/200984386-a21ea853-7cc2-4a74-9c1d-4fb5287fa0aa.png)

Now we need the Service to be published and running (in this case, using the "Run" of the IntelliJ IDE will work), otherwise the test suite will fail.
We then open the BookImplPortBinding TestSuite and hit the green "play" button on the window that appears on the right, which should look like this at the end:

![image](https://user-images.githubusercontent.com/98974760/200984491-30d807ab-18d8-413b-aa92-5832e2138510.png)


Both the test cases in the tree on the left and the progress bars on the right should be green, otherwise it would mean some or all of the assertions (the conditions programmed into the test to determine if the test passes or not) within the tests have failed.

If for example we click on the test case for the getBookList case, we will see a new window that contains the URL used, the message sent, the message received, and the assertions and their status. In this case, we check that we did not receive a SOAP error, that the message is valid when checked against the published WSDL, that the message contains the string "getBookListResponse" representing the message type, and that it contains six different item strings, which in this case are the book names.
![image](https://user-images.githubusercontent.com/98974760/200984575-59f9ab54-f1b4-4ac5-a1f1-2efa36756e4e.png)
