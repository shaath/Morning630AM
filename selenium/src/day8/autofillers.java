package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class autofillers 
{
	public static void main(String[] args) 
	{
//		System.setProperty("webdriver.chrome.driver","F:\\Cdownloads\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://redbus.in");
		driver.manage().window().maximize();
//		Sleeper.sleepTightInSeconds(5);
		
		driver.findElement(By.id("txtSource")).sendKeys("H");
		
		List<WebElement> auto=driver.findElements(By.xpath(".//*[@id='Search']/div[1]/div[1]/ul/li"));
		System.out.println(auto.size());
		for (int i = 0; i < auto.size(); i++)
		{
			String cText=auto.get(i).getText();
			System.out.println(cText);
			if (cText.equalsIgnoreCase("hyderabad")) 
			{
				auto.get(i).click();
				break;
			}
			
		}
	}

}
