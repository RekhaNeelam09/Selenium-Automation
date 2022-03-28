package com.project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNG_004 extends BaseTest
{

  @Test
  public void test1() 
  {
	  System.out.println("test1 : "+Thread.currentThread().getId());
  }
  
  @Test
  public void test2() 
  {
	  System.out.println("test2 : "+Thread.currentThread().getId());
  }
  
  @Test
  public void test3() 
  {
	  System.out.println("test3 : "+Thread.currentThread().getId());
  }

}
