package pageObjectClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage
{

	public LoginPage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	By userNameField=By.xpath("//input[@name='username']");
	By passwordField=By.xpath("//input[@name='password']");
	By tapOnLoginButton=By.xpath("//input[@value='Log In']");
	By successMessage=By.xpath("//b[text()='Welcome']");
	
	public void enterUN(String username)
	{
		driver.findElement(userNameField).sendKeys(username);
	}
	
	public void enterpassword(String password)
	{
		driver.findElement(passwordField).sendKeys(password);
	}

	public void login()
	{
		driver.findElement(tapOnLoginButton).click();
	}
	
	public boolean isloginSuccess()
	{
		return driver.findElement(successMessage).isDisplayed();
	}
}
