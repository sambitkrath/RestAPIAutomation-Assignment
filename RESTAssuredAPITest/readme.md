***************************************************************************************
	README - API Automation Framework Using RestAssured, TestNG, Extent Report
***************************************************************************************
  
  #GIT Repository :- 

	* The following repository is a complete package to do testing assertions or validations on the REST API hosted on "https://api.tmsandbox.co.nz".
	* The Automation framework for this validation is using Java as programming language, RestAssured Libraries for REST API Test Automation, Maven as build tool,
	  TEstNG as testing automation framework and Extent Report for Reporting.
	* This Framework is designed to cater every requirements for Service/API Testing.
	* It also supports Log generation using Log4j API.
	* The Framework has the capability to customize the required test cases to be entered in testng.xml and execute
	* RestAssured Libraries has its own Log generation capability so used in the solution.
	
	
  #Setup :- 
  
  [[Running From Eclipse]] :
	
	* Install Java
	* Set JAVA_HOME variable for the path of jdk (eg. JAVA_HOME="C:\Program Files\Java\jdk1.8.0_92")
	* Append Path variable as %PATH%;%JAVA_HOME%/bin
	* Download Maven (e.g Apache Maven 3.3.9)
	* Set M2_HOME system environment variable as (eg. M2_HOME="C:\Program Files\Apache\apache-maven-3.3.9"
	* Configure Java and Maven
	* Download Eclipse (eg. Eclipse Neon 2)
	* Import the project as existing Maven Project
	* Configure the the Java Build Path and Set the Execution Environment as "jdk1.8.0_92"
	* Select Run -> Run Configurations
	* Select Maven Build
	* Right Click on Maven Build and Click New
	* Set Maven Goals as "clean test"
	* Click on Workspace and select the Base Directory
	* Click on Apply and Run
	
	[[Running From Command Prompt]] :
	
	* Clone the current git repository into local path
	* The Source Files are placed in "<Project Path>\src\test\java\com\apitest\assignment"
	* Reusable Methods are placed in "<Project Path>\src\test\java\com\restapi\utils\ReusableMethods.java"
	* Navigate to the project directory (eg. ..\RestAssuredAPITest\RESTAssuredTest)
	* Type and execute the command  "mvn compile" to download all the related dependencies and jars
	* Run the test by executing "mvn test" command 
	* Navigate to the directory (..\RestAssuredAPITest\RESTAssuredTest\target\sure-fire reports)
	* You can see consolidated  report/dashboard -  ExtentReportsTestNG.html
	* You can see also Report for TestNG and Junit and Emailable-Report.html which can be shared in the organization
