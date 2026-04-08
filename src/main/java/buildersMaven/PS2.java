package buildersMaven;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PS2 extends PS1 {

	@Test
	public static void m3() {

		System.out.println("m3 Test method in PS2");

	}
	
	@BeforeTest
	public void beforeTes() {
		System.out.println("Before test method in PS2");
	}

}
