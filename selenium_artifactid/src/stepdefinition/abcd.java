package stepdefinition;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class abcd {

	
	@BeforeTest
	public void method1() {
		System.out.println("Method1");
	}
	
	@Test(priority=1)
	void method2() {
		System.out.println("Method2"+this);
	}
	  
	@Test(priority=2)
	void method3() {
		System.out.println("Method3");
	}
	
	public static void main(String args[]) {
	}
	
	void inc() {
	}
	
}
