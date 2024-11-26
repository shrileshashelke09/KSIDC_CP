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
import com.Pages_Recovery_Customer_Portal_Modules.ProcessSheet_AccountsTab;
import com.Pages_Recovery_Customer_Portal_Modules.ProcessSheet_BorrowerTab;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class AllScenarios_ProcessSheet extends Base_Class {
	com.Utility.ExcelReader ExcelReader;
	Base_Class Base_Class;
	Log log;
	TestListener TestListener;
	com.Utility.ScreenShot screenShot;
	ProcessSheet_BorrowerTab ProcessSheet_BorrowerTab;
	ProcessSheet_AccountsTab ProcessSheet_AccountsTab;

	private static By userDropDown = By.xpath("//i[@class='caret']/parent::span");
	private static By L_signout = By.xpath("//i[@class='fa fa-power-off']/parent::a");

	@BeforeSuite
	public void reference() {
		ExcelReader = new com.Utility.ExcelReader("ProcessSheet");
		log = new Log();
		TestListener = new TestListener();
		screenShot = new com.Utility.ScreenShot(null);
		Base_Class = new Base_Class();
		ProcessSheet_BorrowerTab = new ProcessSheet_BorrowerTab();
		ProcessSheet_AccountsTab = new ProcessSheet_AccountsTab();

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

				String searchName = testdata.get("SearchName").toString();
				String searchValue = testdata.get("SearchValue").toString();
				String year = testdata.get("Year").toString();
				String month = testdata.get("Month").toString();
				String day = testdata.get("Day").toString();
				String offAddress = testdata.get("OfficeAddress").toString();
				String commAddress = testdata.get("CommAddress").toString();
				String perAddress = testdata.get("PerAddress").toString();
				String secAddress = testdata.get("SecAddress").toString();
				String accountNo = testdata.get("AccountNo").toString();
				String ID = testdata.get("ID").toString();
				String gurantorName = testdata.get("GurantorName").toString();
				String commuAddress = testdata.get("CommuAddress").toString();
				String permAddress = testdata.get("PermAddress").toString();
				String secuAddress = testdata.get("SecuAddress").toString();
				String AcSanctionRefNo = testdata.get("AccountSanctionRefNo").toString();
				String SanctionDisbAmt = testdata.get("SanctionDisbAmount").toString();
				String disbYear = testdata.get("DisbYear").toString();
				String disbMonth = testdata.get("DisbMonth").toString();
				String disbDay = testdata.get("DisbDay").toString();
				String DPNYear = testdata.get("DPNYear").toString();
				String DPNMonth = testdata.get("DPNMonth").toString();
				String DPNDay = testdata.get("DPNDay").toString();
				String purpose = testdata.get("Purpose").toString();
				String NPAReason = testdata.get("NPAReason").toString();
				String FacilityYear = testdata.get("FacilityYear").toString();
				String FacilityMonth = testdata.get("FacilityMonth").toString();
				String FacilityDay = testdata.get("FacilityDay").toString();
				String AODYear = testdata.get("AODYear").toString();
				String AODMonth = testdata.get("AODMonth").toString();
				String AODDay = testdata.get("AODDay").toString();
				String OutYear = testdata.get("OutstandingYear").toString();
				String OutMonth = testdata.get("OutstandingMonth").toString();
				String OutDay = testdata.get("OutstandingDay").toString();
				String IntrestYear = testdata.get("IntFurYear").toString();
				String IntrestMonth = testdata.get("IntFurMonth").toString();
				String IntrestDay = testdata.get("IntFurDay").toString();
				String Option1 = testdata.get("BankingArrangement").toString();
				String BGLCOption = testdata.get("BGLCOption").toString();
				
				// Navigate to Recovery Dashboard
			ExtentTestManager.startTest("TestScenario01 : Navigate to Projects Dashboard");
			boolean flag1 = ProcessSheet_BorrowerTab.NavigateToRecoveryDashboard(searchName,searchValue);
			ExtentTestManager.getTest().log(Status.PASS, "Navigate to Projects Dashboard : " + flag1);		
			Log.info("Navigate to Projects Dashboard : " + flag1);
			
			//Allocated Projects
			ExtentTestManager.startTest("TestScenario02 : Add Borrower Details");
			boolean flag2 = ProcessSheet_BorrowerTab.AddProcessSheetOfBorrowerTab(year,month,day,offAddress,commAddress,perAddress,secAddress, accountNo,ID, gurantorName,commuAddress, permAddress,secuAddress);
			ExtentTestManager.getTest().log(Status.PASS, "Add Borrower Details : " + flag2);
			Log.info("Borrower Details Added : " + flag2);
			
			//Project Account Tab
			ExtentTestManager.startTest("TestScenario04 : Other Account Details");
			boolean flag3 = ProcessSheet_AccountsTab.AddOtherAccountDetailsTab(OutYear,  OutMonth,  OutDay,  IntrestYear,  IntrestMonth,  IntrestDay, Option1, BGLCOption);
			ExtentTestManager.getTest().log(Status.PASS, "Other Account Details Added : " + flag3);
			Log.info("Other Account Details Added : " + flag3);
			
			//Project Account Tab
			ExtentTestManager.startTest("TestScenario05 : Add Sanction Details");
			boolean flag5 = ProcessSheet_AccountsTab.AddProcessSheetOfAccountTab(AcSanctionRefNo,SanctionDisbAmt,disbYear,disbMonth, disbDay);
			ExtentTestManager.getTest().log(Status.PASS, "Sanction Details Added : " + flag5);
			Log.info("Sanction Details Added : " + flag5);
			
			//Project Account Tab
			ExtentTestManager.startTest("TestScenario03 : Add Account Details");
			boolean flag6 = ProcessSheet_AccountsTab.AddAccountDetailsTab(DPNYear,  DPNMonth,  DPNDay,  purpose,  NPAReason,  FacilityYear,  FacilityMonth,  FacilityDay,  AODYear,  AODMonth,  AODDay);
			ExtentTestManager.getTest().log(Status.PASS, "Account Details Added : " + flag6);
			Log.info("Account Details Added : " + flag6);

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
