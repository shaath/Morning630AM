package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class facebookLogin 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.id("email")).sendKeys("gande3@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("12345679");
		driver.findElement(By.id("u_0_m")).click();

	}

}
