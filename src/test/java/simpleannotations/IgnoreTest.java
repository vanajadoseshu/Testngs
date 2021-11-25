package simpleannotations;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {
	@Ignore
  @Test
  private void searchLaptop() {
		System.out.println("searchlaptop");
  }
	
	@Test(enabled=false)
	
	private void searchMobile() {
		System.out.println("searchmobile");
		
	}
	
	@Test
	private void searchTv() {
		System.out.println("searchtv");
		
	}
	@Test
	private void searchFruit() {
		System.out.println("searchfruit");
	}
}
