package com.Pages_Recovery_Customer_Portal_Modules;

import org.openqa.selenium.By;

import com.BasePackage.Base_Class;
import com.Page_Repositary.PageRepositary_ProcessSheet;

public class ProcessSheet_BorrowerTab extends Base_Class 
{

	PageRepositary_ProcessSheet PageRepositary= new PageRepositary_ProcessSheet();
	
	public boolean NavigateToRecoveryDashboard(String searchName, String searchValue) throws InterruptedException
	
	{
		click(PageRepositary.recoveryIcon);
		click(PageRepositary.dashboardrecoveryIcon);
		Thread.sleep(1000);
		click(PageRepositary.clickSarfaesi);
		Thread.sleep(1000);
		click(PageRepositary.selectSaecrhOption);
		Thread.sleep(1000);
		//select("Search Name",selectOption);
		click(By.xpath("//select[@id='criteriaWilfulDefaulter']/option[contains(text(),'"+searchName+"')]"));
		click(PageRepositary.selectSaecrhOption);
		
		input(PageRepositary.searchCIF, searchValue);
		Thread.sleep(1000);
		click(PageRepositary.clickOnSearch);
		Thread.sleep(1000);
		click(By.xpath("//td[@align='center']/a[contains(text(),'"+searchValue+"')]"));
		Thread.sleep(1000);
		click(PageRepositary.selectSecurity);
		Thread.sleep(1000);
		click(PageRepositary.clickOnStart);
		Thread.sleep(2000);
		//clear(enterDOB);
		boolean flag = ElementDisplayed(PageRepositary.pageLoad);
		return flag;
	}
	
	public boolean AddProcessSheetOfBorrowerTab(String year, String month, String day, String officeAddress, String commAddress, String perAddress, 
	String secAddress, String accountNo, String ID, String gurantorName, String commuAddress, String permAddress, String secuAddress) throws InterruptedException
	
	{
		click(PageRepositary.clickOnDOB);
		Thread.sleep(1000);
		click(PageRepositary.SelectMonthAndYr);
		click(PageRepositary.selectYr);
		Thread.sleep(1000);
		click(By.xpath("//span[contains(text(),'"+year+"')]"));
		Thread.sleep(1000);
		click(By.xpath("//span[contains(text(),'"+month+"')]"));
		Thread.sleep(1000);
		click(By.xpath("//td[contains(text(),'"+day+"')]"));
		Thread.sleep(1000);
		clear(PageRepositary.enterOfficeAddress);
		input(PageRepositary.enterOfficeAddress, officeAddress);
		Thread.sleep(1000);
		clear(PageRepositary.enterCommAddress);
		input(PageRepositary.enterCommAddress, commAddress);
		Thread.sleep(1000);
		clear(PageRepositary.enterPerAddess);
		input(PageRepositary.enterPerAddess, perAddress);
		Thread.sleep(1000);
		clear(PageRepositary.enterSecAddress);
		input(PageRepositary.enterSecAddress, secAddress);
		Thread.sleep(1000);
		ScrollUntilElementVisible(PageRepositary.clickOnGuarantor);
		boolean flag1 = ElementDisplayed(PageRepositary.clickOnGuarantor);
		Thread.sleep(1000);
		click(PageRepositary.clickOnGuarantor);
		Thread.sleep(1000);
		click(PageRepositary.clickAccount);
		Thread.sleep(1000);
		click(By.xpath("//select[@id='guarAccNew']/option[contains(text(),'"+accountNo+"')]"));
		Thread.sleep(1000);
		input(PageRepositary.enterId, ID);
		Thread.sleep(1000);
		click(PageRepositary.clickOnOutside);
		Thread.sleep(1000);
		input(PageRepositary.enterGurName, gurantorName);
		Thread.sleep(1000);
		input(PageRepositary.enterCommuAddress, commuAddress);
		Thread.sleep(1000);
		input(PageRepositary.enterpermAddress, permAddress);
		Thread.sleep(1000);
		ScrollUntilElementVisible(PageRepositary.enterOffcAddress);
		input(PageRepositary.enterOffcAddress, secuAddress);
		Thread.sleep(1000);
		click(PageRepositary.clickOnAdd);
		Thread.sleep(1000);
		AcceptAlert();
		//ScrollUntilElementVisible(PageRepositary.clickOnSaveNext);
		Thread.sleep(1000);
		click(PageRepositary.clickOnSaveNext);
		Thread.sleep(2000);
		//boolean flag = flag1;
		return true;
		//return flag;
		
	}
}
