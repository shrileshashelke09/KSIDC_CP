package com.Pages_Recovery_Customer_Portal_Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Business_Information;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;



public class Business_Information_Module extends Base_Class {

	Business_Information Business_Information = new Business_Information ();
	//TC001
	
	public boolean Login (String EnterEmailAddress , String EnterPassword) throws InterruptedException {

	click(Business_Information.LoginButton);
	Log.info("Login button Clicked" + Business_Information.LoginButton );
	Thread.sleep(2000);
	input(Business_Information.EnterEmailAddress , EnterEmailAddress);
	Log.info(EnterEmailAddress);
	Thread.sleep(2000);
	input(Business_Information.EnterPassword ,EnterPassword);
	Log.info(EnterPassword);
	click(Business_Information.ClicktoLogin);
	Log.info("Login button clickd" + Business_Information.ClicktoLogin);
		
		return true;
		
	}
	
	//Logout
	
//	public boolean Logout () throws InterruptedException {
//		
//		click(Business_Information.LoginIdUSer);
//		Thread.sleep(1000);
//		click(Business_Information.LogOut);
//		return true;
//		
//	}
	
	//TC002 
//	public boolean Invalidcredentials(String EnterEmailAddress , String EnterPassword) throws InterruptedException {
//		click(Business_Information.LoginButton);
//		Log.info("Login button Clicked" + Business_Information.LoginButton );
//		Thread.sleep(2000);
//		input(Business_Information.EnterEmailAddress , EnterEmailAddress);
//		Log.info(EnterEmailAddress);
//		Thread.sleep(2000);
//		input(Business_Information.EnterPassword ,EnterPassword);
//		Log.info(EnterPassword);
//		click(Business_Information.ClicktoLogin);
//		Log.info("Login button clickd" + Business_Information.ClicktoLogin);
//		return false;
//	}
	
	
	//TC003
	public boolean EnquiryNowTermLoanKSIDC () throws InterruptedException {
		
		Thread.sleep(1000);
		ScrollUntilElementVisible(Business_Information.Scroll);
		Thread.sleep(3000);
		click(Business_Information.EnquiryNowTermLoanKSIDC);
		Thread.sleep(3000);
		Log.info("Enquiry Now button clicked" + Business_Information.EnquiryNowTermLoanKSIDC);
		return true;
		
	}
	
	//TC004 
	
	public boolean BusinessinfoHeader () {
		
		ElementDisplayed (Business_Information.BusinessinfoHeader);
		Log.info("Business Information Header visible" + Business_Information.BusinessinfoHeader);
		return true;
	}
	
	//TC005 
	
	public boolean Displaynamevisibility(String EnterDisplayname) throws InterruptedException {
		
		ElementDisplayed(Business_Information.Displayname);
		Log.info("Display Name showing" + Business_Information.Displayname);
		Thread.sleep(1000);
		input(Business_Information.EnterDisplayname , EnterDisplayname);
		Thread.sleep(2000);
		Log.info(EnterDisplayname);
		return true;
	}
	
