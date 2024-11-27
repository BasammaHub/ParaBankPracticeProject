package testClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pageObjectClasses.HomePage;
import pageObjectClasses.LoginPage;
import pageObjectClasses.RegisterPage;

public class BaseClass 
{
	public WebDriver driver;
	public RegisterPage rp;
	public HomePage hp;
	public LoginPage lp;
	
	@BeforeMethod
	public void setUp()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		hp=new HomePage(driver);
		rp=new RegisterPage(driver);
		lp=new LoginPage(driver);
		
		
		
	}
	
	@AfterMethod
	public void teardown()
	{
	if(driver!=null)
	{
		driver.quit();
	}
		
	}

}
