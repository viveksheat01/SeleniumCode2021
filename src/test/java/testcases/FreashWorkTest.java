package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FreashWorkTest extends BaseTest {

	@Test(priority = 2)
	public void titleTest() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Freshworks | Modern and Easy Customer and Employee Experience Software");
	}

	@Test(priority = 1)
	public void Logotest() {

		Assert.assertTrue(driver.findElement(By.cssSelector("img.logo")).isDisplayed());
	}
}
