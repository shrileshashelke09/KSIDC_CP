package com.test.user.Recovery;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;
import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.SARFAESI13_4_Steps.Sarfaesi13_4_Steps;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class AllScenarios_Steps extends Base_Class {
	com.Utility.ExcelReader ExcelReader;
	Base_Class Base_Class;
	Log log;
	TestListener TestListener;
	com.Utility.ScreenShot screenShot;
	Sarfaesi13_4_Steps Sarfaesi13_4_Steps;

	private static By userDropDown = By.xpath("//i[@class='caret']/parent::span");
	private static By L_signout = By.xpath("//i[@class='fa fa-power-off']/parent::a");
	private static By L_username = By.xpath("//input[@id='username']");
	private static By L_password = By.xpath("//input[@id='userpassword']");
	private static By L_SignIn = By.xpath("//button[contains(text(),'Log In')]");
	private static By L_LogOut= By.xpath("//a[text()='Click here to Logout']");
	private static By L_LogAlert= By.xpath("//button[text()='Yes']");

	@BeforeSuite
	public void reference() {
		ExcelReader = new com.Utility.ExcelReader("Steps");
		log = new Log();
		TestListener = new TestListener();
		screenShot = new com.Utility.ScreenShot(null);
		Base_Class = new Base_Class();
		Sarfaesi13_4_Steps = new Sarfaesi13_4_Steps();

	}

	@Test(dataProvider = "TestData")
	public void RUNALL(Map<Object, Object> testdata, ITestContext context) throws IOException, InterruptedException {

		try {

			if (testdata.get("Run").toString().equalsIgnoreCase("Yes")) {
				// TC_BAC_Login_Positive case
				ExtentTestManager.startTest(testdata.get("TestScenario").toString());
				Log.info("*** Running test method " + testdata.get("TestScenario").toString() + "...");
				context.setAttribute("fileName", "Login");
				Base_Class.SetUp();
				ExtentTestManager.getTest().log(Status.PASS,
						"Application Login" + com.BasePackage.Base_Class.Pagetitle);
				Log.info("Login successful !");
				Thread.sleep(3000);
				
				String UserName1 = configloader().getProperty("AuthorityUsername");
				String Password1 = configloader().getProperty("AuthorityPassword");
				
				String searchValue = testdata.get("SearchValue").toString();
				String taskName = testdata.get("TaskName").toString();
				String status = testdata.get("Status").toString();
				String refNo = testdata.get("ReferenceNo").toString();
				String nameOfBranch = testdata.get("NameOfBranch").toString();
				String location = testdata.get("Location").toString();
				String comments = testdata.get("Comments").toString();
				
				click(userDropDown);
				click(L_signout);
				ExtentTestManager.getTest().log(Status.PASS, "Application Logout");
				Log.info("Logout is done!");
				ExtentTestManager.getTest().log(Status.PASS, "Signed out as Creator.");
				Log.info("Signed out as Creator.");
				
				Thread.sleep(2000);
				
				input(L_username, UserName1);
				input(L_password, Password1);
				click(L_SignIn);
				Boolean OrignalText1 = false;
				   try {
				   OrignalText1= driver.findElement(By.xpath("//a[text()='Click here to Logout']")).isDisplayed();}
				   catch(Exception e)
				   {
					  
				   }
				   System.out.println(OrignalText1);
				   //String ExpectdText1="Choose your Gmail address";
					   if (OrignalText1) {
						   System.out.println(OrignalText1 +"if");
						      click(L_LogOut);
						      Thread.sleep(1000);
						      click(L_LogAlert);
						      Thread.sleep(1000);
						      input(L_username, UserName1);
						      input(L_password, Password1);
						      click(L_SignIn);
						      //Thread.sleep(1000);
					   }
				ExtentTestManager.getTest().log(Status.PASS, "Signed in as Approver.");
				Log.info("Signed in as Approver.");
				
				// Pick up the First Step
			ExtentTestManager.startTest("TestScenario01 : Navigate to SARFAESI Inbox");
			boolean flag1 = Sarfaesi13_4_Steps.NavigateToSARFAESIInbox();
			ExtentTestManager.getTest().log(Status.PASS, "Navigate to SARFAESI Inbox : " + flag1);		
			Log.info("Navigated to SARFAESI Inbox : " + flag1);
			
			//SaveFunctionality
			ExtentTestManager.startTest("TestScenario01 : Validate the Save Functionality");
			Sarfaesi13_4_Steps.SearchFunctionality(searchValue, taskName, status, refNo);
			boolean flag2 = Sarfaesi13_4_Steps.SaveStepFunctionality(nameOfBranch, location, comments);
			ExtentTestManager.getTest().log(Status.PASS, "Validated the Save Functionality : " + flag2);		
			Log.info("Validate the Save Functionality : " + flag2);
			
			//SaveFunctionality
			ExtentTestManager.startTest("TestScenario01 : Validate the Submit Functionality");
			Sarfaesi13_4_Steps.SearchFunctionality(searchValue, taskName, status, refNo);
			boolean flag3 = Sarfaesi13_4_Steps.SubmitStepFunctionality();
			ExtentTestManager.getTest().log(Status.PASS, "Validated the Submit Functionality : " + flag3);		
			Log.info("Validate the Submit Functionality : " + flag3);
			
			
			// Logout
			ExtentTestManager.startTest("Application Logout Initiated.");
			context.setAttribute("fileName", "Logout");
			click(userDropDown);
			click(L_signout);
			Thread.sleep(2000);
			driver.quit();
			ExtentTestManager.getTest().log(Status.PASS, "Application Logout");
			Log.info("Logout is done!");

			// EndTest
			System.out.println(("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***"));
			ExtentTestManager.endTest();
			ExtentManager.getInstance().flush();
			Log.info("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***");

			}

		} catch (Exception e) {
			System.out.println("*** Test execution " + testdata.get("TestScenario").toString() + " failed...");
			Log.error("*** Test execution " + testdata.get("TestScenario").toString() + " failed...");
			Log.error("" + e.getMessage());
			String fileName = (String) context.getAttribute("fileName");

			try {
				File file = new com.Utility.ScreenShot(driver).takeScreenShot(fileName,
						testdata.get("TestScenario").toString());
				ExtentTestManager.getTest().fail(e.getMessage(),
						MediaEntityBuilder.createScreenCaptureFromPath(file.toString()).build());
			} catch (Exception e1) {
				System.out.println("File not found " + e1);
			}
			ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");

			// Logout
			context.setAttribute("fileName", "Logout");
			driver.quit();
			ExtentTestManager.getTest().log(Status.PASS, "Application Logout");
			Log.info("Logout is done");

			// EndTest
			System.out.println(("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***"));
			ExtentTestManager.endTest();
			ExtentManager.getInstance().flush();
			Log.info("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***");
		} catch (AssertionError e) {
			System.out.println("*** Test execution " + testdata.get("TestScenario").toString() + " failed...");
			Log.error("*** Test execution " + testdata.get("TestScenario").toString() + " failed...");
			Log.error("" + e.getMessage());
			String fileName = (String) context.getAttribute("fileName");

			try {
				File file = new com.Utility.ScreenShot(driver).takeScreenShot(fileName,
						testdata.get("TestScenario").toString());
				ExtentTestManager.getTest().fail(e.getMessage(),
						MediaEntityBuilder.createScreenCaptureFromPath(file.toString()).build());
			} catch (Exception e1) {
				System.out.println("File not found " + e1);
			}
			ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");

			// Logout
			context.setAttribute("fileName", "Logout");
			driver.quit();
			ExtentTestManager.getTest().log(Status.PASS, "Application Logout");
			Log.info("Logout is done");

			// EndTest
			System.out.println(("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***"));
			ExtentTestManager.endTest();
			ExtentManager.getInstance().flush();
			Log.info("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***");
		}

	}

	@DataProvider(name = "TestData")
	public static Object[][] gettestdate() throws IOException {

		Object[][] objectarry = null;
		java.util.List<Map<String, String>> completedata = com.Utility.ExcelReader.getdata();

		objectarry = new Object[completedata.size()][1];

		for (int i = 0; i < completedata.size(); i++) {
			objectarry[i][0] = completedata.get(i);
		}
		return objectarry;
	}

}

