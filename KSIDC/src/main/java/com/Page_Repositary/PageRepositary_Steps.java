package com.Page_Repositary;

import org.openqa.selenium.By;

public class PageRepositary_Steps {

	public By sarfaesiIcon= By.xpath("//span[text()='SARFAESI']/parent::a");
	
	public By clickOnInboxIcon=By.xpath("//li[@id='sarfaesiinbox']");
	
	public By clickOnFileter=By.xpath("//button[@id='filterOptionBtn']");
	
	public By pageLoad=By.xpath("//h5[text()='Inbox ']");
	
	public By selectFilterOption=By.xpath("//a[text()='Customer ID']");

	public By enterValue=By.xpath("//input[@id='filterVal']");
	
	public By clickOnSearch=By.xpath("//button[@id='filterBtn']");
	public By enterNameOfBranch=By.xpath("//input[@id='nameOfTheBranchOfficial']");
	public By enterLocation=By.xpath("//textarea[@id='location']");
	public By enterComments=By.xpath("//textarea[@id='userComments']");
	public By saveButton=By.xpath("//button[@id='save']");
	public By backButton=By.xpath("//span[@class='glyphicon glyphicon-arrow-left']/parent::button");
	public By submitButton=By.xpath("//button[@id='sub']");
	
	
	//input[@id='filterVal']
	//a[contains(text(),'SAR134022110279206')]
	
	
}
