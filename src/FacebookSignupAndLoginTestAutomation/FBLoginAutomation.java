package FacebookSignupAndLoginTestAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FBLoginAutomation {

	public static void main(String[] args) {
		WebDriver ffDriver=new FirefoxDriver();
		ffDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		ffDriver.get("https://facebook.com");
		ffDriver.findElement(By.xpath("//input[contains(@name,'rstname')]")).sendKeys("First Name");
		ffDriver.findElement(By.xpath("//input[contains(@name,'last')]")).sendKeys("Last Name");
		ffDriver.findElement(By.xpath("//input[contains(@name,'reg')]")).sendKeys("abcd@gmail.com");
		ffDriver.findElement(By.xpath("//input[contains(@name,'confirm')]")).sendKeys("abcd@gmail.com");
		ffDriver.findElement(By.xpath("//input[contains(@name,'passwd')]")).sendKeys("abcd1234");
		Select monthSelector=new Select(ffDriver.findElement(By.xpath("//select[contains(@id,'month')]")));
		monthSelector.selectByValue("6");
		monthSelector.selectByIndex(5);
		monthSelector.selectByVisibleText("Jun");
		Select dateSelector=new Select(ffDriver.findElement(By.xpath("//select[contains(@id,'day')]")));
		dateSelector.selectByValue("25");
		dateSelector.selectByIndex(26);
		dateSelector.selectByVisibleText("27");
		Select yearSelector=new Select(ffDriver.findElement(By.xpath("//select[contains(@id,'year')]")));
		yearSelector.selectByValue("1992");
		yearSelector.selectByIndex(25);
		yearSelector.selectByValue("1990");
		ffDriver.findElement(By.xpath("//input[@name='sex'and @value='2']")).click();

		ffDriver.findElement(By.xpath("//button[contains(@name,'websubmit')]")).click();
		
	}

}
