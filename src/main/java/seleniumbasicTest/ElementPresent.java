package seleniumbasicTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementPresent {
	static WebDriver driver;

	public static void main(String[] args) {
		browserUtils brws = new browserUtils();
		driver = brws.initDriver("chrome");
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);

		// brws.launchUrl("https://www.google.co.in/");
		brws.launchUrl("https://demo.opencart.com/index.php?route=account/login");

		/*
		 * List<WebElement> serchList = driver.findElements(serch); if (serchList.size()
		 * == 1) { System.out.println(" serach field is paresnt in the : page");
		 * 
		 * } else { System.out.println("not presnt ......."); }
		 */

		// System.out.println(checkElementDisplayed(serch));

		By serch = By.name("search");
		By forgotpwd = By.linkText("Forgotten Password");
		System.out.println(checkElementDisplayed(serch, 1));
		System.out.println(checkElementDisplayed(forgotpwd, 2));
	}

	public static List<WebElement> getElements(By locator) {

		return driver.findElements(locator);

	}

	public static boolean checkElementDisplayed(By locator) {
		if (getElements(locator).size() == 1)
			return true;
		return false;
	}

	public static boolean checkElementDisplayed(By locator, int elementOccurence) {
		if (getElements(locator).size() == elementOccurence)
			return true;
		return false;
	}

}
