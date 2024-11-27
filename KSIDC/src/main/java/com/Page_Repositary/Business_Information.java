package com.Page_Repositary;

import org.openqa.selenium.By;

public class Business_Information {

	public By LoginButton = By.xpath("(//button[@class='button secondary btn-medium'])[2]");
	
	public By EnterEmailAddress = By.xpath("(//input[@placeholder='Email Address'])[1]");
	
	public By EnterPassword = By.xpath("(//input[@placeholder='Password'])[1]");
	
	public By ClicktoLogin = By.xpath("(//button[@class=' w-100 button primary btn-medium'])[1]");
	
	public By LoginIdUSer = By.xpath("(//a[@id='LoggedInUser'])[2]");
	
	public By LogOut = By.xpath("(//a[@class='dropdown-item'][text()='Log out'])[2]");
	
	public By Scroll = By.xpath("//h6[text()='Term Loan KSIDC']");
	
	public By EnquiryNowTermLoanKSIDC = By.xpath("(//button[@class='button tertiary btn-medium w-100'])[2]");
	
	public By BusinessinfoHeader = By.xpath("//h4[text()='Business Information']");
	
	public By Displayname = By.xpath("//label[@title='Display Name']");
	
	public By EnterDisplayname = By.xpath("//input[@placeholder='Display Name']");
	
	public By InstitutionTypes = By.xpath("//label[@class='form-label input-main-label']");
	
	public By CLickonInstitutionTypes = By.xpath("(//div[@class='rz-dropdown valid rz-state-empty rz-clear form-select select-main'])[1]");
	
	public By SelectoptionforInstitutionTypes = By.xpath("//span[normalize-space()='Business Entities Created by Statute']");

	public By Schemedatafield = By.xpath("//label[@title='Scheme']");
	
	public By ClickonSchemedatafield = By.xpath("(//div[@class='rz-dropdown valid rz-state-empty rz-clear form-select select-main'])[1]");
	
	public By SelectScheme = By.xpath("//span[normalize-space()='Term Loan KSIDC']");

    public By DocketAmount = By.xpath("//label[contains(text(),'Docket Amount ⟨₹⟩')]");
    
    public By EnterDocketAmount = By.xpath("//input[@placeholder='Docket Amount ⟨₹⟩']");
    
    public By LoanAmountRequired = By.xpath("//label[contains(text(),'Loan Amount Required ⟨₹⟩')]");
    
    public By EnterLoanAmount = By.xpath("//input[@placeholder='Loan Amount Required ⟨₹⟩']");
    
    public By PromoterContribution = By.xpath("//label[contains(text(),'Promoter Contribution ⟨₹⟩')]");
    
    public By AmountofPromoterContribution = By.xpath("//input[@placeholder='Promoter Contribution ⟨₹⟩']");

    public By AutoloadedChiefPromoterFullName = By.xpath("//input[@placeholder='Chief Promoter Full Name']");
    
    public By AutoloadedMobileNumber = By.xpath("//input[@placeholder='Mobile No']");
    
    public By AutoloadedEmail = By.xpath("//input[@placeholder='Email ID']");
    
    public By GenderField = By.xpath("(//label[@class='rz-dropdown-label rz-inputtext  rz-placeholder'])[3]");
    
    //public By ClickonGenderField = By.xpath("(//div[@class='rz-dropdown valid rz-state-empty rz-clear form-select select-main'])[3]");
    public By ClickonGenderField = By.xpath("//label[contains(text(),'Gender')]/parent::div");
    
    public By SelectGenderMale = By.xpath("//span[text()='Male']");
    
    public By LoanpurposeField = By.xpath("//label[contains(text(),'Loan Purpose')]/parent::div");
    
    public By SelectLoanPurpose = By.xpath("//span[text()='Asset Creation']");
    
    public By SectorField = By.xpath("//label[contains(text(),'Sector')]/parent::div");
    
    public By SelectSector = By.xpath("//span[text()='Aviation']");

