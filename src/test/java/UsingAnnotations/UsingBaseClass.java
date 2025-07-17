package UsingAnnotations;

import org.testng.annotations.Test;

import BaseclassUtility.BaseClass;

public class UsingBaseClass extends BaseClass {
	@Test
	public void demo()
	{
		System.out.println("Test Scenario");
	}
	
	@Test
	public void demo2()
	{
		System.out.println("Test Scenario 2");
	}

}
