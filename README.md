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
5. Run the endpoint and write into the navigation bar of a browser `http://localhost:1516/WS/Books?wsdl` to check the WS Definitions.
![image](https://user-images.githubusercontent.com/98974760/200937201-168acd41-7b92-4386-80ac-4697088c722c.png)
-- comentario --


## BookClient
1. Generate the client code with the command `wsimport -s . http://localhost:1516/WS/Books?wsdl`
<br> **NOTE:** If you use Windows make sure that wsimport is in the system PATH or write the full path where it is located.
2. Copy the .java files into the **src** directory.
3. Add a org.iesvi.ws.BookClient Class where we use the generated classes.
4. In order to run the client, the service must be running.
