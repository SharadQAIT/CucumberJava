package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemo {

	WebDriver driver = null;

	@Given("the user opens the browser")
	public void the_user_opens_the_browser() throws Exception {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("Webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(2000);

	}

	@When("the user navigates to the login page")
	public void the_user_navigates_to_the_login_page() throws Exception {
		driver.navigate().to("https://mahontech.sapphire360.ai/login");
		Thread.sleep(2000);

	}

	@And("enters the correct username and password")
	public void enters_the_correct_username_and_password() throws Exception {
		driver.findElement(By.id("exampleFormControlInput1")).sendKeys("Kevaughanmahon@gmail.com");
		driver.findElement(By.id("inputPassword")).sendKeys("p@ss2wordKEV");
		Thread.sleep(2000);

	}

	@And("clicks the login button")
	public void clicks_the_login_button() throws Exception {
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(2000);

	}

	@And("the user has entered the OTP")
	public void the_user_has_entered_the_otp() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.id("inputPassword")).sendKeys("123456");

	}

	@And("clicks the verify button")
	public void clicks_the_verify_button() throws Exception {
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);

	}

	@Then("the user navigate to home page")
	public void the_user_navigate_to_home_page() {
		System.out.println("The user successfully navigates to the home page after logging in.");
	}

}
