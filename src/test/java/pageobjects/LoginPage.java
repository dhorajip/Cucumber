package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By uName = By.id("email");
	By pswd = By.name("passwd");
	By loginBtn = By.id("SubmitLogin");

	public void enterUsername(String user) {
		driver.findElement(uName).sendKeys(user);
	}

	public void enterPassword(String pass) {
		driver.findElement(pswd).sendKeys(pass);
	}

	public void clickLogin() {
		driver.findElement(loginBtn).click();
	}

	/*
	 * @FindBy(id="email") WebElement uNameElement;
	 * 
	 * @FindBy(name="passwd") WebElement pswdElement;
	 * 
	 * @FindBy(id="SubmitLogin") WebElement loginBtnElement;
	 * 
	 * public void enterUsername(String user) { uNameElement.sendKeys(user); }
	 * 
	 * public void enterPassword(String pass) { pswdElement.sendKeys(pass); }
	 * 
	 * public void clickLogin() { loginBtnElement.click(); }
	 */

}
