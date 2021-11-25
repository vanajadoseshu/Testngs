package simpleannotations;

import org.testng.annotations.Test;

public class dependsOnMethods {
  @Test(dependsOnMethods = "flipkart")
  private void amazon() {
	  System.out.println("Amazon login");
  }
  
  
  @Test
  private void flipkart() {
	  System.out.println("flipkart login");
  }
}
