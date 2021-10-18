package testNGsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotation {
	// design tc
	// pre conditions
	// test steps
	// expected result vs actual result
	// status -- pass / fails

	@BeforeSuite
	public void connectWithDB() {

		System.out.println("BS ---- connectwithDB");

	}

	@BeforeTest
	public void createUser() {
		System.out.println("BT ---- connectWith User");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println(" BC -----launchBrowser");
	}

	@BeforeMethod
	public void loginPage() {
		System.out.println(" BM -----loginPage");
	}

	@Test
	public void homePageheaderTest() {
		System.out.println(" homePageheaderTest ");
	}

	@Test
	public void homePageTitleTest() {
		System.out.println(" homePageTitleTest ");
	}

	@Test
	public void SerachTest() {
		System.out.println(" SerachTest ");
	}

	@AfterMethod
	public void logout() {
		System.out.println(" AM _+__+  logout");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("AC ____---closeBrowser");
	}

	@AfterTest
	public void deleteUser() {
		System.out.println("AT-----deleteUser");
	}

	@AfterSuite
	public void deleteWithDB() {
		System.out.println("AS------deleteWithDB");
	}

}
