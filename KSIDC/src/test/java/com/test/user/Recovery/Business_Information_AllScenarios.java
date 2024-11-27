package com.test.user.Recovery;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Pages_Recovery_Customer_Portal_Modules.Business_Information_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Business_Information_AllScenarios extends Base_Class{
	
	com.Utility.ExcelReader ExcelReader;
	Base_Class Base_Class;
	Log log;
	TestListener TestListener;
	com.Utility.ScreenShot screenShot;
	Business_Information_Module Business_Information_Module;
	
	@BeforeSuite
	public void reference() {
		ExcelReader = new com.Utility.ExcelReader("KSIDC_Business_Information");
		log = new Log();
		TestListener = new TestListener();
		screenShot = new com.Utility.ScreenShot(null);
		Base_Class = new Base_Class();
		Business_Information_Module = new Business_Information_Module();

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
				String DisplayName = testdata.get("DisplayName").toString();
				String DocketAmount = testdata.get("DocketAmount").toString();
				String LoanAmountRequired = testdata.get("LoanAmountRequired").toString();
				String ProductServiceName = testdata.get("ProductServiceName").toString();
				String BreakEvenPeriod = testdata.get("BreakEvenPeriod").toString();
				String ProjectImplementationPeriodInMonths = testdata.get("ProjectImplementationPeriodInMonths").toString();
				String ApproxTotalLabourCount = testdata.get("ApproxTotalLabourCount").toString();
				String DocketNumber = testdata.get("DocketNumber").toString();
				String TreasuryReleaseDate = testdata.get("TreasuryReleaseDate").toString();
				String ProductionCapacityQuantityPerAnnumTest = testdata.get("ProductionCapacityQuantityPerAnnumTest").toString();
				
				//TC001
				ExtentTestManager.startTest("TestScenario01 : Login for Business Information Module");
				boolean Login = Business_Information_Module.Login(EmailAddress, Password);
//				
				//ExtentTestManager.startTest("Login successfully" + Login);
				ExtentTestManager.getTest().log(Status.PASS , "Login successfully" + Login);
				Log.info("Login successfully :" + Login);

				//Logout KSIDC
				
//				boolean LogoutKSIDC = Business_Information_Module.Logout();
//				ExtentTestManager.getTest().log(Status.PASS,"Logout Successfully" + LogoutKSIDC);
//				Log.info("Logged out !" + LogoutKSIDC);
				

				//TC003
				
				boolean EnquiryNowTermLoanKSIDC = Business_Information_Module.EnquiryNowTermLoanKSIDC();
				ExtentTestManager.startTest("Enquiry now button clicked and Redirected to Business Information page " + EnquiryNowTermLoanKSIDC);
				ExtentTestManager.getTest().log(Status.PASS , "Enquiry now button clicked and Redirected to Business Information page" + EnquiryNowTermLoanKSIDC);
				Log.info("Enquiry now button clicked and Redirected to Business Information page :" + EnquiryNowTermLoanKSIDC);

				//TC004
				
				boolean BusinessinfoHeader = Business_Information_Module.BusinessinfoHeader();
				ExtentTestManager.startTest("Business information header is displyed" + BusinessinfoHeader);
				Log.info("Business information header is displyed :" + BusinessinfoHeader);

				//TC005
				
				boolean Displayname = Business_Information_Module.Displaynamevisibility(DisplayName);
				ExtentTestManager.startTest("Display name is displyed" + Displayname);
				Log.info("Display name is displyed :" + Displayname);

				ExtentTestManager.startTest("Display name Entered" + Displayname);
				Log.info("Display name Entered :" + Displayname);

//TC018
				boolean SelectInstitutionType = Business_Information_Module.SelectInstitutionTypes();
				ExtentTestManager.startTest("Selected Institution type displyed" + SelectInstitutionType);
				Log.info("Selected Institution type displyed :" + SelectInstitutionType);

				boolean SelectScheme = Business_Information_Module.selectScheme();
				ExtentTestManager.startTest("Selected Scheme displyed" + SelectScheme);
				Log.info("Selected Scheme displyed :" + SelectScheme);

				//TC020 TC21
//				boolean EnterDocketandLoanAmount = Business_Information_Module.EnterDocketandLoanAmount(DocketAmount, LoanAmountRequired);
//				ExtentTestManager.startTest("Entered Amount displyed" + EnterDocketandLoanAmount);

				//TC022
				boolean ValidatePromoterContributionAmount = Business_Information_Module.ValidatePromoterContribution(DocketAmount, LoanAmountRequired);
				ExtentTestManager.startTest("Entered Amount displyed" + ValidatePromoterContributionAmount);
				Log.info("Entered Amount displyed :" + ValidatePromoterContributionAmount);

				//TC023
				boolean ValidateAItoloadedchiedname = Business_Information_Module.ChiefPromoterFullNameAutoload();
				ExtentTestManager.startTest("Chief name displayed" + ValidateAItoloadedchiedname);
				Log.info("Chief name displayed :" + ValidateAItoloadedchiedname);

				//TC024
				
				boolean ValidateAItoloadedMobileNumber = Business_Information_Module.MobileNumberAutolad();
				ExtentTestManager.startTest("Mobile Number displayed" + ValidateAItoloadedMobileNumber);
				Log.info("Mobile Number displayed :" + ValidateAItoloadedMobileNumber);
				
				//TC025
				
				boolean ValidateAutoloadedEmail = Business_Information_Module.ValidateEmailID();
				ExtentTestManager.startTest("Email displayed" + ValidateAutoloadedEmail);
				Log.info("Email displayed :" + ValidateAutoloadedEmail);
				
				//TC026
				
				boolean SelectGenderMale = Business_Information_Module.SelectGender();
				ExtentTestManager.startTest("Gender Selected" + SelectGenderMale);
				Log.info("selected Gender displayed :" + SelectGenderMale);
				
				//TC027
				
				boolean SelectLoanPurpose = Business_Information_Module.SelectLoanPurpose();
				ExtentTestManager.startTest("Loan purpose displayed" + SelectLoanPurpose);
				Log.info("Loan purpose displayed :" + SelectLoanPurpose);
				
				
//TC028
				
				boolean SelectSector = Business_Information_Module.SelectSector();
				ExtentTestManager.startTest("Selected sector displayed" + SelectSector);
				Log.info("Selected sector displayed :" + SelectSector);
				
				//TC029
				
				boolean SelectSubSector = Business_Information_Module.SelectSubSector();
				ExtentTestManager.startTest("Selected Subsector displayed" + SelectSubSector);
				Log.info("Selected Subsector displayed :" + SelectSubSector);
				
				//TC030
				
				boolean EnterProductServiceName = Business_Information_Module.EnterProductServiceName(ProductServiceName);
				ExtentTestManager.startTest("Entered Product Service name displayed" + EnterProductServiceName);
				Log.info("Entered Product Service name displayed :" + EnterProductServiceName);
				
				//TC031
				
				boolean ValidateAutoloadedState = Business_Information_Module.ValidateAutoloadedState();
				ExtentTestManager.startTest("Autoloaded state is displayed" + ValidateAutoloadedState);
				Log.info("Autoloaded state is :" + ValidateAutoloadedState);
				
				//TC032
				
				boolean SelectProjectLocation = Business_Information_Module.SelectProjectLocation();
				ExtentTestManager.startTest("Selected Project location is displayed" + SelectProjectLocation);
				Log.info("Selected Project location is :" + SelectProjectLocation);
				
				//TC033
				boolean SelectProjectType = Business_Information_Module.SelectProjectType();	
				ExtentTestManager.startTest("Selected Project type is displayed" + SelectProjectType);
				Log.info("Selected Project tyoe is displyed :" + SelectProjectType);
				
				//TC034
				
				boolean EnterBreakEvenPeriod = Business_Information_Module.EnterBreakEvenPeriod(BreakEvenPeriod);
				ExtentTestManager.startTest("Period is displayed" + EnterBreakEvenPeriod);
				Log.info("Period is displyed :" + EnterBreakEvenPeriod);
				
				//TC035 
				
				boolean SelectTentativeDate = Business_Information_Module.SelectTentativeprojectDate();
				ExtentTestManager.startTest("selected date displayed" + SelectTentativeDate);
				Log.info("Selected Date displyed :" + SelectTentativeDate);
				
				
				//TC036
				
				boolean EnterProjectImplemenationPeriod = Business_Information_Module.EnterProjectImplementaionPeriod(ProjectImplementationPeriodInMonths);
				ExtentTestManager.startTest("Entered period displayed" + EnterProjectImplemenationPeriod);
				Log.info("Entered period displyed :" + EnterProjectImplemenationPeriod);
				
				//TC037
				
				boolean EnterApproxLabourCount = Business_Information_Module.EnterLabourCount(ApproxTotalLabourCount);
				ExtentTestManager.startTest("Entered Labour count displayed" + EnterApproxLabourCount);
				Log.info("Entered Labour count displyed :" + EnterApproxLabourCount);
				
				//TC038
				
				boolean SelectContractorDepartment = Business_Information_Module.SelectContractorDepartment();
				ExtentTestManager.startTest("Selected Department displayed" + SelectContractorDepartment);
				Log.info("Selected Department displyed :" + SelectContractorDepartment);
				
				
				//TC039
				
				boolean SelectContractorClassification = Business_Information_Module.SelectContractorClassification();
				ExtentTestManager.startTest("Selected classification displayed" + SelectContractorClassification);
				Log.info("Selected classification displyed :" + SelectContractorClassification);
				
				//TC040
				
				boolean EnterDocketNumber = Business_Information_Module.EnterDocketNumber(DocketNumber);
				ExtentTestManager.startTest("Docket Number displayed" + EnterDocketNumber);
				Log.info("Docket Number  displyed :" + EnterDocketNumber);
				
				
				//TC041
				
				boolean EntertreasuryReleaseDate = Business_Information_Module.EnterTreasuryReleaseDate(TreasuryReleaseDate);
				ExtentTestManager.startTest("Date displayed" + EntertreasuryReleaseDate);
				Log.info("Date  displyed :" + EntertreasuryReleaseDate);
				
				//TC042
				
				boolean SelectProjectLand = Business_Information_Module.SelectProjectLand();
				ExtentTestManager.startTest("Selected Project Land displayed" + SelectProjectLand);
				ExtentTestManager.getTest().log(Status.PASS, "Owned land selected" + SelectProjectLand );
				Log.info("Selected Project Land  displyed :" + SelectProjectLand);
				
				//TC043
				
				boolean ProductionCapacity = Business_Information_Module.EnterProductionCapacity(ProductionCapacityQuantityPerAnnumTest);
				ExtentTestManager.startTest("Entered Capacity displayed" + ProductionCapacity);
				ExtentTestManager.getTest().log(Status.PASS , "Entered Capacity displayed" + ProductionCapacity);
				Log.info("Entered Capacity displayed :" + ProductionCapacity);
				
				//TC044
				
				boolean SelectPollutionCategory = Business_Information_Module.SelectPollutionCategory();
				ExtentTestManager.startTest("Selected pollution category displayed" + SelectPollutionCategory);
				ExtentTestManager.getTest().log(Status.PASS , "Selected pollution category displayed" + SelectPollutionCategory);
				Log.info("Selected pollution category displayed :" + SelectPollutionCategory);

				
				//TC045
				
				boolean SelectrojectNature = Business_Information_Module.SelectProjectNature();
				ExtentTestManager.startTest("Selected Project Nature displayed" + SelectrojectNature);
				ExtentTestManager.getTest().log(Status.PASS , "Selected Project Nature displayed" + SelectrojectNature);
				Log.info("Selected Project Nature displayed :" + SelectrojectNature);
				
				//TC046
				
				boolean SelectYESforfirstcharge = Business_Information_Module.SelectYESforFirstcharge();
				ExtentTestManager.startTest("Selected YES displayed" + SelectYESforfirstcharge);
				ExtentTestManager.getTest().log(Status.PASS , "Selected YES displayed" + SelectYESforfirstcharge);
				Log.info("Selected YES displayed :" + SelectYESforfirstcharge);
				
				//TC047
				
				
				boolean SelectYESforExclusivefirstcharge = Business_Information_Module.SelectYESforExclusiveFirstcharge();
				ExtentTestManager.startTest("Selected YES displayed" + SelectYESforExclusivefirstcharge);
				ExtentTestManager.getTest().log(Status.PASS , "Selected YES displayed" + SelectYESforExclusivefirstcharge);
				Log.info("Selected YES displayed :" + SelectYESforExclusivefirstcharge);
				
				//TC048
				boolean SelectYesforExistingAsset = Business_Information_Module.ExistingAsset();
				ExtentTestManager.startTest("Selected YES displayed" + SelectYesforExistingAsset);
				ExtentTestManager.getTest().log(Status.PASS , "Selected YES displayed" + SelectYesforExistingAsset);
				Log.info("Selected YES displayed :" + SelectYesforExistingAsset);
				
				//TC049
				
				boolean SelectCheckboxforTermsandCondition = Business_Information_Module.CheckboxofTermsandCondition();
				ExtentTestManager.startTest("Checked checkbox displayed" + SelectCheckboxforTermsandCondition);
				ExtentTestManager.getTest().log(Status.PASS , "Checked checkbox displayed" + SelectCheckboxforTermsandCondition);
				Log.info("Checked checkbox displayed :" + SelectCheckboxforTermsandCondition);
				
				//TC050
				
				boolean submit = Business_Information_Module.Submit();
				ExtentTestManager.startTest("Business information submitted" + submit);
				ExtentTestManager.getTest().log(Status.PASS , "Business information submitted" + submit);
				Log.info("Business information submitted :" + submit);
				
				//TC051
				
				boolean successcheck = Business_Information_Module.Submit();
				ExtentTestManager.startTest("Business information Sucessfully submitted" + successcheck);
				ExtentTestManager.getTest().log(Status.PASS , "Business information Sucessfully submitted" + successcheck);
				Log.info("Business information Sucessfully submitted :" + successcheck);
				
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