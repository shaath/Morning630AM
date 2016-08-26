package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkstest {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/intl/en/policies/terms/regional.html");
		driver.findElement(By.xpath(".//*[@id='maia-nav-x']/div/ul/li[3]/a")).click();
		
		

	}

}
