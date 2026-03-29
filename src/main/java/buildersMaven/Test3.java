package buildersMaven;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Test3 {

	
	@BeforeTest
	public void BeforTest() {
		System.out.println("I will execute before every test.");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("I will execute After every test.");
	}
	
	@BeforeSuite
	public void BeforSuite() {
		System.out.println("I will execute before suite.");
	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("I will execute After every suite.");
	}
	
	@BeforeMethod
	public void BeforMethod() {
		System.out.println("I will execute before every method.");
	}
	
	
	@Test(groups= {"smoke","login"})
	public void MobileLogin() {
		System.out.println("Mobile login");
	}
	
	@Test(groups= {"smoke","logout"})
	public void MobileLogout() {
		System.out.println("Mobile logout");
	}
	
	@Test(alwaysRun=true)
	public void MobileOrder() {
		System.out.println("Mobile Order");
	}
	
	@Test(groups= {"smoke","login"})
	public void webLogin() {
		System.out.println("Web login");
	}
	
	@Test(groups= {"smoke","logout"})
	public void WebLogout() {
		System.out.println("Web logout");
	}
	
	@Parameters({"URLtrends","APIkey"})
	@Test
	public void WebOrder(String URLtrends, String key) {
		
		System.out.println("Web Order");
		System.out.println(URLtrends+" "+ key);
	}
	
}
