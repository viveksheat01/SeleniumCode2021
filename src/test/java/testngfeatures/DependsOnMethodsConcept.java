package testngfeatures;

import org.testng.annotations.Test;

public class DependsOnMethodsConcept {

	// test cases always be independence with each other, do not not create the
	// depencey b/w two test case

	@Test
	public void loginTest() {
		System.out.println("loginTest");
	}

	@Test(dependsOnMethods = "loginTest")
	public void homeTest() {
		System.out.println("homeTest");
	}

	@Test(dependsOnMethods = "loginTest")
	public void searchTest() {
		System.out.println("searchTest");
	}

	// CRUD

	public void usercreate(String name, int age) {
		System.out.println(name + " " + age);
	}

	public void updateUser(String name, int age) {
		System.out.println(name + " " + age);
	}

	public void deletUser(String name, int age) {
		System.out.println(name + " " + age);
	}

	/*
	 * @Test public void createUser() { System.out.println("create user");
	 * usercreate("tom", 25); }
	 * 
	 * @Test(dependsOnMethods = "createUser") public void UpdateUser() {
	 * System.out.println("UpdateUser"); updateUser("peter", 35); }
	 */
	@Test
	public void createUser() {
		System.out.println("create user");
		usercreate("tom", 25);
	}

	@Test()
	public void UpdateUser() {
		System.out.println("UpdateUser");
		usercreate("tom", 25);
		updateUser("tom", 35);
	}

	@Test()
	public void deleteUser() {
		System.out.println("UpdateUser");
		updateUser("tom", 35);
		deletUser("tom", 35);
	}

	@Test()
	public void getusertest() {
		System.out.println("getusertest");
		updateUser("tom", 35);
		deletUser("tom", 35);
	}
}
