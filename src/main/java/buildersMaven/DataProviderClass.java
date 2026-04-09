package buildersMaven;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	
	@Test(dataProvider="getData")
	public void printData(String user, String password) {
		
		System.out.println("User : "+user);
		System.out.println("Password : "+password);
		System.out.println("-----------------------");
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[4][2];
//		1st dataset
		data[0][0] = "Firstusername";
		data[0][1] = "Firstpassword";
		
//		2nd dataset
		data[1][0] = "Secondusername";
		data[1][1] = "Secondpassword";
		
//		3rd dataset
		data[2][0] = "Thirdusername";
		data[2][1] = "Thirdpassword";
		
//		3rd dataset
		data[3][0] = "Forthusername";
		data[3][1] = "Forthpassword";
		
		return data;

	}

}
