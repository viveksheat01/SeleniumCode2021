package seleniumbasicTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatoresConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

		// create webelemrnt + perform action (click sendkey, get text isDispleyed
		// etc..)

		// findelement orver redding by webdriver interface,
		// By is class in sekneium

		// 1.
		// driver.findElement(By.id("input-email")).sendKeys("viveksingh1478@gmail.com");
		// driver.findElement(By.id("input-password")).sendKeys("redhat@143");

		// 2.
		/*
		 * WebElement emialId = driver.findElement(By.id("input-email")); WebElement pwd
		 * = driver.findElement(By.id("input-password"));
		 * 
		 * 
		 * emialId.sendKeys("naveen@gmail.com"); pwd.sendKeys("naveen@123");
		 */

		// 3.

		/*
		 * By email = By.id("input-email"); By pwd = By.id("input-password");
		 * 
		 * driver.findElement(email).sendKeys("naveen@gmail.com");
		 * driver.findElement(pwd).sendKeys("naveen@123");
		 */
		// 4.

		/*
		 * By email = By.id("input-email"); By pwd = By.id("input-password");
		 * 
		 * WebElement eid=driver.findElement(email); WebElement
		 * pwdId=driver.findElement(pwd);
		 * 
		 * eid.sendKeys("naveen@123hmail.com"); pwdId.sendKeys("12345");
		 */

		// 5. generic function : getElement();
		/*
		 * By email = By.id("input-email"); By pwd = By.id("input-password");
		 * 
		 * getElement(email).sendKeys("naveen@gmail.com");
		 * getElement(pwd).sendKeys("naveen@123");
		 */
		// 6.
		/*
		 * By email = By.id("input-email"); By pwd = By.id("input-password");
		 * dosendKeys(email, "naveen@gmail.com"); dosendKeys(pwd, "naveen@123");
		 */

		By email = By.id("input-email");
		By pwd = By.id("input-password");

		ElementUtils eleUtil = new ElementUtils(driver);
		eleUtil.dosendKeys(email, "naveen@gmail.com");
		eleUtil.dosendKeys(pwd, "naveen@123");
	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);

	}

	public static void dosendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

}
