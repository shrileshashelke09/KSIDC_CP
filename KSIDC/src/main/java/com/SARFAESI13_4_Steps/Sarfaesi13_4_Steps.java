package com.SARFAESI13_4_Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BasePackage.Base_Class;
import com.Page_Repositary.PageRepositary_Steps;

public class Sarfaesi13_4_Steps extends Base_Class 
{

	PageRepositary_Steps PageRepositary= new PageRepositary_Steps();
	
	public boolean NavigateToSARFAESIInbox() throws InterruptedException
	
	{
		ScrollUntilElementVisible(PageRepositary.sarfaesiIcon);
		Thread.sleep(1000);
		click(PageRepositary.sarfaesiIcon);
		Thread.sleep(1000);
		click(PageRepositary.clickOnInboxIcon);
		Thread.sleep(30000);
		WebDriverWait wait = new WebDriverWait(driver,20000);
		wait.until(ExpectedConditions.elementToBeClickable(PageRepositary.pageLoad)).isDisplayed();
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(PageRepositary.pageLoad));
		wait.until(ExpectedConditions.visibilityOfElementLocated(PageRepositary.pageLoad));

		
		Thread.sleep(1000);
		boolean flag1 = ElementDisplayed(PageRepositary.pageLoad);
		
		boolean flag=flag1;
		return flag;
	}
	
	public boolean SearchFunctionality(String searchValue, String taskName, String status, String refNo) throws InterruptedException
	
	{
		Thread.sleep(1000);
		click(PageRepositary.clickOnFileter);
		Thread.sleep(1000);
		click(PageRepositary.selectFilterOption);
		Thread.sleep(1000);
		input(PageRepositary.enterValue, searchValue);
		Thread.sleep(1000);
		click(PageRepositary.clickOnSearch);
		Thread.sleep(20000);
		boolean flag2 = ElementDisplayed(PageRepositary.pageLoad);
		WebElement Expected1 = driver.findElement(By.xpath("//td[2]"));
		String actual= (Expected1.getText());
		System.out.println("getText() method: " + actual);
		if(actual.equals(taskName)) {
			System.out.println("Task Name Passed");
		}
		else {
			System.out.println("Task Name Failed");
		}
		
		//Status Verification
		WebElement Expected2 = driver.findElement(By.xpath("//td[8]"));
		String actual1= (Expected2.getText());
		System.out.println("getText() method: " + actual1);
		if(actual1.equals(status)) {
			System.out.println("Status Passed");
			
		}
		else {
			System.out.println("Status Failed");
		}
		Thread.sleep(2000);
		click(By.xpath("//a[contains(text(),'"+refNo+"')]"));
		Thread.sleep(1000);
		return true;
	}
	
	public boolean SaveStepFunctionality(String nameOfBranch, String location, String comments) throws InterruptedException
	
	{
		ScrollUntilElementVisible(PageRepositary.saveButton);
		Thread.sleep(1000);
		clear(PageRepositary.enterNameOfBranch);
		input(PageRepositary.enterNameOfBranch, nameOfBranch);
		Thread.sleep(1000);
		clear(PageRepositary.enterLocation);
		input(PageRepositary.enterLocation, location);
		Thread.sleep(1000);
		clear(PageRepositary.enterComments);
		input(PageRepositary.enterComments, comments);
		Thread.sleep(1000);
		click(PageRepositary.saveButton);
		Thread.sleep(1000);
		ScrollUntilElementVisible(PageRepositary.backButton);
		boolean flag1 = ElementDisplayed(PageRepositary.backButton);
		Thread.sleep(1000);
		click(PageRepositary.backButton);
		Thread.sleep(30000);
		WebDriverWait wait = new WebDriverWait(driver,20000);
		wait.until(ExpectedConditions.elementToBeClickable(PageRepositary.pageLoad)).isDisplayed();
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(PageRepositary.pageLoad));
		wait.until(ExpectedConditions.visibilityOfElementLocated(PageRepositary.pageLoad));

		boolean flag= flag1;
		return flag;
	}
	
	public boolean SubmitStepFunctionality() throws InterruptedException
	
	{
		ScrollUntilElementVisible(PageRepositary.saveButton);
		Thread.sleep(1000);
		click(PageRepositary.submitButton);
		Thread.sleep(4000);
		return true;
	}
	
	
}
