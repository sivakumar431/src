package stepDefenitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionOfLoginPage {
	WebDriver driver;

	@Given("User is on the Login Page")
	public void user_is_on_the_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Siva_Sardhar\\eclipse-workspace\\CucumberBddDemo\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String string) {
		driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys(string);

	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String string) {
		driver.findElement(By.xpath("//input[@name=\"txtPassword\"]")).sendKeys(string);
	}

	@When("I click on Login button")
	public void i_click_on_login_button() {
		driver.findElement(By.xpath("//input[@name=\"Submit\"]")).click();

	}

	@Then("I validate user is on dashboard page")
	public void i_validate_user_is_on_dashboard_page() {
		WebElement dashboard = driver.findElement(By.xpath("//h1[text()=\"Dashboard\"]"));
		dashboard.isDisplayed();

	}

}
