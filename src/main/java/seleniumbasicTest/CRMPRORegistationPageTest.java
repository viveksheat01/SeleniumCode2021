package seleniumbasicTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CRMPRORegistationPageTest {

	public static void main(String[] args) {

		browserUtils br = new browserUtils();
		WebDriver driver = br.initDriver("chrome");
		// br.launchUrl("https://classic.crmpro.com/index.html");
		br.launchUrl("https://classic.freecrm.com/register/");

		System.out.println(br.getPagetitle());

		/*
		 * By signUp = By.linkText("Sign Up"); ElementUtils eleutils = new
		 * ElementUtils(driver); eleutils.doClick(signUp);
		 */
		By firstName = By.name("first_name");
		By lastName = By.xpath("//*[@id=\"multipleForm\"]/div[4]/input");
		By email = By.name("email");
		By confEmail = By.name("email_confirm");
		By username = By.xpath("//*[@id=\"username\"]/input");
		By password = By.name("password");
		By confPwd = By.name("passwordconfirm");
		By tearmCond = By.name("agreeTerms");
		By sumbit = By.xpath("//*[@id=\"multipleForm\"]/div[12]/div");
		ElementUtils eleutils = new ElementUtils(driver);

		eleutils.dosendKeys(firstName, "vivek");
		eleutils.dosendKeys(lastName, "singh");
		eleutils.dosendKeys(email, "viveksingh1478@gmail.com");
		eleutils.dosendKeys(confEmail, "viveksingh1478@gmail.com");
		eleutils.dosendKeys(username, "viveksingh1478");
		eleutils.dosendKeys(password, "redhat@143");
		eleutils.dosendKeys(confPwd, "redhat@143");
		eleutils.doClick(tearmCond);
		eleutils.doClick(sumbit);
		br.quiteBrowser();

	}

}
