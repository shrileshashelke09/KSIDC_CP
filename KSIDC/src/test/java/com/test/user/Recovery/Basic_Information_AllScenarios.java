package com.test.user.Recovery;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Pages_Recovery_Customer_Portal_Modules.Basic_Information_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Basic_Information_AllScenarios extends Base_Class{
	
		
		com.Utility.ExcelReader ExcelReader;
		Base_Class Base_Class;
		Log log;
		TestListener TestListener;
		com.Utility.ScreenShot screenShot;
		Basic_Information_Module Basic_Information_Module;
		
		@BeforeSuite
		public void reference() {
			ExcelReader = new com.Utility.ExcelReader("KSIDC_Basic_Information");
			log = new Log();
			TestListener = new TestListener();
			screenShot = new com.Utility.ScreenShot(null);
			Base_Class = new Base_Class();
			Basic_Information_Module = new Basic_Information_Module();

		}
		


		@Test(dataProvider = "TestData4")
		public void RUNALL(Map<Object, Object> testdata, ITestContext context) throws IOException, InterruptedException {

			try {

				if (testdata.get("Run").toString().equalsIgnoreCase("Yes")) {
					// TC_BAC_Login_Positive case
					ExtentTestManager.startTest(testdata.get("TestScenario").toString());
					Log.info("*** Running test method " + testdata.get("TestScenario").toString() + "...");
					context.setAttribute("fileName", "LoginButton");
					Base_Class.SetUp();

					ExtentTestManager.getTest().log(Status.PASS,
							"Login button visibility" + com.BasePackage.Base_Class.Pagetitle);
					Log.info("Button visible !");
					Thread.sleep(3000);
					
					
					String EmailAddress = testdata.get("EmailAddress").toString();
					String Password = testdata.get("Password").toString();
					String UdyamNoUdyogAadhaar = testdata.get("UdyamNoUdyogAadhaar").toString();
					
					
					
					
					//TC001
					ExtentTestManager.startTest("TestScenario01 : Login for Business Information Module");
					boolean Login = Basic_Information_Module.Login(EmailAddress, Password);
					ExtentTestManager.getTest().log(Status.PASS , "Login successfully" + Login);
					Log.info("Login successfully :" + Login);
					
					//TC002 //TC003 //TC004
					
					ExtentTestManager.startTest("Continue botton clicked and redirected to Basic Information Page");
					boolean BasicInfo = Basic_Information_Module.BasicInformationPageAccessibility();
					ExtentTestManager.getTest().log(Status.PASS , "Basic Information page redirected successfully" + BasicInfo);
					Log.info("Basic Information page redirected successfully :" + BasicInfo);
					
					//TC005
					
					ExtentTestManager.startTest("Header displayed Basic Information Page");
					boolean BasicInfoHeader = Basic_Information_Module.BasicInfoHeader();
					ExtentTestManager.getTest().log(Status.PASS , "Basic Information Header displayed successfully" + BasicInfoHeader);
					Log.info("Basic Information Header displayed successfully :" + BasicInfoHeader);
					
					//TC006 
					
					ExtentTestManager.startTest("Header displayed Basic Information Page");
					boolean MSMERadioButtonVisibility = Basic_Information_Module.MSMERadioVisibility();
					ExtentTestManager.getTest().log(Status.PASS , "MSME Radio displayed successfully" + MSMERadioButtonVisibility);
					Log.info("MSME Radio displayed successfully :" + MSMERadioButtonVisibility);
					
					//TC007
					
					ExtentTestManager.startTest("YES and NO toggle clicked");
					boolean YESNOToggle = Basic_Information_Module.YESNOToggleforMSME();
					ExtentTestManager.getTest().log(Status.PASS , "Only one toggle selected at a time" + YESNOToggle);
                    Log.info("Only one toggle selected at a time successfully :" + YESNOToggle);
					
					//TC009
                    
                    ExtentTestManager.startTest("YES  clicked");
					boolean SelectYesforMSME = Basic_Information_Module.SelectYesforMSME();
					ExtentTestManager.getTest().log(Status.PASS , "MSME Yes Selected" + SelectYesforMSME);
                    Log.info("MSME Yes Selected :" + SelectYesforMSME);
					
					//TC015
                    
                    ExtentTestManager.startTest("Udyam No verified");
					boolean EnterandVerifyUdyamNo = Basic_Information_Module.EnterandVerifyUdyamNo(UdyamNoUdyogAadhaar);
					ExtentTestManager.getTest().log(Status.PASS , "Udyam No verified" + EnterandVerifyUdyamNo);
                    Log.info("Udyam No verified :" + EnterandVerifyUdyamNo);
                    
                    ExtentTestManager.startTest("Name of Enterprises validated");
					boolean ValidateEnterprisesName = Basic_Information_Module.ValidateNameOfEnterprises();
					ExtentTestManager.getTest().log(Status.PASS , "Name of Enterprises validated" + ValidateEnterprisesName);
                    Log.info("Name of Enterprises validated :" + ValidateEnterprisesName);
					
                    ExtentTestManager.startTest("Type of Enterprises validated");
					boolean ValidateTypeofEnterprises = Basic_Information_Module.ValidateTypeOfOrganization();
					ExtentTestManager.getTest().log(Status.PASS , "Type of Enterprises validated" + ValidateTypeofEnterprises);
                    Log.info("Type of Enterprises validated :" + ValidateTypeofEnterprises);
					
					
					
					
					
					//App Logout
					
					Thread.sleep(2000);
					driver.quit();
					ExtentTestManager.getTest().log(Status.PASS, "Application Logout");
					Log.info("Logout is done");

					// EndTest
					System.out.println(("*** Test Suite " +  testdata.get("TestScenario").toString()+ " ending ***"));
					ExtentTestManager.endTest();
					ExtentManager.getInstance().flush();
					Log.info("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***");

				}

			}
			catch (Exception e) {
				System.out.println("*** Test execution " +  testdata.get("TestScenario").toString() + " failed...");
				Log.error("*** Test execution " +  testdata.get("TestScenario").toString() + " failed...");
				Log.error("" + e.getMessage());
				String fileName = (String) context.getAttribute("fileName");

				try {
					File file = new com.Utility.ScreenShot(driver).takeScreenShot(fileName, testdata.get("TestScenario").toString());
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
				System.out.println(("*** Test Suite " +  testdata.get("TestScenario").toString() + " ending ***"));
				ExtentTestManager.endTest();
				ExtentManager.getInstance().flush();
				Log.info("*** Test Suite " +  testdata.get("TestScenario").toString() + " ending ***");
			}
			catch (AssertionError e) {
				System.out.println("*** Test execution " +  testdata.get("TestScenario").toString() + " failed...");
				Log.error("*** Test execution " +  testdata.get("TestScenario").toString() + " failed...");
				Log.error("" + e.getMessage());
				String fileName = (String) context.getAttribute("fileName");

				try {
					File file = new com.Utility.ScreenShot(driver).takeScreenShot(fileName, testdata.get("TestScenario").toString());
					ExtentTestManager.getTest().fail(e.getMessage(),
							MediaEntityBuilder.createScreenCaptureFromPath(file.toString()).build());
				} catch (Exception e1) {
					System.out.println("File not found " + e1);
				}
				ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");

				// Logout
				context.setAttribute("fileName", "Logout");
				//driver.quit();
				ExtentTestManager.getTest().log(Status.PASS, "Application Logout");
				Log.info("Logout is done");

				// EndTest
				System.out.println(("*** Test Suite " +  testdata.get("TestScenario").toString() + " ending ***"));
				ExtentTestManager.endTest();
				ExtentManager.getInstance().flush();
				Log.info("*** Test Suite " +  testdata.get("TestScenario").toString() + " ending ***");
			}

		}
		@DataProvider(name = "TestData4")
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
		

