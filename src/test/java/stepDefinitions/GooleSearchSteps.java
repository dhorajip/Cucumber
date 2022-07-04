package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GooleSearchSteps {
	WebDriver driver = null;

	@Given("Browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Given("User is on google search page")
	public void user_is_on_google_search_page() {
		driver.navigate().to("https://www.google.ca/");
	}

	@When("User enters a test in serach box")
	public void user_enters_a_test_in_serach_box() {
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"))
				.sendKeys("Software Automation Testing");
	}

	@When("User hits enter")
	public void user_hits_enter() {
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"))
				.sendKeys(Keys.ENTER);
	}

	@Then("User is navigated to serach results")
	public void user_is_navigated_to_serach_results() {
		driver.getPageSource().contains("Software Automation Testing");
		driver.close();
		driver.quit();

	}
}
