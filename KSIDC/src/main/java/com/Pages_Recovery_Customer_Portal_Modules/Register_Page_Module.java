package com.Pages_Recovery_Customer_Portal_Modules;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Register_Page;
import com.Utility.Log;

public class Register_Page_Module extends Base_Class {

	Register_Page Register_Page = new Register_Page();

//TC003
	public boolean RegisterDisplayed() {

		ElementDisplayed(Register_Page.RegisterButton);

		Log.info("Registratin button visible" + Register_Page.RegisterButton);

		return true;

	}

//TC004
	public boolean ClickRegistration() throws InterruptedException {

		click(Register_Page.RegisterButton);
		Log.info("Register Button Clicked" + Register_Page.RegisterButton);
		return true;
	}

//TC012
	public boolean PopupHeadlineMOB() {

		ElementDisplayed(Register_Page.popupheadline);
		Log.info("Headline is Enter Your Mobile Number" + Register_Page.popupheadline);
		return true;
	}

//TC014
	public boolean MobileMumField() {

		ElementDisplayed(Register_Page.MobileNumField);
		Log.info("Mobile number field visible" + Register_Page.MobileNumField);
		return true;
	}

//TC015
	public boolean AsteriskMarkVisibleMOB() {

		ElementEnableOrDisable(Register_Page.AsteriskMark);
		Log.info("Asterisk Mark Visible" + Register_Page.AsteriskMark);
		return true;
	}

//TC016
	public boolean SendVerificationCodeMob() {

		ElementDisplayed(Register_Page.SendVerificationCode);

		Log.info("Send verification Button visible" + Register_Page.SendVerificationCode);

		return true;
	}

//TC017
	public boolean ClosebuttonvisibilityMob() {

		ElementDisplayed(Register_Page.CloseButton);
		Log.info("Close Button Visible" + Register_Page.CloseButton);
		return true;

	}

	// TC019 & TC025
	public boolean InvalidMobNum(String MobileNumber) throws InterruptedException {

		input(Register_Page.MobileNumber, MobileNumber);
		Log.info("Invalid Mobile Number" + Register_Page.MobileNumber);

		return false;
	}
	// TC020

	public boolean EmptymobileNum() {

		ElementDisplayed(Register_Page.MandatoryValidation);
		Log.info("Mobile Number Required is displayed" + Register_Page.MandatoryValidation);

		return true;

	}

	public boolean EmptyOTPMob(String VerificationCode) throws InterruptedException {
		input(Register_Page.EnterOTP, VerificationCode);
		Log.info("OTP Required" + Register_Page.EnterOTP);
		return true;
	}

	// TC023
	public boolean ClosethepopupMob() throws InterruptedException {

		click(Register_Page.CloseButton);
		Log.info("Window closed" + Register_Page.CloseButton);
		return true;

	}

//TC024
	public boolean ValidMobileNum(String MobileNumber) throws InterruptedException {

		input(Register_Page.MobileNumber, MobileNumber);
		Log.info("Entered Mobile Number" + Register_Page.MobileNumber);
		return true;
	}

	public boolean ClicktosendOTPforMob() throws InterruptedException {

		click(Register_Page.SendVerificationCode);
		Thread.sleep(10000);
		Log.info("send OTP Button clicked" + Register_Page.SendVerificationCode);
		return true;

	}

	// TC029
	public boolean EnterOTPforMob(String VerificationCode) throws InterruptedException {
		// Thread.sleep(10000);
		input(Register_Page.EnterOTP, VerificationCode);
		Log.info("OTP ENtered" + Register_Page.EnterOTP);
		return true;
	}

//TC030
	public boolean InvalidOTPMob(String VerificationCode) throws InterruptedException {
		input(Register_Page.EnterOTP, VerificationCode);
		Log.info("Invalid OTP Entered" + Register_Page.EnterOTP);
		return true;
	}

