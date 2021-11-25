package simpleannotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTest {
  @Test
  private void amazonTest () {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinot\\eclipse-workspace\\Selenium_Test\\Driver\\chromedriver.exe");
	 WebDriver driver =new ChromeDriver();
	 driver.get("");
	  
	  
  }
  
}
