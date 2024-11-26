package com.test.user.Recovery;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Pages_Recovery_Customer_Portal_Modules.Register_Page_Module;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Registration_Process_AllScenarios extends Base_Class {

	com.Utility.ExcelReader ExcelReader;
	Base_Class Base_Class;
	Log log;
	TestListener TestListener;
	com.Utility.ScreenShot screenShot;
	Register_Page_Module Register_Page_Module;

	@BeforeSuite
	public void reference() {
		ExcelReader = new com.Utility.ExcelReader("KSIDC_Registration");
		log = new Log();
		TestListener = new TestListener();
		screenShot = new com.Utility.ScreenShot(null);
		Base_Class = new Base_Class();
		Register_Page_Module = new Register_Page_Module();

	}

	@Test(dataProvider = "TestData4")
	public void RUNALL(Map<Object, Object> testdata, ITestContext context) throws IOException, InterruptedException {

		try {

			if (testdata.get("Run").toString().equalsIgnoreCase("Yes")) {
				// TC_BAC_Login_Positive case
				ExtentTestManager.startTest(testdata.get("TestScenario").toString());
				Log.info("*** Running test method " + testdata.get("TestScenario").toString() + "...");
				context.setAttribute("fileName", "RegistrationButton");
				Base_Class.SetUp();

				ExtentTestManager.getTest().log(Status.PASS,
						"Registration button visibility" + com.BasePackage.Base_Class.Pagetitle);
				Log.info("Button visible !");
				Thread.sleep(3000);

				String MobileNumber = testdata.get("MobileNumber").toString();
				//String VerificationCode = testdata.get("VerificationCode").toString();
				String EmailAddress = testdata.get("EmailAddress").toString();
				String CompanyPAN = testdata.get("CompanyPAN").toString();
				String ChiefPromoterFullName = testdata.get("ChiefPromoterFullName").toString();
				String Password = testdata.get("Password").toString();
				String ConfirmPassword = testdata.get("ConfirmPassword").toString();


				ExtentTestManager.startTest("TestScenario01 : Register button visible");
				Thread.sleep(3000);
				// TC003
				boolean registerButton = driver.findElement(By.xpath("(//button[text()='Register'])[2]")).isDisplayed();

				ExtentTestManager.getTest().log(Status.PASS,
						"Validated Registration button visibility : " + registerButton);
				Log.info("Validated Registration button visibility : " + registerButton);
				// TC004
				boolean clickbutton = Register_Page_Module.ClickRegistration();

				ExtentTestManager.getTest().log(Status.PASS, "Registration button clicked : " + clickbutton);
				Log.info("Registration button clicked : " + clickbutton);

				// TC012
				boolean popupheadline = Register_Page_Module.PopupHeadlineMOB();

				ExtentTestManager.getTest().log(Status.PASS, "Pop Up headline displayed : " + popupheadline);
				Log.info("Headline is Enter Your Mobile Number : " + popupheadline);

				// TC014
				boolean Mobilenumfield = Register_Page_Module.MobileMumField();

				ExtentTestManager.getTest().log(Status.PASS, "Mobile number field is displayed : " + Mobilenumfield);
				Log.info("Mobile number field is displayed : " + Mobilenumfield);
				// TC015
				boolean AstriskMark = Register_Page_Module.AsteriskMarkVisibleMOB();

				ExtentTestManager.getTest().log(Status.PASS, "Mobile number field is displayed : " + AstriskMark);
				Log.info("Mobile number field is displayed : " + AstriskMark);

				// TC016
				boolean SendVerificationCode = Register_Page_Module.SendVerificationCodeMob();

				ExtentTestManager.getTest().log(Status.PASS,
						"SendVerificationCode button is displayed : " + SendVerificationCode);
				Log.info("SendVerificationCode button is displayed : " + SendVerificationCode);

				// TC017
				boolean CloseButton = Register_Page_Module.ClosebuttonvisibilityMob();

				ExtentTestManager.getTest().log(Status.PASS, "close button is displayed : " + CloseButton);
				Log.info("close button is displayed : " + CloseButton);
				// TC019 & TC025

//				boolean InvalidMobilenum = Register_Page_Module.InvalidMobNum(MobileNumber);
//				ExtentTestManager.getTest().log(Status.PASS,
//						"Invalid Mobile Number" + " is displayed : " + InvalidMobilenum);
//				Log.info("Invalid Mobile Number error showing : " + InvalidMobilenum);

				// TC020
//				boolean EmptyMobNum = Register_Page_Module.EmptymobileNum();
//				ExtentTestManager.getTest().log(Status.PASS,
//						"Send Verification Button clicked" + " is displayed : " + EmptyMobNum);
//				Log.info("Mobile Number  required error showing : " + EmptyMobNum);

				// TC023
//				boolean Closepopup = Register_Page_Module.ClosethepopupMob();
//
//				ExtentTestManager.getTest().log(Status.PASS, "Close icon clicked" + " is displayed : " + Closepopup);
//				Log.info("Close icon clicked and popup got closed : " + Closepopup);

//TC024
				boolean EntervalidMobileNum = Register_Page_Module.ValidMobileNum(MobileNumber);

				ExtentTestManager.getTest().log(Status.PASS,
						"Entered valid Mobile Nummber" + " is displayed : " + EntervalidMobileNum);
				Log.info("Entered valid Mobile Number showing : " + EntervalidMobileNum);

				boolean SendOTPButton = Register_Page_Module.ClicktosendOTPforMob();
				ExtentTestManager.getTest().log(Status.PASS,
						"Send Verification Button clicked" + " is displayed : " + SendOTPButton);
				Log.info("A confirmation message is displayed; code is sent to the mobile number.  : " + SendOTPButton);

				// Get OTP from DB

				MobileNumber = GetMobileNumberOTP(MobileNumber);
				System.out.println("Verification :" + MobileNumber);

				// TC029
				boolean EnterOTP = Register_Page_Module.EnterOTPforMob(MobileNumber);
				ExtentTestManager.getTest().log(Status.PASS, "OTP Entered" + " is displayed : " + EnterOTP);
				Log.info("OTP Entered  : " + EnterOTP);

				// TC030
//				boolean InvalidOTP = Register_Page_Module.InvalidOTPMob(VerificationCode);
//				ExtentTestManager.getTest().log(Status.PASS, "Button clicked" + " is displayed : " + InvalidOTP);
//				Log.info("Button Clicked  : " + InvalidOTP);

				// TC030
//				boolean InvalidOTPError = Register_Page_Module.InvalidOTPerrorMob();
//				ExtentTestManager.getTest().log(Status.PASS,
//						"Invalid OTP. You have 3 more attempt(s) left." + " is displayed : " + InvalidOTPError);
//				Log.info("Invalid OTP. You have 3 more attempt(s) left. : " + InvalidOTPError);

				// TC031
//				boolean OTPExpitederror = Register_Page_Module.OTPExpiredMob();
//				ExtentTestManager.getTest().log(Status.PASS,
//						"OTP has expired.Please re-send" + " is displayed : " + OTPExpitederror);
//				Log.info("OTP has expired.Please re-send  : " + OTPExpitederror);

				// TC033
//				boolean WarningforOTP = Register_Page_Module.WarningOTPMob();
//				ExtentTestManager.getTest().log(Status.PASS,
//						"Invalid OTP. You have 3 more attempt(s) left" + " is displayed : " + WarningforOTP);
//				Log.info("Invalid OTP. You have 3 more attempt(s) left  : " + WarningforOTP);

				// TC034

//				boolean EmptyOTP = Register_Page_Module.EmptyOTPMob(VerificationCode);
//				ExtentTestManager.getTest().log(Status.PASS, "OTP Empty" + " is displayed : " + EmptyOTP);
//				Log.info("OTP Empty  : " + EmptyOTP);

//				boolean OTPRequired = Register_Page_Module.OTPRequiredMob();
//				ExtentTestManager.getTest().log(Status.PASS, "OTP Required" + " is displayed : " + OTPRequired);
//				Log.info("OTP Required  : " + OTPRequired);

				boolean VerifyCode = Register_Page_Module.VerifyOTPButton();
				ExtentTestManager.getTest().log(Status.PASS, "Button clicked" + " is displayed : " + VerifyCode);
				Log.info("Button Clicked  : " + VerifyCode);

				// TC032 & TC035 & TC036

				boolean Emailheadline = Register_Page_Module.Emailpopupheadline();
				ExtentTestManager.getTest().log(Status.PASS, "Email headline" + " is displayed : " + Emailheadline);
				Log.info("Enter Your Email is displayed; code is sent to the mobile number.  : " + Emailheadline);

				// TC037

				boolean EmailField = Register_Page_Module.EmailField();
				ExtentTestManager.getTest().log(Status.PASS, "Email Field" + " is displayed : " + EmailField);
				Log.info("Email field is displayed : " + EmailField);
				
				boolean ValidEmail = Register_Page_Module.ValidEmail(EmailAddress);
				ExtentTestManager.getTest().log(Status.PASS, " Valid Email " + " is displayed : " + ValidEmail);
				Log.info("Entered Email is displayed : " + ValidEmail);
				

				// TC039
//				boolean InvalidEmailID = Register_Page_Module.InvalidEmail(EmailAddress);
//				ExtentTestManager.getTest().log(Status.PASS,
//						"Invalid Email Entered" + " is displayed : " + InvalidEmailID);
//				Log.info("Provide a valid email address displayed : " + InvalidEmailID);

				// TC040
//				boolean EmptyEmail = Register_Page_Module.EmptyEmailID(EmailAddress);
//				ExtentTestManager.getTest().log(Status.PASS,
//						"Email Address Required" + " is displayed : " + EmptyEmail);
//				Log.info("Email Address required : " + EmptyEmail);

				// TC043
//				boolean closeEmailPopup = Register_Page_Module.closeemailpopup();
//				ExtentTestManager.getTest().log(Status.PASS,
//						"Email pop up closed" + " is displayed : " + closeEmailPopup);
//				Log.info("Email pop up closed : " + closeEmailPopup);

				

				boolean SendOTPforEmail = Register_Page_Module.ClicktosendOTPforEmail();
				ExtentTestManager.getTest().log(Status.PASS,
						"send OTP button clicked" + " is displayed : " + SendOTPforEmail);
				Log.info("send OTP button clicked : " + SendOTPforEmail);
				
				// TC044

				boolean VerificationCodeHeadlineEmail = Register_Page_Module.VerificationCodeHeadlineEmail();
				ExtentTestManager.getTest().log(Status.PASS,
						"Verificaion Code headline " + " is displayed : " + VerificationCodeHeadlineEmail);
				Log.info("Verificaion Code headline is showing : " + VerificationCodeHeadlineEmail);

				// TC045
				boolean OTPHeadline = Register_Page_Module.EnterOTPHeadline();
				ExtentTestManager.getTest().log(Status.PASS, "Enter Your OTP" + " is displayed : " + OTPHeadline);
				Log.info("Enter Your OTP is showing : " + OTPHeadline);

				EmailAddress = GetEmailOTP(EmailAddress);
				System.out.println("Verification :" + EmailAddress);

				// TC046
				boolean EnterOTPforEmail = Register_Page_Module.EnterOTPforEMail(EmailAddress);
				ExtentTestManager.getTest().log(Status.PASS, "OTP Entered" + " is displayed : " + EnterOTPforEmail);
				Log.info("Entered OTP is showing : " + EnterOTPforEmail);

				// TC047
//				boolean InvalidOTPerrorcheck = Register_Page_Module.InvalidOTPerrorMob();
//				ExtentTestManager.getTest().log(Status.PASS, "Invalid OTP" + " is displayed : " + InvalidOTPerrorcheck);
//				Log.info("Invalid OTP  : " + InvalidOTPerrorcheck);

				// TC048
//				boolean ExpiredOTPError = Register_Page_Module.ExpiredOTPErrorEmail();
//				ExtentTestManager.getTest().log(Status.PASS,
//						"OTP has expired.Please re-send" + " is displayed : " + ExpiredOTPError);
//				Log.info("OTP has expired.Please re-send : " + ExpiredOTPError);

				// TC049
				boolean SutmitOTPofEMail = Register_Page_Module.SubmitOTPofEmail();
				ExtentTestManager.getTest().log(Status.PASS, "OTP submitted" + " is displayed : " + SutmitOTPofEMail);
				Log.info("submitted OTP is showing : " + SutmitOTPofEMail);

				
				//TC050
				
				boolean ValidateDataFields = Register_Page_Module.testChiefPromoterFullNameFieldPresence();
				ExtentTestManager.getTest().log(Status.PASS, "Field " + " is displayed : " + ValidateDataFields);
				Log.info("Field is showing : " + ValidateDataFields);
				
				boolean ValidateDataFieldsPAN = Register_Page_Module.testCompanyPANFieldPresence();
				ExtentTestManager.getTest().log(Status.PASS, "PAN Field " + " is displayed : " + ValidateDataFieldsPAN);
				Log.info("PAN Field is showing : " + ValidateDataFieldsPAN);
				
				//TC051
				
				boolean EnterPANno = Register_Page_Module.EnterPANno(CompanyPAN);
				ExtentTestManager.getTest().log(Status.PASS, "PAN No " + " is displayed : " + EnterPANno);
				Log.info("Entered PAN No is showing : " + EnterPANno);
				
				boolean ClickOutside = Register_Page_Module.ClickOutside();
				ExtentTestManager.getTest().log(Status.PASS, "Clicked outside " + " is displayed : " + ClickOutside);
				Log.info("Clicked outside : " + ClickOutside);
				
				boolean EnterChiefname = Register_Page_Module.EnterChiefname(ChiefPromoterFullName);
				ExtentTestManager.getTest().log(Status.PASS, "Chief name " + " is displayed : " + EnterChiefname);
				Log.info("Chief name is showing : " + EnterChiefname);
				
				//TC052
				
				boolean ClickonContinue = Register_Page_Module.Clickonsubmit();
				ExtentTestManager.getTest().log(Status.PASS, "Click on continue" + " is displayed : " + ClickonContinue);

				//TC053
				
				boolean Errorofpassword = Register_Page_Module.ClickSubmitofpassword();
				ExtentTestManager.getTest().log(Status.PASS, "Password and confirm password required " + " is displayed : " + Errorofpassword);
				Log.info("Password and confirm password required : " + Errorofpassword);
			
				//TC055
				
//				boolean Passwordnotmeetingcriteria = Register_Page_Module.Passwordcriteriawrong(Password ,ConfirmPassword );
//				ExtentTestManager.getTest().log(Status.PASS, "Password does not meet policy requirements " + " is displayed : " + Passwordnotmeetingcriteria);
//				Log.info("Password does not meet policy requirements : " + Passwordnotmeetingcriteria);
//				
				//TC057
				
				boolean AccountSuccessfullyCreated = Register_Page_Module.AccountSuccessfullyCreated(Password, ConfirmPassword);
				ExtentTestManager.getTest().log(Status.PASS, "Congratulations! Your account has been created successfully. " + " is displayed : " + AccountSuccessfullyCreated);
				Log.info("Congratulations! Your account has been created successfully.: " + AccountSuccessfullyCreated);
				
				
			}

		} catch (Exception e) {

		}
	}

	@AfterSuite

	public void Close() {

		driver.quit();
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
