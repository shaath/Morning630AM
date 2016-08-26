package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radioeg3 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> group1=block.findElements(By.name("group1"));
		System.out.println(group1.size());
		for (int i = 0; i < group1.size(); i++)
		{
			String gText=group1.get(i).getAttribute("value");
			System.out.println(gText);
			if (gText.equalsIgnoreCase("cheese"))
			{
				group1.get(i).click();
				break;
			}
		}
		
		
		List<WebElement> group2=block.findElements(By.name("group2"));
		System.out.println(group2.size());
		for (int i = 0; i < group2.size(); i++)
		{
			String gText=group2.get(i).getAttribute("value");
			System.out.println(gText);
			if (gText.equalsIgnoreCase("water"))
			{
				group2.get(i).click();
				break;
			}
		}
		
		
	}

}
