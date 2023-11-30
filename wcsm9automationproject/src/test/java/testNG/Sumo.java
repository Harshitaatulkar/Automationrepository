package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sumo {
  @Test
  public void method1() {
	  Reporter.log("method1 from sumo class!", true);
	  
  }
  @Test
  public void method2() {
	  Reporter.log("method2 from sumo class!", true);
	  
  }
}