	// TC030
	public boolean InvalidOTPerrorMob() {

		ElementDisplayed(Register_Page.InvalidOTP);
		Log.info("Invalid OTP displayed" + Register_Page.InvalidOTP);
		return true;
	}

//TC031
	public boolean OTPExpiredMob() {
		ElementDisplayed(Register_Page.OTPExpired);
		Log.info("OTP has expired.Please re-send" + Register_Page.OTPExpired);
		return true;
	}

//TC033
	public boolean WarningOTPMob() {

		ElementDisplayed(Register_Page.ThreeattempforOTP);
		Log.info("Invalid OTP. You have 3 more attempt(s) left" + Register_Page.ThreeattempforOTP);

		return true;
	}

//TC034
	public boolean OTPRequiredMob() {

		ElementDisplayed(Register_Page.OTPRequired);
		Log.info("OTP REquired" + Register_Page.OTPRequired);

		return true;

	}

	public boolean VerifyOTPButton() throws InterruptedException {

		click(Register_Page.VerifyOTP);

		Log.info("Verify OTP clicked" + Register_Page.VerifyOTP);

		return true;
	}

	// TC032 & TC035 & TC036
	public boolean Emailpopupheadline() {

		ElementDisplayed(Register_Page.Emailheadline);
		Log.info("Enter your Email diapled" + Register_Page.Emailheadline);

		return true;
	}

	// TC037
	public boolean EmailField() {

		ElementDisplayed(Register_Page.EmailField);
		Log.info("Email Field visible" + Register_Page.EmailField);

		return true;
	}

//TC039
	public boolean InvalidEmail(String EmailAddress) throws InterruptedException {

		input(Register_Page.EmailAddress, EmailAddress);
		Log.info("Invalid Email Entered : Provide a valid email address" + Register_Page.EmailField);

		return true;
	}
	
	public boolean ValidEmail(String EmailAddress) throws InterruptedException {

		input(Register_Page.EmailAddress, EmailAddress);
		Log.info(" Email Entered " + Register_Page.EmailField);

		return true;
	}

	// TC040
	public boolean EmptyEmailID(String EmailAddress) throws InterruptedException {
		input(Register_Page.EmailAddress, EmailAddress);
		Log.info("Email address required" + Register_Page.EmailField);

		return true;
	}

	// TC043
	public boolean closeemailpopup() throws InterruptedException {

		click(Register_Page.CloseEmailpopup);

		Log.info("Email popup closed" + Register_Page.CloseEmailpopup);

		return true;
	}
//TC044

	public boolean VerificationCodeHeadlineEmail() {

		ElementDisplayed(Register_Page.VerificationCodeheadlineEmail);
		Log.info("VerificationCodeHeadlineEmail displayed" + Register_Page.VerificationCodeheadlineEmail);
		return true;
	}

//TC045
	public boolean EnterOTPHeadline() {

		ElementDisplayed(Register_Page.EnterOTPheadline);
		Log.info("Enter Your OTP Headline displayed ");
		return true;
	}

//TC046
	public boolean EnterOTPforEMail(String OTPfield) throws InterruptedException {
		input(Register_Page.OTPfield, OTPfield);
		// Thread.sleep(10000);
		Log.info("OTP Entered" + Register_Page.OTPfield);

		return true;
	}

	// TC047
	public boolean InvaliOTPErrorEmail() {

		ElementDisplayed(Register_Page.invalidOTPError);
		Log.info("Invalid OTP. You have 3 more attempt(s) left." + Register_Page.invalidOTPError);
		return true;
	}

	// TC048
	public boolean ExpiredOTPErrorEmail() {

		ElementDisplayed(Register_Page.ExpiredOTPError);
		Log.info("OTP has expired.Please re-send" + Register_Page.ExpiredOTPError);
		return true;
	}

