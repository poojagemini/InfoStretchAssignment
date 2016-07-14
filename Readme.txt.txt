Problem: Need to Automate E2E scenario of Yelp Site with the requirements given
Solution: Created a flexible framework to automate this scenario.
Aboout the framework:
1.It's a hybrid Testng framework built using the concept of Page Object Model and maven
2.The modules are categorized as packages
3.Created seperate components and locators for each page.
4.Created seperate utils for getting data through excel file as well as Property files
5.Created own utils for custom exceptions handling and wait functions
6.Used Apachi POI libraries to get data from excel file
7.Used Data Provider to run the test script with multiple pools of data
8.Created a test data and stored the excel files
9.Added logging feature.
10.Created a master suite file to run the test scripts
11.This frameowke is more readable and resuable.
12.We can also extend this framework by adding more functions.

How the framework works:
1.We need to first run the testng.xml file which contains the classes of the test script
2.First it will execute the Annotations(@BeforeClass ) present in the BaseTest.java file
3.Then it will call @Test method present in TestYelpPage.java file
4.Here it will call the different functions that's been implemented and also gets data from the data provider
5.The data provider will get the data from the excel sheet in which the logic is implemented in the ExcelUtilsCommon.java
6.Used wait utilities to manage the concept of synchronization.
