package seleniumbasicTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleLangLink {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		browserUtils brws = new browserUtils();
		driver = brws.initDriver("chrome");
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);

		// brws.launchUrl("https://www.google.co.in/");
		brws.launchUrl("https://demo.opencart.com/index.php?route=account/register");

		// By LangLinakxpath = By.xpath("//div[@id='SIvCob']/a");
		// doLinkClick(LangLinakxpath, "മലയാളം");
		By footer = By.xpath("//footer//a");
		doLinkClick(footer, "Contact Us");
	}

	public static List<WebElement> getElements(By locator) {

		return driver.findElements(locator);

	}

	public static void doLinkClick(By locartor, String linkValue) {
		List<WebElement> LagList = getElements(locartor);
		System.out.println(LagList.size());

		for (WebElement e : LagList) {
			String text = e.getText();
			System.out.println(text);
			if (text.trim().equals(linkValue)) {
				e.click();
				break;

			}
		}
	}
}
