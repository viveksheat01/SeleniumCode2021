package seleniumbasicTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		browserUtils br = new browserUtils();
		WebDriver driver = br.initDriver("chrome");
		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		System.out.println(br.getPagetitle());
		By email = By.id("input-email");
		By pwd = By.id("input-password");

		ElementUtils eleUtil = new ElementUtils(driver);
		eleUtil.dosendKeys(email, "viveksingh1478@gmail.com");
		eleUtil.dosendKeys(pwd, "redhat@143");
		br.quiteBrowser();
	}

}
