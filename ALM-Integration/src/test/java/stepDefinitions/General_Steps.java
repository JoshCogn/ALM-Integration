package stepDefinitions;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class General_Steps {
	
	WebDriver driver;
	
	@Before("@Initial")
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\695136\\Software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	
	@After("@Initial")
	public void afterTest() {
		driver.close();
	}

	
	@Given("^user is at google home page$")
	public void user_is_at_google_home_page() throws Throwable {
		driver.get("https://www.google.com/");
	}

	@When("^User searches for \"([^\"]*)\"$")
	public void user_searches_for(String arg1) throws Throwable {
		driver.findElement(By.id("lst-ib")).sendKeys(arg1, Keys.ENTER);
	}

	@Then("^user is directed to search results page$")
	public void user_is_directed_to_search_results_page() throws Throwable {
	    assertTrue(driver.getTitle().contains("- Google Search"));
	}
	
}
