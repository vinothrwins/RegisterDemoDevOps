package com.telus.registerdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegisterDemoFlow {
	
	public WebDriver driver;
	
	// Parameterized all Input Values
	String URL = "https://nxtgenaiacademy.com/";
	String registrationTitleInput = "Register For Demo";
	String firstNameInput = "Vinoth";
	String lastNameInput = "Rathinam";
	String streetAddressInput = "Saravana Flats";
	String apartmentInput = "S2";
	String cityNameInput = "Chennai";
	String stateNameInput = "TamilNadu";
	String postalCodeInput= "600100";
	String countryDrpDnInput = "India";
	String emailInput= "vinothrwins@gmail.com";
	String dateOfDemoInput = "03/31/2021";
	String hourInput = "09";
	String minuteInput = "30";
//	String ampmInput = "PM";
	String mobileNumberInput = "6383544892";
	String enterYourQueryInput = "What is the scope of API Automation?";
	String successfulMessageTextInput = "Registration Form is Successfully Submitted";

	// Parameterized all The WebElement Path
	String qaAutomationLocator = "QA AUTOMATION";
	String practiceAutomationLocator = "Practice Automation";
	String registrationFormLocator = "Registration Form";
	String registrationTitleTextLocator = "//*[text()='Register For Demo']";
	String firstNameLocator = "vfb-5";
	String lastNameLocator = "vfb-7";
	String maleRadioBtnLocator = "vfb-8-1";
	String streetAddressLocator = "vfb-13[address]";
	String apartmentLocator = "vfb-13-address-2";
	String cityLocator = "vfb-13-city";
	String stateLocator = "vfb-13-state";
	String postalCodeLocator = "vfb-13-zip";
	String countryDropDownLocator = "vfb-13-country";
	String emailLocator = "#vfb-14";
	String dateOfDemoLocator = "#vfb-18";
	String hourLocator= "vfb-16-hour";
	String minuteLocator = "vfb-16-min";
	String amPmLocator = "vfb-16-ampm";
	String mobileNumLocator = "//input[@id='vfb-19']";
	String seleniumWebDriverChkBxLocator = "vfb-20-0";
	String functionalTestingChkBxLocator = "vfb-20-4";
	String enterYourQueryLocator = "vfb-23";
	String enterTwoDigitsLocator = "vfb-3";
	String submitBtnLocator = "vfb-4";
	String successfulMsgTextLocator = "//*[contains(text(),'Registration Form is Successfully Submitted')]";

	
	
	@BeforeClass
	public void launchApplication() {
		
		// To Set System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		// To Create Driver Object in Driver Interface
		driver = new ChromeDriver();

		// Launch the Home URL
		driver.get(URL);

		// To Maximize Window
		driver.manage().window().maximize();
		System.out.println("Application is launched");	
	}
	
	@AfterClass
	public void closeApplication() {
		driver.close();
		System.out.println("Application is closed");
	}
	
	@Test(priority=1)
	public void navigateToRegistrationForm() {
		// Click on Selenium Online Training
		WebElement qaAutomation = driver.findElement(By.linkText(qaAutomationLocator));

		// Create an Instance in Action Class by Passing WebDriver Instance
		Actions actBuilder = new Actions(driver);

		// Move the Mouse above the QA Automation
		actBuilder.moveToElement(qaAutomation).build().perform();

		// Click on Registration Form
		WebElement practiceAutomation = driver.findElement(By.linkText(practiceAutomationLocator));

		// Move the Mouse above the Practice Automation
		actBuilder.moveToElement(practiceAutomation).build().perform();

		// Click on Demo Site-Registration Form
		driver.findElement(By.partialLinkText(registrationFormLocator)).click();
		System.out.println("Navigated to Register Demo Page");

	}
	
	
	@Test(priority=2)
	public void registerForDemo() {
		// Registration Title
		WebElement regTitleText = driver.findElement(By.xpath(registrationTitleTextLocator));

		// Verify Register Title is Displayed or not
		if (regTitleText.isDisplayed()) {
			System.out.println("Register Title is Displayed");
		} else {
			System.out.println("Register Title is not Displayed");
		}

		// Verify Register Title page is Enabled or not
		if (regTitleText.isEnabled()) {
			System.out.println("Register Title is Enabled");
		} else {
			System.out.println("Register Title is not Enabled");
		}

		// Validating Text
		String actRegTitleText = regTitleText.getText();
		String expRegTitleText = registrationTitleInput;

		if (actRegTitleText.equals(expRegTitleText)) {
			System.out.println("Actual and expected Register Title are same.");
			System.out.println("Register Title is " + actRegTitleText);
		} else {
			System.out.println("Actual and expected Register Title are not same ");
			System.out.println("Actual Register Title is " + actRegTitleText);
			System.out.println("Expected Register Title is " + expRegTitleText);
		}

		// First name
		WebElement firstName = driver.findElement(By.id(firstNameLocator));
		// Verify the First Name is displayed or not
		if (firstName.isDisplayed()) {
			System.out.println("First Name is Displayed");
		} else {
			System.out.println("First Name is not Displayed");
		}

		// Verify the First Name is Enabled or not
		if (firstName.isEnabled()) {
			System.out.println("First Name is Enabled");

			// Enter First Name
			firstName.sendKeys(firstNameInput);
			System.out.println("First Name is " + firstNameInput);
		} else {
			System.out.println("First Name is not Enabled");
		}

		// Last name
		WebElement lastName = driver.findElement(By.id(lastNameLocator));
		// Verify the Last Name is displayed or not
		if (lastName.isDisplayed()) {
			System.out.println("Last Name is Displayed");
		} else {
			System.out.println("Last Name is not Displayed");
		}

		// Verify the Last Name is enabled or not
		if (lastName.isEnabled()) {
			System.out.println("Last Name is Enabled");
			// Enter Last Name
			lastName.sendKeys(lastNameInput);
			System.out.println("Last Name is " + lastNameInput);
		} else {
			System.out.println("Last Name is not Enabled");
		}

		// Gender
		// Male Radio Button
		WebElement maleRdoBtn = driver.findElement(By.id(maleRadioBtnLocator));
		// Verify Male Radio Button is Displayed or not
		if (maleRdoBtn.isDisplayed()) {
			System.out.println("Male Radio Button is Displayed");
		} else {
			System.out.println("Male Radio Button is not Displayed");
		}

		// Verify male Radio Button is Enabled or not
		if (maleRdoBtn.isEnabled()) {
			System.out.println("Male Radio Button is Enabled");
		} else {
			System.out.println("Male Radio Button is not Enabled");
		}

		// Verify Male Radio Button is Selected
		if (maleRdoBtn.isSelected()) {
			System.out.println("Male Radio Button is Selected");
		} else {
			System.out.println("Male Radio Button is not Selected");

			// Click on Male Radio Button
			maleRdoBtn.click();
			System.out.println("Male Radio Button is Selected");
		}

		// Address
		// Street Address
		WebElement stAddress = driver.findElement(By.name(streetAddressLocator));
		// Verify the Street Address is displayed or not
		if (stAddress.isDisplayed()) {
			System.out.println("Street Address is Displayed");
		} else {
			System.out.println("Street Address is not Displayed");
		}

		// Verify the  Street Address is enabled or not
		if (stAddress.isEnabled()) {
			System.out.println("Street Address is Enabled");
			// Enter Street Address
			stAddress.sendKeys(streetAddressInput);
			System.out.println("Street Address is " + streetAddressInput);
		} else {
			System.out.println("Street Address is not Enabled");
		}

		// Apartment Number
		WebElement apartmentNo = driver.findElement(By.id(apartmentLocator));
		// Verify the Apartment Number is displayed or not
		if (apartmentNo.isDisplayed()) {
			System.out.println("Apartment Number is Displayed");
		} else {
			System.out.println("Apartment Number is not Displayed");
		}

		// Verify the Apartment Number is enabled or not
		if (apartmentNo.isEnabled()) {
			System.out.println("Apartment Number is Enabled");
			// Enter Apartment Number
			apartmentNo.sendKeys(apartmentInput);
			System.out.println("Apartment Number is " + apartmentInput);	
		} else {
			System.out.println("Apartment Number is not Enabled");
		}

		// City
		WebElement cityName = driver.findElement(By.id(cityLocator));
		// Verify the City Name is displayed or not
		if (cityName.isDisplayed()) {
			System.out.println("City Name is Displayed");

		} else {
			System.out.println("City Name is not Displayed");
		}

		// Verify the City Name is enabled or not
		if (cityName.isEnabled()) {
			System.out.println("City Name is Enabled");
			// Enter City Name
			cityName.sendKeys(cityNameInput);
			System.out.println("City Name is " + cityNameInput);
		} else {
			System.out.println("City Name is not Enabled");
		}

		// State
		WebElement stateName = driver.findElement(By.id(stateLocator));
		// Verify the State is displayed or not
		if (stateName.isDisplayed()) {
			System.out.println("State is Displayed");
		} else {
			System.out.println("State is not Displayed");
		}

		// Verify the State is enabled or not
		if (stateName.isEnabled()) {
			System.out.println("State is Enabled");
			// Enter State Name
			stateName.sendKeys(stateNameInput);
			System.out.println("State is " + stateNameInput);
		} else {
			System.out.println("State is not Enabled");
		}

		// Postal/Zip code
		WebElement postalCode = driver.findElement(By.id(postalCodeLocator));
		// Verify the Postal Code is displayed or not
		if (postalCode.isDisplayed()) {
			System.out.println("Postal Code is Displayed");
		} else {
			System.out.println("Postal Code is not Displayed");
		}

		// Verify the Postal Code is enabled or not
		if (postalCode.isEnabled()) {
			System.out.println("Postal Code is Enabled");
			// Enter Postal Code
			postalCode.sendKeys(postalCodeInput);
			System.out.println("Postal Code is " + postalCodeInput);
		} else {
			System.out.println("Postal Code is not Enabled");
		}

		// Country Drop Down
		WebElement countryDropDown = driver.findElement(By.id(countryDropDownLocator));
		// Verify Country Drop Down is displayed or not
		if (countryDropDown.isDisplayed()) {
			System.out.println("Country Drop Down is Displayed");
		} else {
			System.out.println("Country Drop Down is not Displayed");
		}

		// Verify Country Drop Down is enabled or not
		if (countryDropDown.isEnabled()) {
			System.out.println("Country Drop Down is enabled");

			// To Select the Item from country DropDown, Create the Select Object
			Select countryDrpDn = new Select(countryDropDown);
			// Select Using Visible Text
			countryDrpDn.selectByVisibleText(countryDrpDnInput);
			System.out.println(countryDrpDnInput + " is selected in Country drop down");			

		} else {
			System.out.println("Country Drop Down is not enabled");
		}

		// Email
		WebElement email = driver.findElement(By.cssSelector(emailLocator));
		// Verify the Email is Displayed or not
		if (email.isDisplayed()) {
			System.out.println("Email is Displayed");
		} else {
			System.out.println("Email is not Displayed");
		}

		// Verify the Email is enabled or not
		if (email.isEnabled()) {
			System.out.println("Email is Enabled");
			// Enter Email Id
			email.sendKeys(emailInput);
			System.out.println("Email Id is " + emailInput);
		} else {
			System.out.println("Email is not Enabled");
		}

		// Date of Demo
		WebElement dateOfDemo = driver.findElement(By.cssSelector(dateOfDemoLocator));
		// Verify the Mobile Number is Displayed or not
		if (dateOfDemo.isDisplayed()) {
			System.out.println("Date of Demo is Displayed");
		} else {
			System.out.println("Date of Demo is not Displayed");
		}

		// Verify the Date of Demo is enabled or not
		if (dateOfDemo.isEnabled()) {
			System.out.println("Date of Demo is Enabled");
			// Enter Date of Demo Value
			dateOfDemo.sendKeys(dateOfDemoInput);
			System.out.println("Date of Demo is " + dateOfDemoInput);
		} else {
			System.out.println("Date of Demo is not Enabled");
		}

		// Convenient Time
		// Hour Drop Down
		WebElement convenientTimeHrDrpDn = driver.findElement(By.id(hourLocator));
		// Verify Convenient Time Hour Drop Down is Displayed or not
		if (convenientTimeHrDrpDn.isDisplayed()) {
			System.out.println("Hour DropDown is Displayed ");
		} else {
			System.out.println("Hour DropDown is not Displayed ");
		}

		// Verify Convenient Time Hour Drop Down is Enabled or not
		if (convenientTimeHrDrpDn.isEnabled()) {
			System.out.println("Hour DropDown is Enabled ");

			// To Select the Item from Convenient Time Hour DropDown, Create the Select Object
			Select hourDropDown = new Select(convenientTimeHrDrpDn);
			// Select Using Visible Text
			hourDropDown.selectByVisibleText(hourInput);
			System.out.println(hourInput + " is selected in HH Dropdown");

		} else {
			System.out.println("Hour DropDown is not Enabled");
		}

		// Minute Drop Down
		WebElement convenientTimeMinDrpDn = driver.findElement(By.id(minuteLocator));
		// Verify MM Drop Down is Displayed or not
		if (convenientTimeMinDrpDn.isDisplayed()) {
			System.out.println("Minute DropDown is Displayed");
		} else {
			System.out.println("Minute DropDown is not Displayed");
		}

		// Verify Minute Drop Down is Enabled or not
		if (convenientTimeMinDrpDn.isEnabled()) {
			System.out.println("Minute DropDown is Enabled");

			// To Select the Item from Minute DropDown, Create the Select Object
			Select minuteDropDown = new Select(convenientTimeMinDrpDn);
			// Select Using Visible Text
			minuteDropDown.selectByVisibleText(minuteInput);
			System.out.println(minuteInput + " is selected in MM Dropdown");

		} else {
			System.out.println("Minute DropDown is not Enabled");
		}


/*		// Convenient Time AM/PM Drop Down
		WebElement convenientTimeAmpmDrpDn = driver.findElement(By.id(amPmLocator));
		// Verify Convenient Time AM/PM Drop Down is Displayed or not
		if (convenientTimeAmpmDrpDn.isDisplayed()) {
			System.out.println("AM/PM DropDown is Displayed");
		} else {
			System.out.println("AM/PM DropDown is not Displayed");
		}

		// Verify Convenient Time AM/PM Drop Down is Enabled or not
		if (convenientTimeAmpmDrpDn.isEnabled()) {
			System.out.println("AM/PM DropDown is Enabled");

			// To Select the Item from AM/PM DropDown, Create the Select Object
			Select ampmDrpDown = new Select(convenientTimeAmpmDrpDn);
			// Select Using Visible Text
			ampmDrpDown.selectByVisibleText(ampmInput);
			System.out.println(ampmInput + " is selected in AM/PM Dropdown");

		} else {
			System.out.println("AM/PM DropDown is not Enabled");
		}
*/

		// Mobile Number
		WebElement mobileNumber = driver.findElement(By.xpath(mobileNumLocator));
		// Verify the Mobile Number is Displayed or not
		if (mobileNumber.isDisplayed()) {
			System.out.println("Mobile Number is Displayed");
		} else {
			System.out.println("Mobile Number is not Displayed");
		}

		// Verify the Mobile Number is enabled or not
		if (mobileNumber.isEnabled()) {
			System.out.println("Mobile Number is Enabled");
			// Enter Mobile Number
			mobileNumber.sendKeys(mobileNumberInput);
			System.out.println("Mobile Number is " + mobileNumberInput);
		} else {
			System.out.println("Mobile Number is not Enabled");
		}

		// Course Interested
		// Selenium WebDriver Check Box
		WebElement seleniumWebDriverChk= driver.findElement(By.id(seleniumWebDriverChkBxLocator));
		// Verify The Selenium WebDriver Check Box is displayed or Not
		if (seleniumWebDriverChk.isDisplayed()) {
			System.out.println("Selenium WebDriver Check Box is Displayed");
		} else {
			System.out.println("Selenium WebDriver Check Box is Not Displayed ");
		}

		// Verify Selenium WebDriver Check Box Enabled or Not
		if (seleniumWebDriverChk.isEnabled()) {
			System.out.println("Selenium WebDriver Check Box is Enabled");
		} else {
			System.out.println("Selenium WebDriver Check Box is Not Enabled");
		}

		// Verify Selenium WebDriver Check Box Selected or Not
		if (seleniumWebDriverChk.isSelected()) {
			System.out.println("Selenium WebDriver Check Box is Selected");
		} else {
			System.out.println("Selenium WebDriver Check Box is Not Selected");

			// Click on Selenium WebDriver check Box
			seleniumWebDriverChk.click();
			System.out.println("Selenium WebDriver Check Box is Checked ");
		}

		// Functional Testing Check Box
		WebElement functionalTestingChk = driver.findElement(By.id(functionalTestingChkBxLocator));
		// Verify The Functional Testing Check Box is displayed or Not
		if (functionalTestingChk.isDisplayed()) {
			System.out.println("Functional Testing Check Box is Displayed ");
		} else {
			System.out.println("Functional Testing Check Box is Not Displayed ");
		}

		// Verify Functional Testing Check Box Enabled or Not
		if (functionalTestingChk.isEnabled()) {
			System.out.println("Functional Testing Check Box is Enabled");
		} else {
			System.out.println("Functional Testing Check Box is Not Enabled");
		}

		// Verify Functional Testing Check Box Selected or Not-Initial State(not Selected)
		if (functionalTestingChk.isSelected()) {
			System.out.println("Functional Testing Check Box is Selected");
		} else {
			System.out.println("Functional Testing Check Box is Not Selected");
			// Click on Functional Testing check Box
			functionalTestingChk.click();
			System.out.println("Functional Testing Check Box is checked");
		}

		// Enter Your Query
		WebElement enterYourQuery = driver.findElement(By.id(enterYourQueryLocator));
		// Verify the Enter Your Query is Displayed or not
		if (enterYourQuery.isDisplayed()) {
			System.out.println("Enter Your Query is Displayed");

		} else {
			System.out.println("Enter Your Query is not Displayed");
		}
		// Verify the Enter Your Query is enabled or not
		if (enterYourQuery.isEnabled()) {
			System.out.println("Enter Your Query is Enabled");
			// Enter Your Query Value
			enterYourQuery.sendKeys(enterYourQueryInput);
			System.out.println("The Query Enter is " + enterYourQueryInput);
		} else {
			System.out.println("Enter Your Query is not Enabled");
		}

		// Enter Any Two Digits
		WebElement enterTwoDigits = driver.findElement(By.id(enterTwoDigitsLocator));
		// Verify the Enter Any Two Digits is Displayed or not
		if (enterTwoDigits.isDisplayed()) {
			System.out.println("Enter Any Two Digits is Displayed");
		} else {
			System.out.println("Enter Any Two Digits is not Displayed");
		}

		// Verify the Enter Any Two Digits is enabled or not
		if (enterTwoDigits.isEnabled()) {
			System.out.println("Enter Any Two Digits is Enabled");

			// Retrieve the Verification Number during run time and enter value.
			String text=driver.findElement(By.xpath("//*[@id=\"item-vfb-2\"]/ul/li[1]/span/label")).getText();
			String num[]=text.split(":");    //Example: 50
			enterTwoDigits.sendKeys(num[1].trim());
			System.out.println("Enter Any Two Digits is: " + num[1]);
		} else {
			System.out.println("Enter Any Two Digits is not Enabled");
		}

		// Submit button
		WebElement submitBtn = driver.findElement(By.id(submitBtnLocator));
		// Verify The Submit Button is displayed or Not
		if (submitBtn.isDisplayed()) {
			System.out.println("Submit Button is Displayed ");
		} else {
			System.out.println("Submit Button is Not Displayed ");
		}

		// Verify The Submit Button is Enabled or Not
		if (submitBtn.isEnabled()) {
			System.out.println("Submit Button is Enabled");
			// Click on Submit Button
			submitBtn.click();
			System.out.println("Submit Button is Clicked");
		}
		else
		{
			System.out.println("Submit Button is not Enabled");
		}
	}
	
	@Test(priority=3)
	public void validateSuccessfulMsg() {
		// Step:7 Submit the Form.
		WebElement successfulMsgText = driver.findElement(By.xpath(successfulMsgTextLocator));
		// Verify Successful message Text displayed or not
		if (successfulMsgText.isDisplayed()) {
			System.out.println("Successful Message Text is Displayed");			
		} 
		else 
		{
			System.out.println("Successful Message Text is not Displayed");
		}

		// Validating Successful Message Text
		String actSuccessfulMsgText = successfulMsgText.getText();
		String expSuccessfulMsgText = successfulMessageTextInput;

		if (actSuccessfulMsgText.contains(expSuccessfulMsgText)) {
			System.out.println("Actual and expected Successful Message are same");
			System.out.println("Successful Message is " + actSuccessfulMsgText);

			// Retrieve the transaction number from the output message
			String arrMsg[]=actSuccessfulMsgText.split(":");    
			String transNum = arrMsg[1].trim();		
			System.out.println("Transaction ID is "+ transNum);
		} 
		else 
		{
			System.out.println("Actual and expected Successful Message Text are not same");
			System.out.println("Actual Successful Message is " + actSuccessfulMsgText);
			System.out.println("Expected Successful Message is " + expSuccessfulMsgText);
		} 	
	}
	  
}
