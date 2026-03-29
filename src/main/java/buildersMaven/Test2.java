package buildersMaven;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Hello before method Test");
		
	}
	
	@Test(groups= {"smoke"})
	public void m1() {
		System.out.println("Hello m1 Test");
		
	}
	
	@Test(groups= {"smoke"})
	public void m2() {
		System.out.println("Hello m2 Test");
		
	}
	
	@Test
	public void m3() {
		System.out.println("Hello m3 Test");
		
	}
	
	@Test(priority=1)
	public void m4() {
		System.out.println("Hello m4 Test");
		
	}


}