	//TC018
	public boolean SelectInstitutionTypes () throws InterruptedException {
		
		ElementDisplayed(Business_Information.InstitutionTypes);
		Thread.sleep(1000);
		Log.info("Istitution type data field displayed" + Business_Information.InstitutionTypes);
		click(Business_Information.CLickonInstitutionTypes);
		Thread.sleep(2000);
		Log.info("CLicked on Indtitution Type Dropdown" + Business_Information.CLickonInstitutionTypes);
		click(Business_Information.SelectoptionforInstitutionTypes );
		Thread.sleep(1000);
		Log.info("Selected optionfor Institution Types is displaed " +Business_Information.SelectoptionforInstitutionTypes );
		return true;
	}
	
	
		public boolean selectScheme () throws InterruptedException {
			ElementDisplayed(Business_Information.Schemedatafield);
			Log.info("Scheme data field displayed" + Business_Information.Schemedatafield);
			click(Business_Information.ClickonSchemedatafield);
			Thread.sleep(2000);
			Log.info("CLicked on Scheme Dropdown" + Business_Information.ClickonSchemedatafield);
			click(Business_Information.SelectScheme );
			Thread.sleep(2000);
			Log.info("Selected option for Scheme is displaed " +Business_Information.SelectScheme );
			return true;
		}
		//TC020 //TC021
		public boolean EnterDocketandLoanAmount (String EnterDocketAmount , String EnterLoanAmount) throws InterruptedException {
			ElementDisplayed(Business_Information.DocketAmount);
			Log.info("Docket Amount field displayed" + Business_Information.DocketAmount);
			Thread.sleep(1000);
			input(Business_Information.EnterDocketAmount ,EnterDocketAmount );
			Log.info(EnterDocketAmount);
			Thread.sleep(2000);
			ElementDisplayed(Business_Information.LoanAmountRequired);
			Log.info("Loan Amount required field displayed" + Business_Information.LoanAmountRequired);
			Thread.sleep(1000);
			input(Business_Information.EnterLoanAmount ,EnterLoanAmount );
			Log.info(EnterLoanAmount);
			Thread.sleep(1000);
			return true;
		}
		//TC022
		public boolean ValidatePromoterContribution (String EnterDocketAmount , String EnterLoanAmount) throws InterruptedException
		{
			ElementDisplayed(Business_Information.PromoterContribution);
			Log.info("Promoter Contribution Field displayed" + Business_Information.PromoterContribution);
			Thread.sleep(1000);
			
	        input(Business_Information.EnterDocketAmount ,EnterDocketAmount );
			Log.info(EnterDocketAmount);
			Thread.sleep(2000);
			ElementDisplayed(Business_Information.LoanAmountRequired);
			Log.info("Loan Amount required field displayed" + Business_Information.LoanAmountRequired);
			Thread.sleep(1000);
			input(Business_Information.EnterLoanAmount ,EnterLoanAmount );
			Log.info(EnterLoanAmount);
			Thread.sleep(3000);
			
		click(Business_Information.PromoterContribution);
		Thread.sleep(2000);
//		   int expectedContribution = Integer.parseInt(EnterDocketAmount) - Integer.parseInt(EnterLoanAmount);
//		   System.out.println("Expected contribution" + expectedContribution);
//		   
//	        String actualContribution = promoterContributionPage.getPromoterContribution();
//	        Assert.assertEquals(actualContribution, String.valueOf(expectedContribution), "Promoter Contribution not autoloaded correctly.");

			WebElement CalculatedValue = driver.findElement(By.xpath("//input[@placeholder='Promoter Contribution ⟨₹⟩']"));
			System.out.println("ABC value = " + CalculatedValue.getAttribute("title"));
			
			Thread.sleep(2000);
			
	      // String actualContribution = Business_Information.AmountofPromoterContribution;
	       
//	        Assert.assertEquals(actualContribution, String.valueOf(expectedContribution), "Promoter Contribution not autoloaded correctly.");
//			Log.info("Amount corrected" + Business_Information.AmountofPromoterContribution);
	        return true;
			}
		
		
		//TC023
		
