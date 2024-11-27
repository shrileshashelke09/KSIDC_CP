package com.BasePackage;



import java.io.FileInputStream;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Utility.Log;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {

	public static RemoteWebDriver driver = null;
	
	public WebDriver getDriver() {
		return driver;
	}
	
	private static By L_username = By.xpath("//input[@id='username']");
	private static By L_password = By.xpath("//input[@id='userpassword']");
	private static By L_SignIn = By.xpath("//button[contains(text(),'Log In')]");
	private static By L_LogOut= By.xpath("//a[text()='Click here to Logout']");
	private static By L_LogAlert= By.xpath("//button[text()='Yes']");
	
	public static String Pagetitle;

	public static Properties configloader() throws IOException {
		FileInputStream File = new FileInputStream(".\\src\\test\\resources\\config.properties");
		Properties properties = new Properties();
		properties.load(File);
		return properties;
	}

	public  void SetUp() throws IOException, InterruptedException {
		
		String Browser = configloader().getProperty("Browser");
		String Url = configloader().getProperty("URL");
		String UserName = configloader().getProperty("UserName");
		String Password = configloader().getProperty("Password");
		switch (Browser.toUpperCase()) {

		case "CHROME":

			ChromeOptions options = new ChromeOptions();
			//options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
			options.addArguments("--disable-extensions");
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\linita.shivalkar\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);		
			break;

		case "FIREFOX":

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();			
			break;

		default:
			System.err.println("The Driver is not defined");
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Log.info("Driver has initialized successfully for "+Browser+"browser");
		driver.get(Url);
		Thread.sleep(2000);
		Pagetitle = driver.getTitle();
		Log.info("Title is displayed : "+Pagetitle);
//		input(L_username, UserName);
//		input(L_password, Password);
//		click(L_SignIn);
//		Boolean OrignalText1 = false;
//		   try {
//		   OrignalText1= driver.findElement(By.xpath("//a[text()='Click here to Logout']")).isDisplayed();}
//		   catch(Exception e)
//		   {
//			  
//		   }
//		   System.out.println(OrignalText1);
//		   //String ExpectdText1="Choose your Gmail address";
//			   if (OrignalText1) {
//				   System.out.println(OrignalText1 +"if");
//				      click(L_LogOut);
//				      Thread.sleep(1000);
//				      click(L_LogAlert);
//				      Thread.sleep(1000);
//				      input(L_username, UserName);
//				      input(L_password, Password);
//				      click(L_SignIn);
//				      //Thread.sleep(1000);
//			   }


	}

	public static  String  GetMobileNumberOTP(String MobNo) throws ClassNotFoundException {
		
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String UserName = "sqa";
		String Password = "SPQA@sql2019" ;
		String Url = "jdbc:sqlserver://192.168.32.32\\QA;DatabaseName=BeaconLOS;encrypt=true;trustServerCertificate=true";
		String OTP = null;

		
		try(Connection connection = DriverManager.getConnection(Url,UserName,Password)){
		//con = DriverManager.getConnection(Url,UserName,Password);
		System.out.println("Class: Common Method: DatabaseConnector: Connected");
		
		//Execute Query for getting OTP
		CallableStatement callableStatement = connection.prepareCall("{call SpGetMobileOTPregistrationTEST ("+MobNo+")}");
		//callableStatement.setLong(1, 9999999991L);
		//System.out.println("Stored procedure called with parameter: 9999999991");
		
		 // Execute stored procedure
        ResultSet resultSet = callableStatement.executeQuery();
        while (resultSet.next()) {
             OTP = resultSet.getString("OTP");
            System.out.println("OTP : " + OTP  );

		
        }
		
	}catch(Exception e)
	{
		System.out.println("Class: Common Method: DatabaseConnector: Not Connected");
		e.printStackTrace();
	
	}
		return OTP;
   
}

	
public static  String  GetEmailOTP(String Email) throws ClassNotFoundException {
		
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String UserName = "sqa";
		String Password = "SPQA@sql2019" ;
		String Url = "jdbc:sqlserver://192.168.32.32\\QA;DatabaseName=BeaconLOS;encrypt=true;trustServerCertificate=true";
		String OTP = null;
		String ValidEmail = "'"+Email+"'";
		System.out.println("Valid Email Address :"+ValidEmail);

		
		try(Connection connection = DriverManager.getConnection(Url,UserName,Password)){
		//con = DriverManager.getConnection(Url,UserName,Password);
		System.out.println("Class: Common Method: DatabaseConnector: Connected");
		
		//Execute Query for getting OTP
		CallableStatement callableStatement = connection.prepareCall("{call SpGetEmailOTPregistrationTEST ("+ValidEmail+")}");
		//callableStatement.setLong(1, 9999999991L);
		
		 // Execute stored procedure
		Thread.sleep(10000);
        ResultSet resultSet = callableStatement.executeQuery();
        System.out.println("Result :"+resultSet);
        
        while (resultSet.next()) {
             OTP = resultSet.getString("OTP");
            System.out.println("OTP : " + OTP  );

		
        }
		
	}catch(Exception e)
	{
		System.out.println("Class: Common Method: DatabaseConnector: Not Connected");
		e.printStackTrace();
	
	}
		return OTP;
   
}
	public static  void input(By element, String Value) throws InterruptedException {


		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		wait2.until(ExpectedConditions.presenceOfElementLocated(element)).sendKeys(Value);


	}

	public static  void click(By element) throws InterruptedException {

		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 90);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		Thread.sleep(2000);

	}

	public static void select(String value,By element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		Select selWeekDayDropDown = new Select(driver.findElement(element));
		selWeekDayDropDown.selectByVisibleText(value);
		
	}

	public static void clear(By element)throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element)).clear();
		Thread.sleep(2000);
	}


	public static void AcceptAlert()
	{
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();

		
	}

	public static  void INclick(By element) throws InterruptedException {

		//Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
		//Thread.sleep(2000);

	}
	
	public static  void ElementToBeVisible(By element) throws InterruptedException {

		//Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
		//Thread.sleep(2000);

	}
	
	
	public static void SwitchToFrame(By frameName)
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameName));
	}
	
	public static void ScrollUntilElementVisible(By locator)
	{ 
		WebElement element = driver.findElement(locator);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public static boolean ElementDisplayed(By locator)
	{
		WebElement element = driver.findElement(locator);
		Boolean flag = element.isDisplayed();
		return flag;
	}
	
	public static boolean ElementEnabled(By locator)
	{
		WebElement element = driver.findElement(locator);
		Boolean flag = element.isEnabled();
		return flag;
	}
	
	public static void UploadFile(By locator, String path)
	{
		WebElement uploadElement = driver.findElement(locator);
		uploadElement.sendKeys(path);
	}
	
	public static boolean ElementEnableOrDisable(By locator)
	{
		WebElement element = driver.findElement(locator);
		Boolean flag = element.isEnabled();
		return flag;
	}
	
	public static boolean CheckElementDisable(By locator)
	{  
		//disable
		WebElement element = driver.findElement(locator);
		Boolean flag = element.isEnabled();	
		
		if (flag==false) {
			flag=true;
		}else if(flag==true)
			flag=false;
		
		return flag;
	}
	
	
	public static  void Hover(By element) throws InterruptedException {
		WebElement element1 = driver.findElement(element);
		Actions actions = new Actions(driver);
		actions.moveToElement(element1).perform();

		

	}

}
