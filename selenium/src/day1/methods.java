package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class methods 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		Sleeper.sleepTightInSeconds(5);
		//manage()
		driver.manage().window().maximize();
		
//		WebDriver d=new FirefoxDriver();
//		
//		//
//		d.get("http://gmail.com");
		
		//navigate()
		
		driver.navigate().to("http://twitter.com");
		Sleeper.sleepTightInSeconds(5);
		driver.navigate().back();
		Sleeper.sleepTightInSeconds(5);
		driver.navigate().forward();
		Sleeper.sleepTightInSeconds(5);
		driver.navigate().refresh();
	}

}
