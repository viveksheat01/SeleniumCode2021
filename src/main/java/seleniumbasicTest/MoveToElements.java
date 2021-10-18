package seleniumbasicTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElements {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");

		// WebElement content = driver.findElement(By.className("menulink"));
		// Actions act = new Actions(driver);
		// act.moveToElement(content).build().perform();
		// Thread.sleep(2000);
		// driver.findElement(By.linkText("COURSES")).click();
		By conten = By.className("menulink");
		By courses = By.linkText("COURSES");
		parentChildHandle(conten, courses);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void parentChildHandle(By parent, By child) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parent)).build().perform();
		Thread.sleep(2000);
		getElement(child).click();
	}

}