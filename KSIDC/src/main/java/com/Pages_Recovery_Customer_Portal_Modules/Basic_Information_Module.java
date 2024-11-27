package com.Pages_Recovery_Customer_Portal_Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Basic_Information;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class Basic_Information_Module extends Base_Class {

	Basic_Information Basic_Information = new Basic_Information ();
	
	
	//TC001
	
		public boolean Login (String EnterEmailAddress , String EnterPassword) throws InterruptedException {

		click(Basic_Information.LoginButton);
		Log.info("Login button Clicked" + Basic_Information.LoginButton );
		Thread.sleep(2000);
		input(Basic_Information.EnterEmailAddress , EnterEmailAddress);
		Log.info(EnterEmailAddress);
		Thread.sleep(2000);
		input(Basic_Information.EnterPassword ,EnterPassword);
		Log.info(EnterPassword);
		click(Basic_Information.ClicktoLogin);
		Log.info("Login button clickd" + Basic_Information.ClicktoLogin);
			
			return true;
			
		}
		
		//TC002 //TC003 //TC004
		
		public boolean BasicInformationPageAccessibility () throws InterruptedException {
			
			click(Basic_Information.ContinueButton);
			Thread.sleep(1000);
			return true;
			
		}
		
		//TC005
		
		public boolean BasicInfoHeader () {
			
			ElementDisplayed (Basic_Information.BasicInfoHeader);
			Log.info("Basic Information Header Displayed" + Basic_Information.BasicInfoHeader);
			return true;
			
		}
		
		//TC006
		
		
		public boolean MSMERadioVisibility () {
			
			ElementDisplayed (Basic_Information.MSMERadioButton);
			Log.info("MSME Radio button displayed" + Basic_Information.MSMERadioButton);
			return true;
		}
		
		//TC007
		
		public boolean YESNOToggleforMSME () throws InterruptedException {
			
			
			click(Basic_Information.YESforMSME);
			Thread.sleep(2000);
			Log.info("Yes toggle clicked" + Basic_Information.YESforMSME);
			click(Basic_Information.NOforMSME);
			Thread.sleep(2000);
			Log.info("NO toggle clicked" + Basic_Information.NOforMSME);
			return true;
		}
		
		//TC009
		
		public boolean SelectYesforMSME () throws InterruptedException {
			click(Basic_Information.YESforMSME);
			Log.info("Clicked on Yes toggle for MSME");
			Thread.sleep(2000);
			return true;
			
		}
		 //TC015
		public boolean EnterandVerifyUdyamNo (String UdyamNo) throws InterruptedException {
			
			ScrollUntilElementVisible(Basic_Information.MSMERadioButton);
			Thread.sleep(1000);
			ElementDisplayed(Basic_Information.UdyamNo);
			Log.info("Udyam No data field displayed" + Basic_Information.UdyamNo);
			input(Basic_Information.UdyamNo , UdyamNo);
			Log.info(UdyamNo);
			Thread.sleep(3000);
			Log.info("Udyam no verified" + Basic_Information.VerifyUdyamNo);
			if(ElementDisplayed(Basic_Information.VerifyUdyamNo)) {
				click(Basic_Information.VerifyUdyamNo);
				Log.info("CLicked");
				ElementToBeVisible(Basic_Information.Verified);
				Log.info("Verified");
				Thread.sleep(3000);
			}
			else {
				Log.info("Check Not Visible");
			}
		
			return true;
		
		}
		
		@SuppressWarnings("unlikely-arg-type")
		public boolean ValidateNameOfEnterprises () throws InterruptedException {
			
			WebElement AutoloadedEnterprisesName = driver.findElement(By.xpath("//input[@placeholder='Name Of Enterprise']"));
			System.out.println("Autoloaded Enterprises name displayed" + AutoloadedEnterprisesName.getAttribute("title"));
			if(AutoloadedEnterprisesName.equals("M/S 3 IDEA TECHNOLOGY LLP")) {
				 boolean flag1=ElementDisplayed(Basic_Information.NameofEnterprises);
				 ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);
				Log.info("frefx4s : " + false);
				return flag1;
			 }
			 else {
				 Thread.sleep(1000);
			 }
			
			return true;
		}
		
		@SuppressWarnings("unlikely-arg-type")
		public boolean ValidateTypeOfOrganization () throws InterruptedException {
			
			WebElement AutoloadedOrganizationType = driver.findElement(By.xpath("//div[@class='rz-dropdown rz-state-disabled valid rz-clear form-select select-main']"));
			System.out.println("Autoloaded Type of organization displayed" + AutoloadedOrganizationType.getAttribute("title"));
			
			if(AutoloadedOrganizationType.equals("Business Entities Created by Statute") ) {
				boolean flag1 = ElementDisplayed(Basic_Information.TypeOfOrganization);
				ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);
				Log.info("frefx4s : " + false);
				return flag1;
			}
			else {
				
				Thread.sleep(1000);
			}
			return true;
		}
		
		public boolean SelectClassofActivity () throws InterruptedException {
			
			
			ElementDisplayed(Basic_Information.ClassofActivity);
			Log.info("Class of Activity data field displayed" + Basic_Information.ClassofActivity);
			click(Basic_Information.ClassofActivity);
			Log.info("Dropdown displayed" + Basic_Information.ClassofActivity);
			Thread.sleep(1000);
			click(Basic_Information.SelectClassofActivity);
			return true;
		}
}
