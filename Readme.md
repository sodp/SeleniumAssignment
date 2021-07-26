###Automation Test framework 
**URL** - http://automationpractice.com/index.php
#Tools Used:
 
- Selenium Web Driver
-  Java
- TestNG
- Maven 
- Extent report
- log4j
 
#Packages Description:
- tests
- utils
- pages
 

#CartTest.java
  - ValidCartTest
  - invalidCartTest
  
#BaseTest.java
  - @BeforeMethod
  - @AfterMethod
  - @BeforeSuite
  - @AfterSuite
  
#ContactUsTest.java
  - validcontactus
  - InvalidContactUs
 
#ProductValidationTest.java
  - validproduct
  - invalidproduct
  
#LoginTest.java
  - validLogin()
  - invalidLogin()
  - invalidLogin_2
  
#UserRegistrationTest.java
  - UserRegistrationTest
  - InvalidRegistration
  - InvalidRegistration_2
 

#Tested functionalities:
 
- Registration of Old user
- Registration of New user
- Create new account form
- Cart section
- Contact us page
- Product search validation
 

#Steps to Run (Eclipse IDE)-
 
Step:1--------------------------
Goto Eclipse and open the folder 
 
Step:2--------------------------
Click run as maven clean 
 
Step:3--------------------------
After step 2 run as maven install
 
Step:4--------------------------
After step3
GOTO
SeleniumAssignmentFinal\Reports
and open 
ExtentReports.html
GOTO
SeleniumAssignmentFinal\log
for log files
 
#Steps to Run (cmd)-
 
- Step:1----------------
Goto folder ,in address bar type "cmd".
 
- Step:2----------------
type "mvn clean" in cmd and press Enter.
 
- Step:3----------------
type "mvn install" in cmd and press Enter.
 
- Step:4----------------
After step3
GOTO
SeleniumAssignmentFinal\Reports
and open 
ExtentReports.html
GOTO
SeleniumAssignmentFinal\log
for log files
 
#Report
  -Report.html
  -ExtentReport.html
#Screenshots
Comes in Project Folder
Change to absolute path if necessary 
for eg: C:\\Users\\siddhantpanda\\eclipse-workspace\\SeleniumProject\\Reports
in util package
Screenshots.Java
#ERRORS
-individually running as test ng for each test java file working perfectly and extent reports generate report perfectly
-running whole SeleniumAssignment as maven install is giving some errors which is not being resolved screenshot attached extent reporting is not working for all test cases