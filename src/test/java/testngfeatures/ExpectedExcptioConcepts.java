package testngfeatures;

import org.testng.annotations.Test;

public class ExpectedExcptioConcepts {

	String name = "JAVA";

	@Test(expectedExceptions = { NullPointerException.class, ArithmeticException.class })
	public void createUserTest() {
		System.out.println("create user test");

		int i = 9 / 3;
		ExpectedExcptioConcepts obj = new ExpectedExcptioConcepts();
		obj = null;
		System.out.println(obj.name);
	}

	@Test(expectedExceptions = Exception.class)
	public void userTest() {
		System.out.println(" user test");

		int i = 9 / 3;
		ExpectedExcptioConcepts obj = new ExpectedExcptioConcepts();
		obj = null;
		System.out.println(obj.name);
	}

}
