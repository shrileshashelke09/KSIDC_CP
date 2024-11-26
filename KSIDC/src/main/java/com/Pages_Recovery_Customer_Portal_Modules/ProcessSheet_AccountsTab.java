package com.Pages_Recovery_Customer_Portal_Modules;

import org.openqa.selenium.By;
import com.BasePackage.Base_Class;
import com.Page_Repositary.PageRepositary_ProcessSheet;

//import com.Pages_Recovery_SARFAESI13_4.PageRepositary;


public class ProcessSheet_AccountsTab extends Base_Class
{
		PageRepositary_ProcessSheet PageRepositary= new PageRepositary_ProcessSheet();
		
		public boolean AddProcessSheetOfAccountTab(String AcSanctionRefNo, String SanctionDisbAmt, String disbYear, String disbMonth, String disbDay)throws InterruptedException
		{
			ScrollUntilElementVisible(PageRepositary.clickSaveNext);
			Thread.sleep(1000);
			click(PageRepositary.clickSaveNext);
			Thread.sleep(1000);
//		    click(PageRepositary.clickOnSancEdit);
//			Thread.sleep(1000);
			clear(PageRepositary.enterSancRefNo);
			input(PageRepositary.enterSancRefNo, AcSanctionRefNo);
			Thread.sleep(1000);
			clear(PageRepositary.enterSancDisbAmt);
			input(PageRepositary.enterSancDisbAmt,SanctionDisbAmt);
			Thread.sleep(1000);
			click(PageRepositary.clickOnSancDistDate);
			Thread.sleep(1000);
			click(PageRepositary.SelectMonthAndYr);
			click(PageRepositary.selectYr);
			Thread.sleep(1000);
			click(By.xpath("//span[contains(text(),'"+disbYear+"')]"));
			Thread.sleep(1000);
			click(By.xpath("//span[contains(text(),'"+disbMonth+"')]"));
			Thread.sleep(1000);
			click(By.xpath("//td[contains(text(),'"+disbDay+"')]"));
			Thread.sleep(1000);
			boolean flag1 = ElementDisplayed(PageRepositary.clickOnSaveButton);
			click(PageRepositary.clickOnSaveButton);
			Thread.sleep(1000);
			//click(PageRepositary.clickSaveNext);
			boolean flag= flag1;
			return flag;
		}
		
		public boolean AddAccountDetailsTab(String DPNYear, String DPNMonth, String DPNDay, String purpose, String NPAReason
				, String FacilityYear, String FacilityMonth, String FacilityDay, String AODYear, String AODMonth, String AODDay)throws InterruptedException
		{
//			ScrollUntilElementVisible(PageRepositary.clickforScroll);
//			Thread.sleep(1000);
//			ScrollUntilElementVisible(PageRepositary.clickOnAccountDetails);
//			Thread.sleep(1000);
//			click(PageRepositary.clickOnAccountDetails);
//			Thread.sleep(1000);
			click(PageRepositary.clickSaveNext);
			Thread.sleep(1000);
			click(PageRepositary.clickOnDpnDate);
			//Thread.sleep(1000);
//			click(SelectMonthAndYr);
//			click(selectYr);
//			Thread.sleep(1000);
//			click(By.xpath("//span[contains(text(),'"+DPNYear+"')]"));
//			Thread.sleep(1000);
//			click(By.xpath("//span[contains(text(),'"+DPNMonth+"')]"));
			//Thread.sleep(1000);
			click(By.xpath("//td[contains(text(),'"+DPNDay+"')]"));
			Thread.sleep(1000);
			input(PageRepositary.enterPurposeofAdvance, purpose);
			Thread.sleep(1000);
			input(PageRepositary.enterNpaReason, NPAReason);
			Thread.sleep(1000);
			click(PageRepositary.selectFacilityDate);
			Thread.sleep(1000);
			click(PageRepositary.SelectMonthAndYr);
			click(PageRepositary.selectYr);
			Thread.sleep(1000);
			click(By.xpath("//span[contains(text(),'"+FacilityYear+"')]"));
			Thread.sleep(1000);
			click(By.xpath("//span[contains(text(),'"+FacilityMonth+"')]"));
			Thread.sleep(1000);
			click(By.xpath("//td[contains(text(),'"+FacilityDay+"')]"));
			Thread.sleep(1000);
			click(PageRepositary.selectAODDate);
			Thread.sleep(1000);
			click(PageRepositary.SelectMonthAndYr);
			click(PageRepositary.selectYr);
			Thread.sleep(1000);
			click(By.xpath("//span[contains(text(),'"+AODYear+"')]"));
			Thread.sleep(1000);
			click(By.xpath("//span[contains(text(),'"+AODMonth+"')]"));
			click(By.xpath("//td[contains(text(),'"+AODDay+"')]"));
			Thread.sleep(1000);
			ScrollUntilElementVisible(PageRepositary.clickOnSAVEButton);
			boolean flag1 = ElementDisplayed(PageRepositary.clickOnSAVEButton);
			Thread.sleep(1000);
			click(PageRepositary.clickOnSAVEButton);
			boolean flag= flag1;
			return flag;
		}
		
