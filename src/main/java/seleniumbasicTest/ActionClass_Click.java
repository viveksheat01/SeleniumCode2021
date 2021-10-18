package seleniumbasicTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass_Click {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By id = By.id("Form_submitForm_Name");
		By email = By.id("Form_submitForm_Email");

		By privacyPolicy = By.linkText("Privacy Policy");
		Actions act = new Actions(driver);

		act.sendKeys(driver.findElement(id), "vivek").perform();
		act.sendKeys(driver.findElement(email), "viveksingh@gmail.com").perform();
		act.click(driver.findElement(privacyPolicy)).build().perform();
		// Element not InteractableExcetion -- Action send key

	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);
	}

	public static void doActionsSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).build().perform();
	}

	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator)).build().perform();
	}
}
