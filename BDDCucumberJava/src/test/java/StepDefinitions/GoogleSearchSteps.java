package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {

	WebDriver driver = null;

	@Given("browser is open")
	public void browser_is_open() throws InterruptedException {
		System.out.println("inside Step- browser is open");
		String projectPath = System.getProperty("user.dir");
		System.setProperty("Webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(20);

	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("inside Step- user is on google search page");
		driver.navigate().to("https://google.com");
	}

	@When("user enters a test in search box")

	public void user_enters_a_test_in_search_box() throws InterruptedException {
		System.out.println("inside Step- user enters a test in search box");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		Thread.sleep(2000);

	}

	@And("user hits on search box")
	public void user_hits_on_search_box() throws InterruptedException {
		System.out.println("inside Step- user hits on search box");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("inside Step- user is navigated to search results ");

		driver.getPageSource().contains("Online Courses");
		driver.close();
		driver.quit();
	}

}
