package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage extends BasePage {
	
	
	public RegistrationPage(WebDriver driver) {
		
		super(driver);
	}

	//Locators
	
	@FindBy(xpath="//input[@id='input-username']")
	WebElement txtUserName;
	
	@FindBy(id="input-firstname")
	WebElement txtFname;
	
	@FindBy(id="input-lastname")
	WebElement txtLname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//select[@id='input-country']")
	WebElement drpCountry;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPswd;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-lg hidden-xs']")
	WebElement clickRegisterBtn;
	
	@FindBy(xpath="//h3[normalize-space()='Welcome to OpenCart, your account has been created']")
	WebElement confirmationMsg;
	
	//Action methods
	
	public void inputUserName(String userName) {
		txtUserName.sendKeys(userName);
	}
	
	public void inputFirstName(String fName) {
		txtFname.sendKeys(fName);
	}
	
	public void inputlastName(String lName) {
		txtLname.sendKeys(lName);
	}
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}

	public void setPassword(String pwd) {
		txtPswd.sendKeys(pwd);
	}

	
	public void clickRegister() {
		clickRegisterBtn.click();
	}
			
	//public void clickRegisterBtn() {
	//	clickRegisterBtn.submit();
	//}
	
	
	Actions act = new Actions(driver);
	//act.moveToElement(clickRegisterBtn).click().perform();
	
	
	//JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("arguments[0].click();", clickRegisterBtn);
	
	//clickRegisterBtn.sendKeys(Keys.RETURN);
	
	//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//mywait.until(ExpectedConditions.elementToBeClickable(clickRegisterBtn)).click();
	
	
	public String getConfirmationMsg() {
		try {
		return (confirmationMsg.getText());
	}catch(Exception e) {
		return(e.getMessage());
	}
		
	}
	
}
