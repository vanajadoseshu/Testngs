package simpleannotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sample1 {
  @Test(retryAnalyzer = MyRetry.class)
  private void userNameValidation() {
	  Assert.assertEquals('a', 'A');
  }
}
