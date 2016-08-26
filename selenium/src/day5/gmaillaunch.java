package day5;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmaillaunch {

	public static void main(String[] args) throws IOException 
	{
		String expval="Google";
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("F:\\morning630AM\\selenium\\src\\screenshot\\google.png"));
		
		
		String actval=driver.getTitle();
		if (expval.equalsIgnoreCase(actval))
		{
			System.out.println("Pass");
		}
		else
		{
			
			System.out.println("Fail");
		}
	}

}
