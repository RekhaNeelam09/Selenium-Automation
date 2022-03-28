package com.project;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestDependency
{
  @Test(priority = 1)
  public void orange()
  {
	  System.out.println("orange");
  }
  
  @Test(priority = 3,dependsOnMethods = {"orange"})
  public void green()
  {
	  System.out.println("green");
  }
  
  @Test(priority = 4,dependsOnMethods = {"green"})
  public void blue()
  {
	  System.out.println("blue");
	  //Assert.fail("Blue test is failed");
	  throw new SkipException("Blue test is skipped");
  }
  
  @Test(priority = 2,dependsOnMethods = {"blue"})
  public void white()
  {
	  System.out.println("white");
  }
  
}
