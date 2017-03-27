package testSuit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class suitClass2 {

	//---------------------------------------- Before and After Testing ---------------------------------------------
		@BeforeTest
		public void beforeTest(){
			System.out.println("I am before the Testing");
		}
		@AfterTest
		public void afterTest(){
			System.out.println("I am after the Testing");
		}
	//---------------------------------------- Before and After each Test ---------------------------------------------
		@BeforeMethod
		public  void beforeMethod() {
			System.out.println("\tI am before each test method");
		}

		@AfterMethod
		public  void afterMethod() {
			System.out.println("\tI am after each test method");
		}

	//----------------------------------------- Actual Test Cases --------------------------------------------
	//test1 is a regular test case
		@Test 
		public void test1(){
			System.out.println("\tsuitClass2 --->Test 1");
		}
	//test2 is a executes only after test1 only if it is passed
		@Test (groups={"p1"})
		public void test2(){
			System.out.println("\tsuitClass2 --->Test 2");
		}
	//test3 is a executes only after test1 even though  it is failed
		@Test
		public void test3(){
			System.out.println("\tsuitClass2 --->Test 3");
		}
}
