package simpleannotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void setUp() {
	  System.out.println("SetUp");
  }
  
  @BeforeMethod
  public void browserLaunch() {
	  System.out.println("BrowserLaunch");
  }

  @AfterMethod
  public void enterUrl() {
	  System.out.println("EnterUrl");
  }

  @BeforeClass
  public void logIn() {
	  System.out.println("LogIn");
  }

  @AfterClass
  public void searchMobile() {
	  System.out.println("SearchMobile");
  }

  @BeforeTest
  public void searchLaptop() {
	  System.out.println("SearchLaptop");
  }

  @AfterTest
  public void searchTv() {
	  System.out.println("SearchTv");
  }

  @BeforeSuite
  public void verifyLogIn() {
	  System.out.println("VerifyLogin");
  }

  @AfterSuite
  public void logOut() {
	  System.out.println("LogOut");
  }

}
