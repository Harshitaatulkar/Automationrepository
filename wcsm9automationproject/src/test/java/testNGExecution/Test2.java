package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
  @Test
  public void method1() {
	  Reporter.log("method1 from Test2 class", true);
  }
  
  @Test
  public void method2() {
	  int i = 10;
	  int j = 2;
	  int k = i/j ;
	  Reporter.log("method2 from Test2 class"+k, true);
  }
}
