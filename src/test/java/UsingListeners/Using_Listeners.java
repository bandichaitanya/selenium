  package UsingListeners;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseclassUtility.BaseClass;

import org.testng.annotations.Listeners;

@Listeners(ListenersUtility.Listeners.class)
public class Using_Listeners extends BaseClass{
	@Test
	public void demo()
	{
	System.out.println("Test Script");
	Assert.fail();
	}
	
	@Test
	public void demo2()
	{
		System.out.println("Test Script");
	}
}
