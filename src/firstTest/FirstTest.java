package firstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * Elements used <code>WebDriver, FirefoxDriver, get(), findElement, sendKeys, click, Close
 * 
 * This Program opens a browser.
 * Gets http://google.com Website
 * Searches for "Hello World from Selenium ..."
 * Closes the browser.
*/
public class FirstTest {

	public static void main(String[] args) {
		WebDriver myDriver=new FirefoxDriver();
		myDriver.get("http://google.com");
		myDriver.findElement(By.id("lst-ib")).sendKeys("Hello World from Selenium ...");
		myDriver.findElement(By.name("btnG")).click();
		myDriver.close();
	}

}
