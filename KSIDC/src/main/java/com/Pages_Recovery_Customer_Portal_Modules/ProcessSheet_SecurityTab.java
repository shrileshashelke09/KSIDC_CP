package com.Pages_Recovery_Customer_Portal_Modules;

import org.openqa.selenium.By;

import com.BasePackage.Base_Class;

public class ProcessSheet_SecurityTab extends Base_Class
{

	private static By clickOnSecurityEdit=By.xpath("//i[@class='fa fa-edit secData']");
	private static By entercersaiId=By.xpath("//input[@id='cersaiId']");
	private static By enterSecurityDesc=By.xpath("//textarea[@id='secDesc']");
	private static By clickSecurityType=By.xpath("//select[@id='secType']");
	private static By clickOnSaveButton=By.xpath("//button[@id='saveAccSancDataBtn']");
	private static By SelectMonthAndYr=By.xpath("//th[@class='datepicker-switch']");
	private static By selectYr=By.xpath("(//th[@class='datepicker-switch'])[2]");
	
			//select[@id='secType']/option[contains(text(),'Pledge')]
			
			//input[@id='secLastDateOfInsp']
			//input[@id='secMarketibility']
			//select[@id='secComment']//select[@id='secComment']/option[contains(text(),'Security Available with Bank')]
			//button[@id='saveSecDataBtn']
	

	public boolean AddAccountDetailsTab(String CersaiID, String SecurityDesc, String securityType, String purpose, String NPAReason
			, String FacilityYear, String FacilityMonth, String FacilityDay, String AODYear, String AODMonth, String AODDay)throws InterruptedException
	{
		click(clickOnSecurityEdit);
		Thread.sleep(1000);
		input(entercersaiId, CersaiID);
		input(enterSecurityDesc, SecurityDesc);
		Thread.sleep(1000);
		click(clickSecurityType);
		click(By.xpath("//select[@id='secType']/option[contains(text(),'"+securityType+"')]"));
		Thread.sleep(1000);
		
		
		return true;
	}
	
			
}
