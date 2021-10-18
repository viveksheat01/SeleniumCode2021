package seleniumbasicTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaSriptAlertPOpHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		// Java Script pop-up

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();

		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(2000);
		// alert.accept(); // click on ok
		alert.dismiss(); // cencal alert

		driver.switchTo().defaultContent();

	}

}
