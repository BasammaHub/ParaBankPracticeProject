package pageObjectClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage
{

	public HomePage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	By firstRegisterButton=By.xpath("//a[text()='Register']");
	
	public void tapOnfirstRegButton()
	{
		driver.findElement(firstRegisterButton).click();
	}
	
	
	

}
