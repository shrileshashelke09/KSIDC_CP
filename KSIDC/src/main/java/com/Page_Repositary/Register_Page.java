package com.Page_Repositary;

import org.openqa.selenium.By;

public class Register_Page {

	public By RegisterButton = By.xpath("(//button[text()='Register'])[2]");

	public By popupheadline = By.xpath("//h3[normalize-space()='Enter Your Mobile Number']");

	public By MobileNumField = By.xpath("//label[normalize-space()='Mobile Number']");

	public By AsteriskMark = By.xpath("(//label[@class='form-label input-main-label required-star'])[3]");

	public By SendVerificationCode = By
			.xpath("//div[@id='register-Modal']//button[@type='submit'][normalize-space()='Send Verification Code']");

	public By CloseButton = By.xpath("(//button[@class='button round-button round-bg-none'])[2]");

	public By MobileNumber = By.xpath("//input[@placeholder='Mobile Number']");

	public By MandatoryValidation = By.xpath("//div[@class='rz-message rz-messages-error ']");

	public By EnterOTP = By.xpath("(//input[@placeholder='XXXX'])[1]");

	public By ThreeattempforOTP = By.xpath("//*[@id=\"mobileValidate-Modal\"]/div/div/form/div/div[1]/span/div");

	public By VerifyOTP = By.xpath("(//button[@class=' w-100 button primary btn-medium'])[2]");

	public By OTPExpired = By.xpath("//*[@id=\"mobileValidate-Modal\"]/div/div/form/div/div[1]/span/div");

	public By InvalidOTP = By.xpath("//*[@id=\"mobileValidate-Modal\"]/div/div/form/div/div[1]/div");

	public By OTPRequired = By.xpath("//div[@class='rz-message rz-messages-error ']");

	public By Emailheadline = By.xpath("//div[@id='email-Modal']//h3[contains(text(),'Enter Your Email')]");

	public By EmailField = By.xpath("(//label[@class='form-label input-main-label required-star'])[5]");

	public By EmailAddress = By.xpath("(//input[@placeholder='Email Address'])[2]");

	public By SendOTPforEMAIL = By.xpath("(//button[@class='w-100 button primary btn-medium'])[2]");

	public By CloseEmailpopup = By.xpath("(//button[@class='button round-button round-bg-none'])[4]");

	public By EnterOTPheadline = By.xpath("(//h3[normalize-space()='Enter Your OTP'])[2]");

	public By VerificationCodeheadlineEmail = By.xpath("(//label[normalize-space()='Verification Code'] )[2]");

	public By OTPfield = By.xpath("(//input[@name='EmailOTP'])[1]");

	public By SubmitOTPofEmail = By.xpath("(//button[@class=' w-100 button primary btn-medium'])[3]");

	public By invalidOTPError = By.xpath(
			"//div[@id='emailValidate-Modal']//div[contains(@class,'rz-message rz-messages-error')][normalize-space()='Invalid OTP. You have 3 more attempt(s) left.']");

	public By ExpiredOTPError = By.xpath(
			"//div[@id='emailValidate-Modal']//div[contains(@class,'rz-message rz-messages-error')][normalize-space()='OTP has expired.Please re-send']");

	public By Chiefnamefield = By.xpath("//label[normalize-space()='Chief Promoter Full Name']");

	public By PANField = By.xpath("//label[normalize-space()='Company PAN']");
	
	public By Chiefname = By.xpath("//input[@placeholder='Enter chief promoter full name']");
	
	public By PANno = By.xpath("//input[@placeholder='Enter Company PAN']");
	
	public By OutsideElement = By.xpath("//label[normalize-space()='Company PAN']");
	
	public By submitdetails = By.xpath("(//button[@type='submit'])[6]");
	
	public By Submitforpassword = By.xpath("(//button[@type='submit'])[7]");
	
	public By Passwordrequired = By.xpath("(//div[@class='rz-message rz-messages-error '])[1]");
	
	public By ConfirmPasswordRequired = By.xpath("(//div[@class='rz-message rz-messages-error '])[2]");
	
	public By EnterPassword = By.xpath("(//input[@placeholder='Password'])[2]");
	
	public By PasswordcriteriaError = By.xpath("(//div[@class='rz-message rz-messages-error '])[1]");
	
	public By Clicktocontinuepassword = By.xpath("(//button[@class=' w-100 button primary btn-medium'])[5]");
	
	public By  EnterConfirmPassword = By.xpath("//input[@placeholder='Confirm Password']");
	
	public By Passworddoesnotmatcherror = By.xpath("//div[@class='rz-message rz-messages-error ']");
	
	public By Greenmark = By.xpath("//img[@alt='success animation']");
	
	public By AccountCreated = By.xpath("//span[@class='d-flex text-center py-4']");
	
}
