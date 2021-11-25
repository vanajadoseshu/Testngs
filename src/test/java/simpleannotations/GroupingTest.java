package simpleannotations;

import org.testng.annotations.Test;

public class GroupingTest {
  @Test(groups = "school details")
  private void std_Name() {
	  System.out.println("student name is sharu");
  }
  
  
  @Test(groups = "school details")
  
  private void std_Id() {
	  System.out.println("student id is 30");
  }
  
  
  @Test(groups = "college details")
  private void clg_Name() {
	  System.out.println("college name is MIT");
  }
  @Test(groups = "college details")
  private void clg_Loacation() {
	  System.out.println("college location is chennai");
  
  }
  
  
}
