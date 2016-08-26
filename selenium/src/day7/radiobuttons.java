package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radiobuttons {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath(".//*[@id='SearchForm']/nav"));
		List<WebElement> radio=block.findElements(By.tagName("input"));
		System.out.println(radio.size());
		
		for (int i = 0; i < radio.size(); i++)
		{
			String rText=radio.get(i).getAttribute("value");
			System.out.println(rText);
			if (rText.equalsIgnoreCase("packages"))
			{
				radio.get(i).click();
				break;
			}
			
		}
		
		
		

	}

}
