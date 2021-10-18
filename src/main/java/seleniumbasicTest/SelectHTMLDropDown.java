package seleniumbasicTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectHTMLDropDown {
	static WebDriver driver;

	public static void main(String[] args) {

		// html tag : <select>
		// use select class in selenium

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		// WebElement country = driver.findElement(By.id("Form_submitForm_Country"));
		// Select select = new Select(country);

		// select.selectByIndex(5);
		// select.selectByVisibleText("India");
		// select.selectByValue("Australia");

		// diff B/W selectByValue and selectByVisibleText

		By country = By.id("Form_submitForm_Country");
		// doSelectByVisibleText(country, "India");
		// doSelectByIndex(country, 10);
		doSelectByValues(country, "Australia");

		/// driver.quit();

	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);

	}

	public static void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);

	}

	public static boolean doSelectByValues(By locator, String values) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(values);
		return isDropDownValuesSelected(select, values);

	}

	public static boolean doSelectByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
		return isDropDownValuesSelected(select, text);

	}

	public static boolean isDropDownValuesSelected(Select select, String expvalue) {
		if (select.getFirstSelectedOption().getText().equals(expvalue)) {
			System.out.println(expvalue + ": is selected");
			return true;
		}
		return false;

	}

}
