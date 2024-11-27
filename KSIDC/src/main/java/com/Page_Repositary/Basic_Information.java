package com.Page_Repositary;

import org.openqa.selenium.By;

public class Basic_Information {

    public By LoginButton = By.xpath("(//button[@class='button secondary btn-medium'])[2]");
	
	public By EnterEmailAddress = By.xpath("(//input[@placeholder='Email Address'])[1]");
	
	public By EnterPassword = By.xpath("(//input[@placeholder='Password'])[1]");
	
	public By ClicktoLogin = By.xpath("(//button[@class=' w-100 button primary btn-medium'])[1]");
	
	public By ContinueButton = By.xpath("//button[@class='button primary btn-medium ms-auto']");
		
	public By BasicInfoHeader = By.xpath("//h4[text()='Basic Information']");
	
	public By MSMERadioButton = By.xpath("//div[@class='col-12']");
	
	public By YESforMSME = By.xpath("(//label[@class='rz-radiobutton-label']/parent::div)[1]");
	
	public By NOforMSME = By.xpath("(//label[@class='rz-radiobutton-label']/parent::div)[2]");
	
	public By UdyamNo = By.xpath("//input[@placeholder='UDYAM-XX-00-0000000']");
	
	public By VerifyUdyamNo = By.xpath("(//a[@class='button tertiary inside-btn enabled'])[1]");
	
	public By Verified = By.xpath("(//span[@class='material-symbols-rounded'])[5]");
	
	public By NameofEnterprises = By.xpath("//input[@placeholder='Name Of Enterprise']");
	
	public By TypeOfOrganization = By.xpath("//div[@class='rz-dropdown rz-state-disabled valid rz-clear form-select select-main']");

    public By ClassofActivity = By.xpath("(//label[text()='Class Of Activity']/parent::div)[1]");
    
    public By SelectClassofActivity = By.xpath("//span[text()='ACTIVITIES OF OTHER TRANSPORT AGENCIES']");























}


