package seleniumbasicTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TotalNumberImages {

	static WebDriver driver;

	public static void main(String[] args) {
		// total images on the page
		// for each images print src and alt values

		browserUtils brws = new browserUtils();
		WebDriver driver = brws.initDriver("chrome");
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);

		brws.launchUrl("https://www.amazon.in/");
		// findElemnets used for multiple element

		/*
		 * List<WebElement> imagesList = driver.findElements(By.tagName("img"));
		 * System.out.println("total iamges" + imagesList.size()); for (int i = 0; i <
		 * imagesList.size(); i++) { String atlValues =
		 * imagesList.get(i).getAttribute("alt"); String srcValues =
		 * imagesList.get(i).getAttribute("src");
		 * 
		 * System.out.println(atlValues + "  : " + srcValues);
		 * 
		 * }
		 */

		List<WebElement> Linktext = driver.findElements(By.tagName("a"));
		System.out.println("total link :" + Linktext.size());
		for (WebElement e : Linktext) {
			String herfVal = e.getAttribute("href");
			String text = e.getText();
			System.out.println(herfVal + " : " + text);
		}

		brws.quiteBrowser();

	}

}
