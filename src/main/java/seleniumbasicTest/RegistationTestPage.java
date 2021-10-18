package seleniumbasicTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistationTestPage {

	public static void main(String[] args) {

		browserUtils brws = new browserUtils();
		WebDriver driver = brws.initDriver("chrome");
		brws.launchUrl("https://demo.opencart.com/index.php?route=account/register");
		System.out.println(brws.getPagetitle());

		By firstname = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By emailId = By.id("input-email");
		By phone = By.id("input-telephone");
		By pwd = By.id("input-password");
		By confPwd = By.id("input-confirm");

		ElementUtils eleUtil = new ElementUtils(driver);
		eleUtil.dosendKeys(firstname, "test");
		eleUtil.dosendKeys(lastName, "demo");
		eleUtil.dosendKeys(emailId, "testdemo@gmail.com");
		eleUtil.dosendKeys(phone, "1234567890");
		eleUtil.dosendKeys(pwd, "test123");
		eleUtil.dosendKeys(confPwd, "test123");

		brws.quiteBrowser();
	}

}
