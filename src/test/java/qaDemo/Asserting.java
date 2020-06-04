package qaDemo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class Asserting extends Base {

	@BeforeTest
	public void init() throws IOException {
		driver = InitializeDriver();

		driver.get(pr.getProperty("url"));
	}

	@Test
	public void NavigateToHome() {

		LandingPage l = new LandingPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Assert.assertEquals(l.FeaturedTitle().getText(), "FEATURED COURSES");
	}

	@AfterTest
	public void browserClose() {

		driver.close();
	}
}