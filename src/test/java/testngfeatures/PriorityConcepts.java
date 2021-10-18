package testngfeatures;

import org.testng.annotations.Test;

public class PriorityConcepts {
	@Test()
	public void a_test() {
		System.out.println(" a_test");
	}

	@Test()
	public void b_test() {
		System.out.println(" b_test");
	}

	@Test(priority = 3)
	public void c_test() {
		System.out.println(" c_test");
	}

	@Test(priority = 1)
	public void d_test() {
		System.out.println(" d_test");
	}

	@Test(priority = 2)
	public void e_test() {
		System.out.println(" e_test");
	}
}
