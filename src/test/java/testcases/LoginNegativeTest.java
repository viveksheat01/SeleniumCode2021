package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginNegativeTest extends BaseTest {

	@DataProvider
	public Object[][] getLoginData() {

		return new Object[][] { { "testDemo", "123" }, { "test@gmail.com", "2132432543" }, { " ", " " },
				{ " testDemo", " " },

		};

	}

	@Test(dataProvider = "getLoginData")
	public void loginTest(String username, String password) {
		Assert.assertTrue(dologin(username, password));

	}

	public boolean dologin(String username, String password) {
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).clear();

		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		String error = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
		System.out.println(error);
		if (error.contains("No match for E-Mail Address and/or Password")) {
			System.out.println("worong user name and pssword enter" + error);

			return true;

		}
		return false;
	}

}
