package seleniumbasicTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementDisplayed {

	public static void main(String[] args) {

		browserUtils br = new browserUtils();
		WebDriver driver = br.initDriver("chrome");
		// br.launchUrl("https://classic.crmpro.com/index.html");
		br.launchUrl("https://classic.freecrm.com/register/");

		System.out.println(br.getPagetitle());

		// By serchName=By.name("sewarch");

		By sumbit = By.id("submitButton");
		By tearm = By.name("agreeTerms");
		ElementUtils util = new ElementUtils(driver);
		System.out.println(util.doIsDisplayed(sumbit));
		boolean bl = util.doEnabled(sumbit);
		System.out.println(bl);

		System.out.println(util.doSelected(tearm));
		util.doClick(tearm);
		boolean bl1 = util.doEnabled(sumbit);
		System.out.println(bl1);
		br.quiteBrowser();

	}

}
