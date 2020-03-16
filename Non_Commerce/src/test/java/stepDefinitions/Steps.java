package stepDefinitions;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObjects.LoginPage;

public class Steps {
	public WebDriver driver;
	public LoginPage lp;
	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", ".//Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		lp=new LoginPage(driver);
		
	}
	
	@Given("user open browser")
	public void user_open_browser() {
	   driver.manage().window().maximize();
	   driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("user enter url {string}")
	public void user_enter_url(String url) {
	   driver.get(url);
	}

	@When("user get page with title {string}")
	public void user_get_page_with_title(String title) {
		Assert.assertEquals(title, driver.getTitle());
	  
	}

	@When("user enter email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String password) throws InterruptedException {
		lp.enterEmailandpassword(email, password);
	   
	}

	@When("user click on login button")
	public void user_click_on_login_button() throws InterruptedException {
	   lp.clickOnLoginButton();
	   }

	@Then("user get the page with {string}")
	public void user_get_the_page_with(String title) {
		Assert.assertEquals(title, driver.getTitle());
	   
	}

	@Then("user click on logout button")
	public void user_click_on_logout_button() throws InterruptedException {
		 lp.clickOnLogoutButton();
	}

	

	@Then("user close browser")
	public void user_close_browser() throws InterruptedException {
		Thread.sleep(2000);
	   driver.quit();
	}




}
