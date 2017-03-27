package testNGDemonstration;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BeforeAndAfterSuit {
	
//---------------------------------------- Before and After each Suit ---------------------------------------------

	@BeforeSuite
	public void beforeSuit(){
		System.out.println("Before each suit");
	}
	@AfterSuite
	public void afterSuit(){
		System.out.println("After each Suit");
	}
}
