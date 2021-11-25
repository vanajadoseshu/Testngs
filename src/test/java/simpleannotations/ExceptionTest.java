package simpleannotations;

import org.testng.annotations.Test;

public class ExceptionTest {
  @Test
  private void test() {
	  int i= 10;
	  int j= 15;
	  
	  System.out.println("add"+(i+j));
  }
  
  
  
  @Test(expectedExceptions =ArithmeticException.class)
  private void divide() {
	  int i=10;
	  int j=0;
	  System.out.println("divide"+(i/j));
  }
}

