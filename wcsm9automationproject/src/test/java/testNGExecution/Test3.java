package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
  @Test
  public void method1() {
	  Reporter.log("method1 from test3", true);
  }
  @Test
  public void method2() {
	  Reporter.log("method2 from test3", true);
  }
}
