# assessment-wns
sample assessment

1) Checkout this project in your local
URL: https://github.com/kachiredk/assessment-wns.git

2) Create the Data Base
Make sure that your data base details you added to the application.properties file
location of application.properties file : <your location>\wns-assessment\assessment-wns\assessment\src\main\resources
currently it has 
spring.datasource.url=jdbc:mysql://localhost:3306/CashMan<YOUR DBNAME>
spring.datasource.username=root <YOUR DB USER NAME>
spring.datasource.password=root  <YOUR DB PASSWORD>

3) Build the application using "mvn clean install"
once the build successfully completed jar will be created in the target folder 

4) Go to target folder of application
<Your Location>\wns-assessment\assessment-wns\assessment\target

5) run the jar file
java -jar <jar file name>

verify the console info message will be printed like 

Application Started Fine...!

Note : Log file location is configured in the application.properties file it can be changed.
specify your location if required

PS: any changes to properties file can be done directly in target folder and re run the jar file but if you build the application all change will be reverted.


Test Cases:

All code coverage report will be generated in <project location>\target\site\jacoco-it