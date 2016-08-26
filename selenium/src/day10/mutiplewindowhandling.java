package day10;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class mutiplewindowhandling 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Help")).click();
		
		Set<String> s=driver.getWindowHandles();
		Iterator<String> it=s.iterator();
		
		while (it.hasNext())
		{
			String windowid=it.next();
			System.out.println(windowid);
			driver.switchTo().window(windowid);
			System.out.println(driver.getTitle());
			
			
			try 
			{
				driver.findElement(By.linkText("Terms of Service")).click();
				Sleeper.sleepTightInSeconds(5);
				System.out.println(driver.getTitle());
				break;
			}
			catch (Exception e)
			{
				System.out.println("Terms of service link not available in "+driver.getTitle()+" Page");
			}
		}
		

		
		
	}

}
