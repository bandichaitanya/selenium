package UsingListeners;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseclassUtility.BaseClass;

public class Using_Listerners2 extends BaseClass{
	
	@Test
	public void demo3()
	{
	System.out.println("Test Script -3");
	Assert.fail();
	}
	
	@Test
	public void demo4()
	{
		System.out.println("Test Script-4");
	}
}
