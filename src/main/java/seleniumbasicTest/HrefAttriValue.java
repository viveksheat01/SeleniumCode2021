package seleniumbasicTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HrefAttriValue {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		browserUtils brws = new browserUtils();
		WebDriver driver = brws.initDriver("chrome");
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);

		brws.launchUrl("https://www.amazon.in/");
		// String str = driver.findElement(By.linkText("About
		// Us")).getAttribute("href");
		// System.out.println(str);
		// String value =
		// driver.findElement(By.xpath("//img[@alt='Chimneys']")).getAttribute("src");
		// System.out.println(value);

		By value = By.xpath("//img[@alt='Chimneys']");

		By text = By.linkText("About Us");

		ElementUtils util = new ElementUtils(driver);
		String srcValue = util.dogetAttributeValue(value, "src");
		String hrefValue = util.dogetAttributeValue(text, "href");
		System.out.println(srcValue);
		System.out.println(hrefValue);
		driver.quit();

	}

}
