package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmail;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPswd;
	
	@FindBy(xpath = "//button[@class='btn btn-primary btn-lg hidden-xs']")
	WebElement loginBtn;
	
	//Action Methods
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	
	public void setPassword(String pswd)
	{
		txtEmail.sendKeys(pswd);
	
}
	
	
	public void clickLoginBtn()
	{
		loginBtn.click();
	}
}
