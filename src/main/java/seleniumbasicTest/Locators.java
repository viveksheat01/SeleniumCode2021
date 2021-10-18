package seleniumbasicTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	static WebDriver driver;

	public static void main(String[] args) {

		// 1. ID : is a unique locator
		// 2. Name:
		// 3. className
		// 4. xpath
		// 5. cssSelector
		// 6. linlText
		// 7. partialLinkText
		// 8. tagName

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// driver.get("https://www.freshworks.com/");
		driver.get("https://classic.freecrm.com/index.html?e=1");

		// By fn = By.name("firstname");
		// driver.findElement(fn).sendKeys("vivek");

		ElementUtils eleutil = new ElementUtils(driver);
		// eleutil.dosendKeys(fn, "test");
		// 3. className

		//
		// linkText
		// By signUp = By.linkText("Sign Up");
		// doClick(signUp);

		// By header = By.tagName("h2");
		// String headerText = dogettext(header);
		// System.out.println(headerText);
		// String str = driver.findElement(By.tagName("h2")).getText();
		// System.out.println(str);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public static String dogettext(By locator) {
		return getElement(locator).getText();
	}

}
