package seleniumbasicTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDown {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		driver.findElement(By.id("justAnInputBox")).click();

		By choices = By.xpath("//span[@class='comboTreeItemTitle']");
		// T.C 01
		// selectChoice(choices, "choice 1", "choice 7", "choice 4");
		// T.C 02
		// selectChoice(choices, "choice 7");
		// T.C 03
		selectChoice(choices, "ALL");

	}

	public static void selectChoice(By locator, String... value) {
		List<WebElement> choicelist = driver.findElements(locator);

		for (int i = 0; i < choicelist.size(); i++) {
			String text = choicelist.get(i).getText();
			System.out.println(text);
			for (int j = 0; j < value.length; j++) {
				if (text.equals(value[j])) {

					choicelist.get(i).click();
					break;

				}

			}

		}

	}

}
