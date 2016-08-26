package day5;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;


public class linkstest1 {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://bing.com");
		driver.manage().window().maximize();
		
		List<WebElement> tLinks=driver.findElements(By.tagName("a"));
		System.out.println(tLinks.size());
		
		WebElement block=driver.findElement(By.xpath("//ul[@id='sc_hdu']"));
		
		List<WebElement> links=block.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++)
		{
			String lName=links.get(i).getText();
			System.out.println(lName);
			if (lName.equalsIgnoreCase("msn"))
			{
				break;
			}
			links.get(i).click();
			Sleeper.sleepTightInSeconds(5);
			
			System.out.println(driver.getTitle()+"------"+driver.getCurrentUrl());
			File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("F:\\morning630AM\\selenium\\src\\screenshot\\"+lName+".png"));
			
			driver.navigate().back();
			Sleeper.sleepTightInSeconds(5);
			block=driver.findElement(By.xpath("//ul[@id='sc_hdu']"));
			links=block.findElements(By.tagName("a"));
		}
		
		

	}

}
