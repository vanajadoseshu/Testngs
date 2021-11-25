package simpleannotations;

import org.testng.annotations.Test;

public class DependencyTest {
  @Test(dependsOnMethods = "searchTv" )
  private void searchLaptop() {
	  System.out.println("searchLaptop");
  }
  @Test(dependsOnMethods = "searchLaptop")
  private void searchMobile() {
	  System.out.println("searchmobile");
  }
  @Test
  private void searchTv() {
	  System.out.println("searchtv");
  }
}
