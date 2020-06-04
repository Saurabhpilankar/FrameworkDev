package qaDemo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class NavigateHome extends Base {

	@BeforeTest
	public void init() throws IOException {
		driver = InitializeDriver();

	}

	@Test(dataProvider = "LoginData")
	public void NavigateToHome(String User, String Pass) {

		driver.get(pr.getProperty("url"));

		LandingPage lp = new LandingPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		lp.Login_Menu().click();

		LoginPage lgn = new LoginPage(driver);
		lgn.User_name().sendKeys(User);
		lgn.password().sendKeys(Pass);
		lgn.loginButton().click();
		
	}

	@DataProvider(name = "loginDetail")
	public Object[][] LoginData() {

		Object[][] data = new Object[2][2];

		data[0][0] = "abcdefg@hj.com";
		data[0][1] = "pass1";

		data[1][0] = "lmnopqrst@hj.com";
		data[1][1] = "pass222";
		return data;

	}

	@AfterTest
	public void browserClose() {

		driver.close();
	}

}
