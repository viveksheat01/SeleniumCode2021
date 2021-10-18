package seleniumbasicTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariBrowserTest {

	public static void main(String[] args) {

		WebDriver driver = new SafariDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/login");

		System.out.println(driver.getTitle());

	}

}
