# 2223_desarrolloserviciosoapjaxws-equipo2
*2223_desarrolloserviciosoapjaxws-equipo2 created by GitHub Classroom*

### Team members
- Isabel María González Rodríguez
- Sara Palma Rodríguez


## BookService
1. Create a new java project in IntelliJ IDE, with JDK version ***corretto-1.8.0_342***.
2. Add a Book Interface with books attributes and indicate methods.
3. Add a BookImpl Class that implements the Book Interface.
4. Add a BookPublish where we create an endpoint for the service.
5. Run the endpoint and write into the navigation bar of a navigator `http://localhost:1516/WS/Book?wsdl` to obtain the WSDL file.

## ConsumerService
1. Start the book service with the command `wsimport -s . http://localhost:1516/WS/Book?wsdl`
<br> **NOTE:** If you use Windows make sure that wsimport is in the system PATH and write the path where it is located.
2. Copy the .java files into the **src** directory.
3. Add a BookCustomer Class where we use the generated classes.
4. In order to run the costumer, the service must be running.
