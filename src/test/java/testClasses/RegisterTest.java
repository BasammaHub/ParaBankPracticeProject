package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class RegisterTest extends BaseClass
{
	Faker faker = new Faker();
	
	@Test
	public void registerTestCase_001()
	{
		hp.tapOnfirstRegButton();
		String fn=faker.name().firstName();
		rp.enterFN(fn);
		String ln=faker.name().lastName();
		rp.enterLN(ln);
		rp.enterAddress(faker.address().fullAddress());
		rp.entercity(faker.address().city());
		rp.enterstate(faker.address().state());
		rp.enterZipCode(faker.address().zipCode());
		rp.enterPhoneNo(faker.phoneNumber().cellPhone());
		rp.enterSSN("183-45-8789");
		String un=faker.name().firstName()+ "1123";
		rp.enterusername(un);
		String pass=faker.internet().password();
		rp.Enterpassword(pass);
		rp.confirmPassword(pass);
		System.out.println("username is " +un);
		System.out.println("Password is" +pass);
		
		//Submit the form
		rp.tapOnRegisterButton();
		
		//Validate the Registration
		Assert.assertTrue(rp.isRegistrationSuccessful(),"Registration was not successful!");
		
		
	}

}
