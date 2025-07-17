package DataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UsingDataProviders {
	@DataProvider
	public Object[][]data()
	{
		Object[][] obj=new Object[2][2];
		
		obj[0][0]="d1";
		obj[0][1]="d2";
		obj[1][0]="d3";
		obj[1][1]="d4";
		
		return obj;
	}
	@Test(dataProvider="data")
	public void Test(String un,String pswd)
	{
		System.out.println(un+pswd);
	
	}
}
		
