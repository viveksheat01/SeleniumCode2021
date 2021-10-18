package seleniumbasicTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author viveksingh
 *
 */
public class browserUtils {

	public WebDriver driver;

	/**
	 * this method used to init the driver on the basis of given browser Name
	 * 
	 * @param browserName
	 * @return it return driver
	 */

	public WebDriver initDriver(String browserName) {
		System.out.println("browser name is :" + browserName);

		if (browserName.equalsIgnoreCase("chrome")) {
			// System.setProperty("webdriver.chrome.driver",
			// "/Users/viveksingh/Documents/drivers/chromedriver");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			// System.setProperty("webdriver.gecko.driver",
			// "/Users/viveksingh/Documents/drivers/geckodriver");
			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();

		} else {
			System.out.println("please print the right browser " + browserName);
		}
		return driver;

	}

	public void launchUrl(String url) {
		if (url == null || url.isEmpty()) {
			System.out.println("ur is incorrect ");
			return;

		}
		driver.get(url);
	}

	public String getPagetitle() {
		return driver.getTitle();

	}

	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	public void classBrowser() {
		driver.close();
	}

	public void quiteBrowser() {
		driver.quit();
	}

}