	// TC049
	public boolean ClicktosendOTPforEmail() throws InterruptedException {
		click(Register_Page.SendOTPforEMAIL);
		Thread.sleep(10000);
		Log.info("Send OTP button clicked for Email" + Register_Page.SendOTPforEMAIL);
		return true;
	}

	// TC049

	public boolean SubmitOTPofEmail() throws InterruptedException {
		// Thread.sleep(20000);
		click(Register_Page.SubmitOTPofEmail);
		Log.info("Verify the OTP" + Register_Page.SubmitOTPofEmail);

		return true;
	}

	//TC050
	public boolean testChiefPromoterFullNameFieldPresence() {

		ElementDisplayed(Register_Page.Chiefnamefield);
		Log.info("Chief Promoters Full Name' field is displayed" + Register_Page.Chiefnamefield);
		return true;
	}

	public boolean testCompanyPANFieldPresence() {

		ElementDisplayed(Register_Page.PANField);
		Log.info("Company PAN field is not present" + Register_Page.PANField);
		return true;
	}

	//TC051
	
	public boolean EnterPANno (String PANno) throws InterruptedException {
		
		input ( Register_Page.PANno ,PANno );
		Log.info("PAN no entered" + Register_Page.PANField);
		return true;
		
	}
	
	public boolean ClickOutside () throws InterruptedException {
		
		click(Register_Page.OutsideElement);
		Log.info("Clicked outside" +Register_Page.OutsideElement );
		return true;
	}
	public boolean EnterChiefname ( String Chiefname) throws InterruptedException {
		
		input(Register_Page.Chiefname ,Chiefname );
		Log.info(Chiefname);
		
		return true;
	}
	
	//TC052
	
	public boolean Clickonsubmit () throws InterruptedException {
		
		click(Register_Page.submitdetails );
		Log.info("Click on submit" + Register_Page.submitdetails);
		return true;
	}
	
	//TC053
	
	public boolean ClickSubmitofpassword () throws InterruptedException {
		
		click(Register_Page.Submitforpassword);
		Log.info("Error display for password required" +Register_Page.Submitforpassword );
		ElementDisplayed(Register_Page.Passwordrequired);
		Log.info("Password is required" + Register_Page.Passwordrequired);
		ElementDisplayed(Register_Page.ConfirmPasswordRequired);
		Log.info("Confirm Password required" + Register_Page.ConfirmPasswordRequired);
		
		return true;
	}
	
	//TC055
	
	public boolean Passwordcriteriawrong (String EnterPassword , String EnterConfirmPassword) throws InterruptedException {
		
		input (Register_Page.EnterPassword , EnterPassword);
		Log.info(EnterPassword);
		
		//TC056
		input (Register_Page.EnterConfirmPassword , EnterConfirmPassword);
		Log.info(EnterConfirmPassword);
		
		
		click(Register_Page.Clicktocontinuepassword);
		Log.info("Clicked on Continue button" + Register_Page.Clicktocontinuepassword);
		
		//TC056
		ElementDisplayed(Register_Page.Passworddoesnotmatcherror);
		Log.info("Password Does not match" + Register_Page.Passworddoesnotmatcherror);
		
		//TC055
		ElementDisplayed(Register_Page.PasswordcriteriaError);
		Log.info("Password does not meet policy requirements" + Register_Page.PasswordcriteriaError );
		return true;
		
	}
	
	// TC057
	
	public boolean AccountSuccessfullyCreated (String EnterPassword , String EnterConfirmPassword) throws InterruptedException {
		
		input(Register_Page.EnterPassword ,EnterPassword );
		input(Register_Page.EnterConfirmPassword ,EnterConfirmPassword);
		click(Register_Page.Clicktocontinuepassword);
		Log.info(EnterPassword);
		Log.info(EnterConfirmPassword);
		Log.info("Continue button clicked");
		ElementDisplayed(Register_Page.Greenmark);
		ElementDisplayed(Register_Page.AccountCreated);
		return true;
	}
}
