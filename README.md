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
