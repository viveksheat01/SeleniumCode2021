package testngfeatures;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestEnableDisble {
	@Test
	public void createUser() {
		System.out.println("create user");
	}

	@Test()
	public void UpdateUser() {
		System.out.println("UpdateUser");

	}

	@Test(enabled = true)
	public void deleteUser() {
		System.out.println("UpdateUser");

	}

	@Ignore
	@Test(enabled = true, description = "this for get user amazon app.......")
	public void getusertest() {
		System.out.println("getusertest");

	}
}
