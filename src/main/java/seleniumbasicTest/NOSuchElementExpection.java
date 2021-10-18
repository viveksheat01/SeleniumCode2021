package seleniumbasicTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NOSuchElementExpection {
	static WebDriver driver;

	public static void main(String[] args) {
		browserUtils brws = new browserUtils();
		driver = brws.initDriver("chrome");
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);

		// brws.launchUrl("https://www.google.co.in/");
		brws.launchUrl("https://demo.opencart.com/index.php?route=account/login");

		By serch = By.name("search1");
		By forgotpwd = By.linkText("Forgotten Password");

		// driver.findElement(serch).sendKeys("macbook");

		// Note : findElemnt if elment not presnt through NoSuchElementExpection
		// 2. findElemnts if element is not presnt though 0

		List<WebElement> searchList = driver.findElements(serch);
		System.out.println(searchList.size());
	}

}
