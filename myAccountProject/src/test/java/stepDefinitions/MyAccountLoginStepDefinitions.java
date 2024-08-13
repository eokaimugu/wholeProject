package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyAccountLoginStepDefinitions {
	public WebDriver driver=null;
	
			@Given("open browser")
		public void open_browser() {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
						
		}

		@When("user Enters the url {string}")
		public void user_enters_the_url(String string) {
			
		String url = "https://practice.automationtesting.in/";
		driver.get(url);		    
		}
		@When("Clicks on My Account Menu")
		public void clicks_on_my_account_menu() {
			
		driver.findElement(By.xpath("//a[normalize-space()='My Account']")).click();		
			
		}

		@When("Enters registered username and password")
		public void enters_registered_username_and_password() {
		    
			driver.findElement(By.id("username")).sendKeys("okaius@comcast.net");
			driver.findElement(By.id("password")).sendKeys("2Cor5+vrs17");
			
			
		}

		@When("clicks on login button")
		public void clicks_on_login_button() {
		  
			driver.findElement(By.xpath("//input[@name='login']")).click();			
			
		}

		@Then("User must successfully login to the application page")
		public void user_must_successfully_login_to_the_application_page() {
		    
			String capText =  driver.findElement(By.xpath("//strong[normalize-space()='okaius']")).getText();
			Assert.assertEquals(true, capText.contains("Okaius"));
			
		}

	
	

}
