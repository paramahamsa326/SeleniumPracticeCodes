package firstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {

	public static void main(String[] args) {
		FirefoxDriver myDriver=new FirefoxDriver();
		myDriver.get("http://google.com");
		myDriver.findElement(By.id("lst-ib")).sendKeys("Hello World from Selenium ...");
		myDriver.findElement(By.name("btnG")).click();
		
		myDriver.close();
	}

}
