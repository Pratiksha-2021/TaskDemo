/*package StepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginDefination {
	WebDriver driver;
	@Given("^Browser should be open$")
	public void browser_should_be_open() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "chromedriver83.exe");
	 driver=new ChromeDriver();
		
	}

	@Then("^user enter url$")
	public void user_enter_url() throws Throwable {
	driver.get("file:///E:/Offline%20Website/index.html");
	driver.manage().window().maximize();
	
	}

	@Then("^logo should display$")
	public void logo_should_display() throws Throwable {
		driver.findElement(By.xpath("//img")).isDisplayed();
		Assert.assertTrue("logo is dispaly", true);
	   
	}
	@Given("^user should be on login page$")
	public void user_should_be_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "chromedriver83.exe");
		 driver=new ChromeDriver();
		 driver.get("file:///E:/Offline%20Website/index.html");
	}

	@When("^user enters username$")
	public void user_enters_username() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	
	
	}

	@When("^user enters password$")
	public void user_enters_password() throws Throwable {
		driver.findElement(By.id("password")).sendKeys("123456");
	
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//button")).click();
	    
	}

	@Then("^user should be on home page$")
	public void user_should_be_on_home_page() throws Throwable {
Assert.assertEquals("JavaByKiran | Dashboard", driver.getTitle());

	}


}
*/