package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;
	public Properties pr;
	
	
	
	public WebDriver InitializeDriver() throws IOException {
		 pr= new Properties();
		FileInputStream fs = new FileInputStream("C:\\Users\\Arsenal\\eclipse-workspace\\FinalProject\\src\\main\\java\\resources\\data.properties");
		pr.load(fs);
		
		String br =pr.getProperty("browser");
		String main_url = pr.getProperty("url");
		
			if (br.equalsIgnoreCase("chrome")) {
				
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			
			else {
				 driver = new FirefoxDriver();
			}
			
			return driver;
	}
	
	
	

}
