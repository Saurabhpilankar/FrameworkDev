package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;

	By Username = By.id("user_email");
	By Password = By.id("user_password");
	By LoginBtn = By.cssSelector("[type='submit']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement User_name() {
		return driver.findElement(Username);
	}

	public WebElement password() {
		return driver.findElement(Password);
	}

	public WebElement loginButton() {
		return driver.findElement(LoginBtn);
	}
}
