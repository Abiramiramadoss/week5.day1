package week5.day1;

import java.io.IOException;

import org.testng.annotations.Test;

public class Attributes {
	@Test(priority=0,dependsOnMethods="m4",enabled=false)
	public void m1() {
	System.out.println("This is 1st method");	
	}
	@Test(groups="smoke")
	public void m2() {
		System.out.println("This is 2nd method");	
	}
	@Test(expectedExceptions = IOException.class)
	public void m3() {
		System.out.println("This is 3rd method");
	}
	@Test(priority=-1,groups="smoke")
	public void m4() {
		System.out.println("This is 4th method");
	}
	@Test(dependsOnGroups="smoke",invocationCount = 5)
	public void m5() {
		System.out.println("This is 5th method");
		
	}
	
	/*@Test(invocationCount=3,groups="Regression")
	public void method1() {
		System.out.println("I am method1");
	}
	
	@Test(priority=-2,groups="Regression")
	public void method2() {
		System.out.println("I am method2");
	}
	
	@Test(groups="Smoke",dependsOnGroups="Regression")
	public void method3() {
		System.out.println("I am method3");
	}
	
	@Test(groups="smoke")
	public void method4() {
		System.out.println("I am method4");
	}
	
	@Test(enabled=false)
	public void method5() {
		System.out.println("I am method5");
	}*/
	

}
