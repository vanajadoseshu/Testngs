package simpleannotations;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
	String actual = "Sharvesh";
	String expected= "sharvesh";
	
	@Test
	
       private void test1() {
		System.out.println("test1 started");
		Assert.assertEquals(actual, expected);//hard assert
		System.out.println("Test1 completed");
		
		
	}

	
	@Test
	private void test2() {
		 SoftAssert sa=new SoftAssert();
		 System.out.println("test2 started");
		 sa.assertEquals(actual, expected);
		 System.out.println("test2 completed");
		 sa.assertAll();
	}
	
	
}