		public boolean AddOtherAccountDetailsTab(String OutYear, String OutMonth, String OutDay, String IntrestYear, String IntrestMonth
				, String IntrestDay, String Option1, String BGLCOption)throws InterruptedException
		{
			ScrollUntilElementVisible(PageRepositary.selectOutsatndingdate);
			Thread.sleep(1000);
			click(PageRepositary.selectOutsatndingdate);
			Thread.sleep(1000);
			click(PageRepositary.SelectMonthAndYr);
		    click(PageRepositary.selectYr);
		    Thread.sleep(1000);
		    click(By.xpath("//span[contains(text(),'"+OutYear+"')]"));
		    Thread.sleep(1000);
		    click(By.xpath("//span[contains(text(),'"+OutMonth+"')]"));
		    click(By.xpath("//td[contains(text(),'"+OutDay+"')]"));
		    Thread.sleep(1000);
		    click(PageRepositary.selectDateoffurtherDate);
		    Thread.sleep(1000);
			click(PageRepositary.SelectMonthAndYr);
		    click(PageRepositary.selectYr);
		    Thread.sleep(1000);
		    click(By.xpath("//span[contains(text(),'"+IntrestYear+"')]"));
		    Thread.sleep(1000);
		    click(By.xpath("//span[contains(text(),'"+IntrestMonth+"')]"));
		    click(By.xpath("//td[contains(text(),'"+IntrestDay+"')]"));
		    boolean flag1 = ElementDisplayed(PageRepositary.clickSaveNext);
			Thread.sleep(1000);
			click(PageRepositary.clickBankingArrangements);
			Thread.sleep(1000);
			Boolean OrignalText1 = false;
			try {
			OrignalText1 = driver.findElement(By.xpath("//select[@id='bankingArrang']/option[contains(text(),'" + Option1 + "')]")).isDisplayed();
			} catch (Exception e) {

			}
			System.out.println(OrignalText1);
			if (OrignalText1) {
				System.out.println(OrignalText1 + "if");
				click(By.xpath("//select[@id='bankingArrang']/option[contains(text(),'"+Option1+"')]"));
				Thread.sleep(1000);
				click(PageRepositary.clickBankingArrangements);
				
			}
			else if(OrignalText1){
				System.out.println(OrignalText1 + "elseif");
				click(By.xpath("//select[@id='bankingArrang']/option[contains(text(),'"+Option1+"')]"));
				Thread.sleep(1000);
				click(PageRepositary.clickBankingArrangements);
				
			}
			else {
				System.out.println(OrignalText1 + "elseif");
				click(By.xpath("//select[@id='bankingArrang']/option[contains(text(),'"+Option1+"')]"));
				Thread.sleep(1000);
				click(PageRepositary.clickBankingArrangements);
				
			}
			
			Thread.sleep(1000);
			ScrollUntilElementVisible(PageRepositary.clickOnBG);
			Thread.sleep(1000);
			click(PageRepositary.clickOnBG);
			click(By.xpath("//select[@id='bgLcAvailable']/option[contains(text(),'"+BGLCOption+"')]"));
			Thread.sleep(1000);
			//click(PageRepositary.clickSaveNext);
			boolean flag= flag1;
			return flag;
			//return true;
		    
		}
		
}
