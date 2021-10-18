package seleniumbasicTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Mb_AdminTest {

	public static void main(String[] args) {

		browserUtils brws = new browserUtils();
		WebDriver driver = brws.initDriver("chrome");
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);

		brws.launchUrl("https://admin-uat.milkbasket.com/index.html#/login");
		System.out.println(brws.getPagetitle());
		System.out.println(brws.getPageUrl());

		By emailId = By.name("email");
		By pwd = By.name("password");
		By sumbitButton = By.xpath("/html/body/app-root/app-side-nav/div/mat-sidenav-container/"
				+ "mat-sidenav-content/main/div/app-login/div/div/div[2]/form/div/div[4]/button");

		By selectCity = By.xpath("//div[@class='mat-form-field-suffix ng-tns-c93-2 ng-star-inserted']/mat-icon");
		By Hubs = By.xpath("//div[@class='mat-form-field-suffix ng-tns-c93-3 ng-star-inserted']/mat-icon");

		ElementUtils utilsMb = new ElementUtils(driver);
		utilsMb.dosendKeys(emailId, "testorder18@gmail.com");
		utilsMb.dosendKeys(pwd, "12345");
		utilsMb.doClick(sumbitButton);
		utilsMb.doClick(selectCity);
		utilsMb.doClick(Hubs);

	}

}
