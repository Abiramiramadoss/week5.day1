package testcase;

import org.testng.annotations.Test;

public class TestCase {
  @Test(priority=-3)
  public void createlead() {
	  System.out.println("Create lead");
  }
  @Test(invocationCount=4,priority=1)
  public void editlead() {
	  System.out.println("Edit lead");
  }
  @Test
  public void duplicatelead() {
	  System.out.println("Duplicate lead");
  } @Test(priority=2)
  public void deletelead() {
	  System.out.println("Delete lead");
  }
}
