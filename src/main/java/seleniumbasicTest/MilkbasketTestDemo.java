package seleniumbasicTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MilkbasketTestDemo {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://admin-qa.milkbasket.com.s3-website.ap-south-1.amazonaws.com/index.html#/login");

		driver.findElement(By.name("email")).sendKeys("demotest@gmail.com");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//input[contains(@id,'mat-input-2')]")).click();
		driver.findElement(By.xpath("(//input[@ type ='text']/../..)[1]")).click();

		Thread.sleep(3000);
		// driver.findElement(By.xpath("//div[@id='cdk-overlay-4']/div")).click();
		// WebElement el =
		// driver.findElement(By.xpath("//span[contains(text(),'Gurgaon')]"));

		String xpath = "//span[contains(text(),'Gurgaon')]/..";
		WebElement el = driver.findElement(By.xpath(xpath));
		el.sendKeys("Gurgaon");
		el.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@ type ='text']/../..)[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),' GGN01 ')]/..")).click();

		driver.findElement(By.xpath("//span[contains(text(),' Continue ')]/..")).click();

	}

}
