# Google_E2E_Automation
This is a sample project demonstrating how to test Google search functionalities using Selenium webdrivers and cucumber framework

**Components used:-**
Tool - Selenium WebDriver,Maven
Framework - Cucumber

**Description:**
*  You can find the Base and POM Classes present inside 'src' folder under 'main/java/com'
*  Featrure file, Runner class and Stepdefinition class can be found under 'test/java/com'
*  Base class contains implemented methods
*  Have created individual POM Classes for each scenarios
*  Have created test scenarios in feature file using Gherkins language and imported the snippets into Stepdefinition class
*  Have inherited the methods from baseclass to Stepdefinition class and assigned to corresponding methods 
*  Have created objects for individual POM classes and accessed them respectively
*  Have initialized the Runner class with '@RunWith' annotation and used necessary cucumber features using '@CucumberOptions' annotation.

**Instructions**
You can simply import the repositary to Eclipse tool and Execute the Runner class, The Automation will start in the browser.

**Note**
Please find the Manual test cases for Google search page file in Excel format attached with this repositary.