		@SuppressWarnings("unlikely-arg-type")
		public boolean ChiefPromoterFullNameAutoload () throws InterruptedException {
			
			ScrollUntilElementVisible(Business_Information.PromoterContribution);
			Thread.sleep(1000);
			WebElement AutoloadName = driver.findElement(By.xpath("//input[@placeholder='Chief Promoter Full Name']"));
			System.out.println("Autoloaded valued displayed " +AutoloadName.getAttribute("title"));
			
			if(AutoloadName.equals("ABC54R34easew4")) {
				 boolean flag1=ElementDisplayed(Business_Information.AutoloadedChiefPromoterFullName);
				 ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);
				Log.info("frefx4s : " + false);
				return flag1;
			 }
			 else {
				 Thread.sleep(1000);
			 }
			return false;
		}
		
		
		//TC024
		
		@SuppressWarnings("unlikely-arg-type")
		public boolean MobileNumberAutolad () throws InterruptedException {
			
			
			WebElement AutoloadMob = driver.findElement(By.xpath("//input[@placeholder='Mobile No']"));
			System.out.println("Auto loaded mobile number displayed" + AutoloadMob.getAttribute("title"));
			
			if(AutoloadMob.equals("9954327855")) {
				 boolean flag1=ElementDisplayed(Business_Information.AutoloadedMobileNumber);
				 ExtentTestManager.getTest().log(Status.FAIL, "2323232333333: " + false);
				Log.info("2323232333333: " + false);
				return flag1;
			 }
			 else {
				 Thread.sleep(1000);
			 }
			return false;
			
		}
		
		//TC025
		
		@SuppressWarnings("unlikely-arg-type")
		public boolean ValidateEmailID () throws InterruptedException {
			
			WebElement AutoloadedEmail = driver.findElement(By.xpath("//input[@placeholder='Email ID']"));
			System.out.println("Autoloaded Email displayed" + AutoloadedEmail.getAttribute("title"));
			
			if (AutoloadedEmail.equals("ksidc.15@gmail.com")) {
				
				boolean flag1=ElementDisplayed(Business_Information.AutoloadedEmail);
				 ExtentTestManager.getTest().log(Status.FAIL, "fvdt5: " + false);
				Log.info("fdt56: " + false);
				return flag1;
				
			}
			
			else {
				
				Thread.sleep(1000);
			}
			
			
			return false;
			
		}
		
		//TC026
		public boolean SelectGender ( ) throws InterruptedException {
			ElementDisplayed(Business_Information.ClickonGenderField);
			Log.info("Gender Field displayed" + Business_Information.ClickonGenderField);
			Thread.sleep(1000);
			click(Business_Information.ClickonGenderField );
			Log.info("Dropdown clicked" + Business_Information.ClickonGenderField);
			Thread.sleep(2000);
			click(Business_Information.SelectGenderMale);
			Log.info("Male selected" + Business_Information.SelectGenderMale);
			return true; }
			
			//TC027
		
		public boolean SelectLoanPurpose () throws InterruptedException {
			
			ElementDisplayed(Business_Information.LoanpurposeField);
			Log.info("Loan Purpose field displayed" + Business_Information.LoanpurposeField);
			click(Business_Information.LoanpurposeField);
			Log.info("Clicked loan purpose dropdown" + Business_Information.LoanpurposeField);
			click(Business_Information.SelectLoanPurpose);
			Log.info("Selected loan purpose displayed" + Business_Information.SelectLoanPurpose);
			return true;
			
		}

		//TC028
		
				public boolean SelectSector() throws InterruptedException {
					
					ElementDisplayed(Business_Information.SectorField);
					Log.info("Sector Field Displayed"+ Business_Information.SectorField);
					click(Business_Information.SectorField);
					Log.info("Dropdown clicked for sector"+Business_Information.SectorField);
					click(Business_Information.SelectSector);
					Log.info("Sector selected" + Business_Information.SelectSector);
					return true;
				}
				
				//TC029
				
				public boolean SelectSubSector () throws InterruptedException {
					
					ElementDisplayed(Business_Information.SUBSectorField);
					Log.info("Subsector field displaed" + Business_Information.SUBSectorField);
					click(Business_Information.SUBSectorField);
					Log.info("Clicked subsector dropdown" + Business_Information.SUBSectorField);
//					Thread.sleep(1000);
//					ScrollUntilElementVisible(Business_Information.SelectSubSector);
//					Thread.sleep(1000);
					click(Business_Information.SelectSubSector);
					Log.info("Subsector selected" + Business_Information.SelectSubSector) ;
					return true;
				}
				
				//TC030
				
				public boolean EnterProductServiceName (String ProductServiceNameField) throws InterruptedException {
					
					ElementDisplayed(Business_Information.ProductServiceNameField);
					Log.info("Product field displayed" + Business_Information.ProductServiceNameField);
					input(Business_Information.ProductServiceNameField ,ProductServiceNameField );
					Log.info(ProductServiceNameField);
					return true;
				}
				
				//TC031
				
				@SuppressWarnings("unlikely-arg-type")
				public boolean ValidateAutoloadedState () throws InterruptedException {
					
					WebElement AutoloadedState = driver.findElement(By.xpath("//div[@title='KERALA']"));
					System.out.println("Autoloaded State displayed " + AutoloadedState.getAttribute("title"));
					
					if (AutoloadedState.equals("KERALA")) {
						
						boolean flag1=ElementDisplayed(Business_Information.AutoloadedState);
						 ExtentTestManager.getTest().log(Status.FAIL, "Mumbai: " + false);
						Log.info("Mumbai: " + false);
						return flag1;
						
					}
					
					else {
						
						Thread.sleep(1000);
						
					}
					return true;
				}
					
					//TC032
					
					public  boolean SelectProjectLocation () throws InterruptedException {
						
						ElementDisplayed(Business_Information.ProjectLocation);
						Log.info("Project Location field Displayed" + Business_Information.ProjectLocation);
						click(Business_Information.ProjectLocation);
						Log.info("Project Location Dropdown clicked" + Business_Information.ProjectLocation);
						click(Business_Information.SelectProjectLocation);
						Log.info("KANNUR Selected" + Business_Information.SelectProjectLocation);
						return true;
						
					}
					
					//TC033
					
					public boolean SelectProjectType () throws InterruptedException {
						
						ScrollUntilElementVisible(Business_Information.ProductServiceNameField);
						ElementDisplayed (Business_Information.ProjectType);
						Log.info("Project Type field displayed" + Business_Information.ProjectType );
						click(Business_Information.ProjectType);
						Log.info("Project Type field displayed" + Business_Information.ProjectType);
						click(Business_Information.SelectProjectType);
						Log.info("Selected Projrct type displayed" +Business_Information.SelectProjectType);
						return true;
					}
					
					//TC034
					
					public boolean EnterBreakEvenPeriod (String BreakEvenPeriod) throws InterruptedException {
						
						
						ElementDisplayed(Business_Information.BreakEvenPeriod);
						Log.info("Field displayed" + Business_Information.BreakEvenPeriod);
						input(Business_Information.BreakEvenPeriod , BreakEvenPeriod);
						Log.info(BreakEvenPeriod);
						return true;
					}
					
					//TC035
					
					public boolean SelectTentativeprojectDate () throws InterruptedException {
						ElementDisplayed(Business_Information.Tentativeproject);
						Log.info("Data field displayed" + Business_Information.Tentativeproject);
						click(Business_Information.DateiconStartdate);
						Log.info("Calender displayed" + Business_Information.DateiconStartdate);
						click(Business_Information.SelectDate);
						Log.info("Selected Date displayed" + Business_Information.SelectDate);
						return true;
					
					}
					
					//TC036
					
					public boolean EnterProjectImplementaionPeriod (String ProjectImplemenationPeriod) throws InterruptedException {
						
						ElementDisplayed (Business_Information.ProjectImplemenationPeriod);
						Log.info("Data field display for Project Implementation Period Entry" + Business_Information.ProjectImplemenationPeriod);
						input(Business_Information.ProjectImplemenationPeriod , ProjectImplemenationPeriod);
						Log.info(ProjectImplemenationPeriod);
						return true;
					}
					
					//TC037
					
					public boolean EnterLabourCount (String ApproxTotalLabourCount) throws InterruptedException {
						
						ElementDisplayed(Business_Information.ApproxTotalLabourCount);
						Log.info("Approx Total Labour Count displayed " + Business_Information.ApproxTotalLabourCount);
						input (Business_Information.ApproxTotalLabourCount , ApproxTotalLabourCount);
						Log.info(ApproxTotalLabourCount);
						return true;
					}
					//TC038
					
                    public boolean SelectContractorDepartment () throws InterruptedException {
						
						ElementDisplayed(Business_Information.ContractorDepartment);
						Log.info("Contractor Department data field displayed" + Business_Information.ContractorDepartment);
						click(Business_Information.ContractorDepartment);
						Log.info("Contractor Department data field clicked" + Business_Information.ContractorDepartment);
						click(Business_Information.SelectContractorDepartment);
						Log.info("Contractor Department data field selected" + Business_Information.SelectContractorDepartment);
						return true;
					}
					//TC039
					
					public boolean SelectContractorClassification () throws InterruptedException {
						
						ElementDisplayed(Business_Information.ContractorClassification);
						Log.info("Contractor classification data field displayed" + Business_Information.ContractorClassification);
						click(Business_Information.ContractorClassification);
						Log.info("Contractor classification data field clicked" + Business_Information.ContractorClassification);
						click(Business_Information.SelectContractorClassification);
						Log.info("Contractor classification data field selected" + Business_Information.SelectContractorClassification);
						return true;
					}
					
					//TC040
					
					public boolean EnterDocketNumber (String DocketNumber) throws InterruptedException {
						
						ElementDisplayed(Business_Information.DocketNumber);
						Log.info("Docker Number field displayed" + Business_Information.DocketNumber);
						input(Business_Information.DocketNumber , DocketNumber);
						Log.info(DocketNumber);
						return true;
						
					}
					
					//TC041
					
					public boolean EnterTreasuryReleaseDate (String EnterTreasuryDate) throws InterruptedException {
						
						ElementDisplayed(Business_Information.EnterTreasuryDate);
						Log.info("Treasury Release Date field displayed");
						input(Business_Information.EnterTreasuryDate ,EnterTreasuryDate );
						Log.info(EnterTreasuryDate);
						return true;
					}
					
					//TC042
					
					public boolean SelectProjectLand () throws InterruptedException {
						
						ScrollUntilElementVisible(Business_Information.ContractorClassification);
						Thread.sleep(1000);
						ElementDisplayed(Business_Information.ProjectLand);
						Log.info("Project Land field displayed" + Business_Information.ProjectLand);
						click(Business_Information.ProjectLand);
						Log.info("Clicked on Project Land" + Business_Information.ProjectLand);
						click(Business_Information.SelectProjectLand);
						Log.info("Project Land Selected" + Business_Information.SelectProjectLand);
						return true;
					}
					
					//TC043 
					
					public boolean EnterProductionCapacity (String ProductionCapacity) throws InterruptedException {
						
						ElementDisplayed(Business_Information.ProductionCapacity);
						Log.info("Production Capacity field displayed" + Business_Information.ProductionCapacity);
						input(Business_Information.ProductionCapacity ,ProductionCapacity );
						return true;
					}
					
					//TC044
					
					public boolean SelectPollutionCategory() throws InterruptedException {
						
						ElementDisplayed(Business_Information.PollutionCategory);
						Log.info("Pollution category field displayed" + Business_Information.PollutionCategory);
						click(Business_Information.PollutionCategory);
						Log.info("Pollution category dropdown displayed" + Business_Information.PollutionCategory);
						click(Business_Information.SelectPollutionCategory);
						Log.info("Category selected"+ Business_Information.SelectPollutionCategory);
						return true;
					}
					
					//TC045
					
                       public boolean SelectProjectNature() throws InterruptedException {
						
						ElementDisplayed(Business_Information.ProjectNature);
						Log.info("Project Nature field displayed" + Business_Information.ProjectNature);
						click(Business_Information.ProjectNature);
						Log.info("Project Nature dropdown displayed" + Business_Information.ProjectNature);
						click(Business_Information.SelectProjectNature);
						Log.info("Nature selected"+ Business_Information.SelectProjectNature);
						return true;
					}
                       
                       //TC046
                       
                       public boolean SelectYESforFirstcharge () throws InterruptedException {
                    	   
                    	   ElementDisplayed(Business_Information.FirstCharge);
                    	   Log.info("Data field displayed" + Business_Information.FirstCharge);
                    	   click(Business_Information.SelectYESToggle);
                    	   Thread.sleep(1000);
                    	   return true;
                       }
                       
                       //TC047
                         public boolean SelectYESforExclusiveFirstcharge () throws InterruptedException {
                    	   
                    	   ElementDisplayed(Business_Information.ExclusiveFirstCharge);
                    	   Log.info("Data field displayed" + Business_Information.ExclusiveFirstCharge);
                    	   click(Business_Information.SelectYESforexclusive);
                    	   ScrollUntilElementVisible(Business_Information.ProjectNature);
                    	   Thread.sleep(1000);
                    	   return true;
                       }
                         
                         public boolean ExistingAsset () throws InterruptedException {
                        	 
                        	 ElementDisplayed(Business_Information.ExistingAsset);
                        	 Log.info("Data field displayed" + Business_Information.ExistingAsset);
                      	   click(Business_Information.SelectYesforExistingAsset);
                      	   ScrollUntilElementVisible(Business_Information.FirstCharge);
                      	   Thread.sleep(1000);
                      	   return true;
                        	 
                         }
                         
                         //TC049
                         
                         public boolean CheckboxofTermsandCondition () throws InterruptedException {
                        	 
                        	 ElementDisplayed(Business_Information.TermsandCondition);
                        	 Log.info("Terms and condition visible" + Business_Information.TermsandCondition);
                        	 click(Business_Information.TermsandConditioncheckbox);
                        	 Log.info("Check box got ticked" + Business_Information.TermsandConditioncheckbox);
                        	 return true;
                         }
                         
                         //TC050
                         
                         public boolean Submit () throws InterruptedException {
                        	 
                        	 ElementDisplayed(Business_Information.Submit);
                        	 Log.info("Submit button displayed" + Business_Information.Submit);
                        	 click(Business_Information.Submit);
                        	 return true;
                        	 
                        	 
                         }
                         
                         //TC051 
                         
                         public boolean SuccessChecke () throws InterruptedException {
                        	 
                        	 ElementDisplayed(Business_Information.SuucessGreenMark);
                        	 Log.info("SuccessMark displayed" + Business_Information.SuucessGreenMark);
                        	 ElementDisplayed(Business_Information.SuccessMessage);
                        	 Log.info("Suucess message displayed" + Business_Information.SuccessMessage);
                        	 ElementDisplayed(Business_Information.LoanAppbutton);
                        	 click(Business_Information.LoanAppbutton);
                        	 Log.info("Loan Application button clicked" + Business_Information.LoanAppbutton);
                        	 return true;
                         }
                       
	
		}
				

