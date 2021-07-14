package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest
{
	@Test
	public void test()
	{
		System.out.println("hello World");
	}

	@Test
	public void test1()
	{
		System.out.println("added test1 dated 14-07-2021");
		Assert.assertEquals(true,true);
	}
	
} // class DemoTest ends
 