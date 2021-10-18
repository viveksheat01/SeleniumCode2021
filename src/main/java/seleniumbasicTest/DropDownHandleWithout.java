package seleniumbasicTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithout {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		// WebElement country = driver.findElement(By.id("Form_submitForm_Country"));
		By country = By.xpath("//select[@id='Form_submitForm_Country']/option");
		selectdropdownWithoutSelect(country, "India");
	}

	public List<WebElement> getElements(By locator) {

		return driver.findElements(locator);

	}

	public static void selectdropdownWithoutSelect(By locator, String value) {
		List<WebElement> optionList = driver.findElements(locator);

		for (WebElement e : optionList) {
			String text = e.getText();
			if (text.equals(value)) {
				e.click();
				break;

			}
		}
	}

}
