package SuiteB;

import org.testng.annotations.Test;

public class TestB1 {
  @Test
  public void testB1() throws InterruptedException
  {
	  System.out.println("Starting Test B1");
	  
	  Thread.sleep(5000);
	  
	  System.out.println("Ending Test B1");
  }
}
