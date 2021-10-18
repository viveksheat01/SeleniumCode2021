package seleniumbasicTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHrmRegistationPageTest {

	public static void main(String[] args) {
		browserUtils br = new browserUtils();
		WebDriver driver = br.initDriver("chrome");
		br.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		System.out.println(br.getPagetitle());

		By firstName = By.id("Form_submitForm_Name");
		By emailId = By.id("Form_submitForm_Email");
		By phone = By.id("Form_submitForm_Contact");

		ElementUtils eleutils = new ElementUtils(driver);
		eleutils.dosendKeys(firstName, "test12");
		eleutils.dosendKeys(emailId, "test12@gmail.com");
		eleutils.dosendKeys(phone, "1234556677");
		br.quiteBrowser();

	}

}
