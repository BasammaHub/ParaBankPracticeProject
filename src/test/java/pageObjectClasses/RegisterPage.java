package pageObjectClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage
{

	public RegisterPage(WebDriver driver) 
	{
		super(driver);

	}

	By firstNameField=By.xpath("//input[@id='customer.firstName']");
	By LastNameField=By.xpath("//input[@id='customer.lastName']");
	By addressFiled=By.xpath("//input[@id='customer.address.street']");
	By cityField=By.xpath("//input[@id='customer.address.city']");
	By stateField=By.xpath("//input[@id='customer.address.state']");
	By zipCode=By.xpath("//input[@id='customer.address.zipCode']");
	By phoneNo=By.xpath("//input[@id='customer.phoneNumber']");
	By ssnField=By.xpath("//input[@id='customer.ssn']");
	By UserNameField=By.xpath("//input[@id='customer.username']");
	By passwordField=By.xpath("//input[@id='customer.password']");
	By confirmPasswordField=By.xpath("//input[@id='repeatedPassword']");
	By registerButton=By.xpath("//input[@value='Register']");
	By successMessage=By.xpath("//p[text()='Your account was created successfully. You are now logged in.']");

	public void enterFN(String firstName)
	{
		driver.findElement(firstNameField).sendKeys(firstName);
	}

	public void enterLN(String lastName)
	{
		driver.findElement(LastNameField).sendKeys(lastName);

	}

	public void enterAddress(String address)
	{
		driver.findElement(addressFiled).sendKeys(address);
	}

	public void entercity(String city)
	{
		driver.findElement(cityField).sendKeys(city);
	}

	public void enterstate(String state)
	{
		driver.findElement(stateField).sendKeys(state);
	}

	public void enterZipCode(String zipcode)
	{
		driver.findElement(zipCode).sendKeys(zipcode);
	}

	public void enterPhoneNo(String phone)
	{
		driver.findElement(phoneNo).sendKeys(phone);
	}

	public void enterSSN(String ssnNo)
	{
		driver.findElement(ssnField).sendKeys(ssnNo);
	}

	public void enterusername(String username)
	{
		driver.findElement(UserNameField).sendKeys(username);
	}

	public void Enterpassword(String password)
	{
		driver.findElement(passwordField).sendKeys(password);
	}

	public void confirmPassword(String password)
	{
		driver.findElement(confirmPasswordField).sendKeys(password);
	}

	public void tapOnRegisterButton()
	{
		driver.findElement(registerButton).click();
	}
	
	public boolean isRegistrationSuccessful()
	{
		return driver.findElement(successMessage).isDisplayed();
	}

}
