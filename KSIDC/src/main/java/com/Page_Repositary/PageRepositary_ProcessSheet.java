package com.Page_Repositary;

import org.openqa.selenium.By;


public class PageRepositary_ProcessSheet
{
	
	//Borrower Tab Objects
	public By recoveryIcon= By.xpath("//span[text()='Recovery']/parent::a");
	
	public By dashboardrecoveryIcon=By.xpath("//a[text()=' Recovery Initiate']");
	
	public By pageLoad=By.xpath("//h1[text()='Initiate SARFAESI 13 (4) Process']");
	
	public By clickSarfaesi=By.xpath("//h3[@id='SARFAESI_13_4']/child::a");
	
	public By selectSaecrhOption=By.xpath("//select[@id='criteriaWilfulDefaulter']");
	
	public By searchCIF=By.xpath("//input[@id='customerIDWilfulDefaulter']");
	
	public By clickOnSearch=By.xpath("//span[@class='glyphicon glyphicon-search']");
	
	public By selectSecurity=By.xpath("//div[@class='icheckbox_minimal']/parent::td");
	public By clickOnStart=By.xpath("//button[@id='startwilfuldefalter']");
	public By clickOnDOB=By.xpath("//input[@id='establishmentDate']");
	public By SelectMonthAndYr=By.xpath("//th[@class='datepicker-switch']");
	public By selectYr=By.xpath("(//th[@class='datepicker-switch'])[2]");
	public By enterOfficeAddress=By.xpath("//textarea[@id='offAddress']");
	public By enterCommAddress=By.xpath("//textarea[@id='commAddress']");
	public By enterPerAddess=By.xpath("//textarea[@id='perAddress']");
	public By enterSecAddress=By.xpath("//textarea[@id='secAddress']");
	public By clickOnGuarantor=By.xpath("//input[@id='addNewGuarantor']");
	public By enterId=By.xpath("//input[@id='guarIdNew']");
	public By enterGurName=By.xpath("//input[@name='guarNameNew']");
	public By enterCommuAddress=By.xpath("//textarea[@id='guarantorAddNew']");
	public By enterpermAddress=By.xpath("//textarea[@id='guarantorPerAddNew']");
	public By enterOffcAddress=By.xpath("//textarea[@id='guarantorOffAddNew']");
	public By clickAccount=By.xpath("//select[@id='guarAccNew']");
	public By clickOnOutside=By.xpath("//h5[text()='Add New Guarantor']");
	public By clickOnAdd=By.xpath("//button[@id='btnAddGuar']");
	public By clickOnSaveNext=By.xpath("//a[text()='Save and Next']");
	
	//Account Tab Objects
	public  By clickOnSancEdit=By.xpath("//i[@class='fa fa-edit accSancData']");
	public  By enterSancRefNo=By.xpath("//input[@id='sancRefNo']");
	public  By enterSancDisbAmt=By.xpath("//input[@id='disbursementAmount']");
	public  By clickOnSaveButton=By.xpath("//button[@id='saveAccSancDataBtn']");
//	public  By SelectMonthAndYr=By.xpath("//th[@class='datepicker-switch']");
//	public  By selectYr=By.xpath("(//th[@class='datepicker-switch'])[2]");
	public By clickOnSancDistDate=By.xpath("//input[@id='disbursementDt']");
	//public By clickOnSaveButton=By.xpath("//button[@id='saveAccSancDataBtn']");
//	public By SelectMonthAndYr=By.xpath("//th[@class='datepicker-switch']");
//	public By selectYr=By.xpath("(//th[@class='datepicker-switch'])[2]");
	
	//Account Details
	public By clickOnAccountDetails=By.xpath("//i[@class='fa fa-edit accBasData']");
	public By clickOnDpnDate=By.xpath("//input[@name='accBasicDpn']");
	public By enterPurposeofAdvance=By.xpath("//input[@id='accBasicPurpose']");
	public By enterNpaReason=By.xpath("//textarea[@name='accBasicNpaReason']");
	public By selectFacilityDate=By.xpath("//input[@name='facilityAgreeDt']");
	public By selectAODDate=By.xpath("//input[@name='accBasicAod']");
	public By clickOnSAVEButton=By.xpath("//button[@id='saveAccBasicDataBtn']");
	public By selectOutsatndingdate=By.xpath("//input[@id='outstandingAson']");
	public By selectDateoffurtherDate=By.xpath("//input[@id='furtherIntDt']");
	public By clickforScroll=By.xpath("//i[@class='fa fa-edit accPosData']");
	public By clickSaveNext=By.xpath("//a[text()='Save and Next']");
	public By clickBankingArrangements=By.xpath("//select[@id='bankingArrang']");
	public By clickOnBG=By.xpath("//select[@id='bgLcAvailable']");
}