    public By SUBSectorField = By.xpath("//label[contains(text(),'SubSector')]/parent::div");
    
    public By SelectSubSector = By.xpath("//span[text()='Airline Operator']");
    
    public By ProductServiceNameField = By.xpath("//input[@placeholder='Product/Service Name']");
    
    public By AutoloadedState = By.xpath("//label[contains(text(),'State')]/parent::div");
    
    public By ProjectLocation = By.xpath("//label[@title='Project Location']/parent::div");
    
    public By SelectProjectLocation = By.xpath("//span[text()='KANNUR']");
    
    public By ProjectType = By.xpath("//label[text()='Project Type']/parent::div");
    
    public By SelectProjectType = By.xpath("//span[text()='Expansion']");
    
    public By BreakEvenPeriod = By.xpath("//input[@placeholder='Break Even Period']");
    
    public By Tentativeproject = By.xpath("//input[@placeholder='Tentative Project Start Date']");
    
    public By DateiconStartdate = By.xpath("(//span[@class='rz-button-icon-left rzi rzi-calendar'])[1]");
    
    public By SelectDate = By.xpath("(//span[text()='6'])[3]");
    
    public By ProjectImplemenationPeriod = By.xpath("//input[@placeholder='Project Implementation Period In Months']");
    		
    public By ApproxTotalLabourCount = By.xpath("//input[@placeholder='Approx Total Labour Count']");
    
    public By ContractorDepartment = By.xpath("//label[text()='Contractor Department']/parent::div");
    
    public By SelectContractorDepartment = By.xpath("//span[text()='PWD']");
    
    public By ContractorClassification = By.xpath("//label[text()='Contractor Classification']/parent::div");
    
    public By SelectContractorClassification = By.xpath("//span[text()='test lookup']");
    
    public By DocketNumber = By.xpath("//input[@placeholder='Docket Number']");
    
    public By EnterTreasuryDate = By.xpath("//input[@placeholder='Treasury Release Date']");
    
    public By ProjectLand = By.xpath("//label[text()='Project Land']/parent::div");
    
    public By SelectProjectLand = By.xpath("//span[text()='Owned']");
    
    public By ProductionCapacity = By.xpath("//input[@placeholder='Production Capacity(Quantity Per Annum) Test']");
    
    public By PollutionCategory = By.xpath("//label[text()='Pollution Category']/parent::div");

    public By SelectPollutionCategory = By.xpath("//span[text()='Green']");
    
    public By ProjectNature = By.xpath("//label[text()='Project Nature']/parent::div");
    
    public By SelectProjectNature = By.xpath("//span[text()='Product development']");
    
    public By FirstCharge = By.xpath("//p[text()='First Charge For The Collateral Security Can Be Provided']");
    
    public By SelectYESToggle = By.xpath("(//div[@class='rz-radiobutton-box'])[1]");
    
    public By ExclusiveFirstCharge = By.xpath("//p[text()='Can An Exclusive First Charge On The Company Assets Be Provided']");
    
    public By SelectYESforexclusive = By.xpath("(//div[@class='rz-radiobutton-box'])[2]"); 
    
    public By ExistingAsset = By.xpath("//p[text()='Whether Existing Assets Can Be Mortgaged As Security For The Loan']");
    
    public By SelectYesforExistingAsset = By.xpath("(//div[@class='rz-radiobutton-box'])[3]");
    
    public By TermsandCondition = By.xpath("//label[@class='form-check-label']");
    
    public By TermsandConditioncheckbox = By.xpath("//span[@class='rz-chkbox-icon']/parent::div");
    
    public By Submit = By.xpath("//button[@class='button primary btn-medium d-flex align-items-center justify-content-center']");

    public By SuucessGreenMark = By.xpath("//div[@class='success-animation']");
    
    public By SuccessMessage = By.xpath("(//span[@class='d-flex text-center py-4'])[1]");
    
    public By LoanAppbutton = By.xpath("(//button[@class='w-100 button primary btn-medium'])[1]");
    		


}
