package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class checkbox 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("Email")).sendKeys("gandesharath");
		driver.findElement(By.id("next")).click();
		
		Sleeper.sleepTightInSeconds(5);
		
		if (driver.findElement(By.id("PersistentCookie")).isSelected()) 
		{
			driver.findElement(By.id("PersistentCookie")).click();
		}
		else
		{
			System.out.println("Check Box is in unselected position");
		}

	}

}
