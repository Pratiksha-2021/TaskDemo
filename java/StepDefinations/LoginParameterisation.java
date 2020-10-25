package StepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginParameterisation {
	WebDriver driver;
	@Before
	public void  setup(){
		System.setProperty("webdriver.chrome.driver", "chromedriver83.exe");
		 driver=new ChromeDriver();
	}
	
	@After
	public void end(){
		driver.close();
	}
	
	@Given("^user fill \"([^\"]*)\"$")
	public void user_fill(String url) throws Throwable {
		driver.get(url);
	
	}

	@Then("^logo  display$")
	public void logo_display() throws Throwable {
		boolean logo=driver.findElement(By.xpath("//img")).isDisplayed();
		Assert.assertEquals(logo, true);
	    
	}

	@When("^user fill \"([^\"]*)\" and <\"([^\"]*)\">$")
	public void user_fill_and(String uname, String psw) throws Throwable {
	driver.findElement(By.id("email")).sendKeys(uname);
	driver.findElement(By.id("password")).sendKeys(psw);
	driver.findElement(By.xpath("//button")).click();
 }

	@Then("^user  on Home page$")
	public void user_on_Home_page() throws Throwable {
	String title=driver.getTitle();
		Assert.assertEquals("JavaByKiran | Dashboard", title);
	
	}






}
