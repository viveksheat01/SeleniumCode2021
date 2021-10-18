package seleniumbasicTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownAllValues {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		// WebElement country = driver.findElement(By.id("Form_submitForm_Country"));
		By country = By.id("Form_submitForm_Country");
		doSelectDropDown(country, "Grenada");

		/*
		 * Select select = new Select(country); List<WebElement> optionList =
		 * select.getOptions(); System.out.println(optionList.size());
		 * 
		 * 
		 * for (int i = 0; i < optionList.size(); i++) {
		 * 
		 * String text = optionList.get(i).getText(); System.out.println(text);
		 * 
		 * }
		 * 
		 * 
		 * for (WebElement e : optionList) { String text = e.getText();
		 * 
		 * System.out.println(text);
		 * 
		 * if (text.equals("India")) { e.click(); break; } }
		 */

	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);

	}

	public static void doSelectDropDown(By locator, String value) {

		Select select = new Select(getElement(locator));
		List<WebElement> optionList = select.getOptions();
		System.out.println(optionList.size());

		for (WebElement e : optionList) {
			String text = e.getText();

			System.out.println(text);

			if (text.equals(value)) {
				e.click();
				break;
			}
		}

	}

}
