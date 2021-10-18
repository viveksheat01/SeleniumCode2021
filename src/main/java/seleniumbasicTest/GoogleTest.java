package seleniumbasicTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/viveksingh/Documents/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		String titel = driver.getTitle();
		System.out.println("get title in google " + titel);

		if (titel.equals("Google")) {

			System.out.println("google title passs sucess full");

		} else {
			System.out.println("google title not match ");
		}
		// driver.quit();

		driver.close();
		String titel1 = driver.getTitle();
		System.out.println("get title inksavnkn google " + titel1);

	}

}
