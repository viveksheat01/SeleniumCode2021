package seleniumbasicTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionList {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		By seach = By.name("q");
		By suggestionList = By.xpath("//ul[@role='listbox']/li//div[@class='wM6W7d']//span");
		googleserchSelect(seach, suggestionList, "selenium automation", "selenium automation tutorial");

	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);

	}

	public static List<WebElement> getElements(By locator) {

		return driver.findElements(locator);

	}

	public static void googleserchSelect(By search, By guggestion, String searchKey, String value)
			throws InterruptedException {

		getElement(search).sendKeys(searchKey);
		Thread.sleep(2000);
		List<WebElement> suggList = driver.findElements(guggestion);
		System.out.println(suggList.size());

		for (WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(value)) {
				e.click();
				break;

			}
		}

	}

}
