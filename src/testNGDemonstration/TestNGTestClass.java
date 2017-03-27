package testNGDemonstration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGTestClass {


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
	@Test (description="This is a very plain TestNG test case")
	public void test1(){
		System.out.println("\t\tTestNGTestClass ---> Test 1");
	}
//test2 is a executes only after test1 only if it is passed
	@Test(dependsOnMethods={"test1"}, dataProvider="testDataProvider") 
	public void test2(int a){
		System.out.println("\t\tTestNGTestClass ---> Test 2 --->"+a);
	}
//test3 is a executes only after test1 even though  it is failed
	@Test(dependsOnMethods={"test2"}, alwaysRun=true)
	@Parameters({"param"})
	public void test3(String param){
		System.out.println("\t\tTestNGTestClass ---> Test 3 ---> " + param);
	}
//test4 fails if it exceeds 1ms
	@Test(timeOut=1)
	public void test4() throws InterruptedException{
		System.out.println("\t\tTest 4 started");
		Thread.sleep(10);
		System.out.println("\t\tTestNGTestClass ---> Test 4");
	}
//test5 is disabled to execute
	@Test(enabled=false, groups={"p1"})
	public void test5(){
		System.out.println("\t\tTestNGTestClass ---> Test 5");
	}
	@DataProvider
	public Object[][] testDataProvider(){
		return new Object[][]{
			new Object[]{1},
			new Object[]{2},
			new Object[]{3},
			new Object[]{4}
		};
		
	}
}
