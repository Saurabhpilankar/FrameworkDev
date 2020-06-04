package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	By LoginMen = By.cssSelector("a[href*='sign_in']");
	By Featured = By.xpath("//div[@class='text-center']/h2");
	By Menus =By.cssSelector("ul.nav.navbar-nav.navbar-right");
	

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement Login_Menu() {
		return driver.findElement(LoginMen);
	}
	
	public WebElement FeaturedTitle() {
		return driver.findElement(Featured);
	}
	
	public WebElement Menubar() {
		return driver.findElement(Menus);
	}

}