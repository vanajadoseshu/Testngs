package simpleannotations;

import org.testng.annotations.Test;

public class PriorityTest {
  @Test(priority=4)
  private void searchMobile() {
	  System.out.println("searchmobile");
  }
  
  @Test(priority=-2)
  
  private void searchLaptop() {
	  System.out.println("searchlaptop");
  }
  
  @Test
  private void searchTv() {
	  System.out.println("searchtv");
  }
  @Test(priority=4)
  private void searchFruits() {
	  System.out.println("searchfruits");
  }
  
  @Test(priority=-1)
  private void searchWatch() {
	  System.out.println("searchwatch");
  }
}

