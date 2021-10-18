package seleniumbasicTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandleAttribute {
	static WebDriver driver;

	public static void main(String[] args) {
		browserUtils brws = new browserUtils();
		WebDriver driver = brws.initDriver("chrome");
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		brws.launchUrl("https://classic.freecrm.com/register/");
		System.out.println(brws.getPagetitle());

		String value = driver.findElement(By.name("first_name")).getAttribute("type");
		System.out.println(value);
		/*
		 * String disablevalue =
		 * driver.findElement(By.id("submitButton")).getAttribute("disabled");
		 * System.out.println(disablevalue); if (disablevalue.equals("true")) {
		 * System.out.println("element is disable");
		 * 
		 * }
		 */

		By submitbutt = By.id("submitButton");
		System.out.println(checkElementDisabled(submitbutt, "disabled"));
	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);

	}

	public static String dogetAttributeValue(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}

	public static boolean checkElementDisabled(By locator, String atriName) {

		String atrValue = getElement(locator).getAttribute(atriName);
		if (atrValue.equals("true")) {
			return true;

		}
		return true;

	}

}
