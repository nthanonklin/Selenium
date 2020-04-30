

import org.testng.annotations.Test;

public class priority_testCase {
  
  @Test(priority = 2)
  public void testcse1() {
	  System.out.println("testcase1");
  }
  
  @Test(priority = 3, invocationCount=3, invocationTimeOut=5)
  public void testcse2() {
	  System.out.println("testcase2");
  }
  
  @Test(priority = 1)
  public void testcse3() {
	  System.out.println("testcase3");
  }
}
