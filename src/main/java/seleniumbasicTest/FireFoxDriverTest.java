package seleniumbasicTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriverTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/viveksingh/Documents/drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.get("https:www.google.com");
		driver.quit();
	}

}
