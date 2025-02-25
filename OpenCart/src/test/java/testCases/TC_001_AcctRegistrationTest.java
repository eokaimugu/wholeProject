package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

	public class TC_001_AcctRegistrationTest extends BaseClass {

	@Test
	public void verifyRegistration()
	{
		logger.info("----Starting TC_001_AcctRegistrationTest-----");
		
		try {
			
		
		HomePage hp = new HomePage(driver);
		hp.clickRegister();
		logger.info("Clicked on register button");
		// Account Registration Page

		RegistrationPage rp = new RegistrationPage(driver);

		/*
		 * rp.inputUserName("okiaus"); rp.inputFirstName("Cire");
		 * rp.inputlastName("Iako"); rp.setEmail("kaius123@gmail.com");
		 * rp.setPassword("sansa"); rp.clickRegister();
		 */
		logger.info("Entering customer details");
		
		rp.inputUserName(randomString().toLowerCase());
		rp.inputFirstName(randomString().toUpperCase());
		rp.inputlastName(randomString().toUpperCase());
		rp.setEmail(randomString() + "@gmail.com");
		rp.setPassword(randomAlphaNumeric() + "!#$");
		rp.clickRegister();

		String msg = rp.getConfirmationMsg();
		// Assert.assertEquals(true, "Welcome to OpenCart, your account has been
		// created");
		Assert.assertEquals(msg, "Welcome to OpenCart, your account has been created");
	}catch(Exception e) {
		logger.error("Test failed");
		Assert.fail();
	}
		logger.info("---TC_001_AcctRegistrationTest completed");
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(prop.getProperty("email"));
		lp.setPassword(prop.getProperty("password"));
		lp.clickLoginBtn();
	}
	
		
}
