package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radioeg2 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> rText=block.findElements(By.tagName("input"));
		System.out.println(rText.size());

		for (int i = 0; i < rText.size(); i++)
		{
			String radio=rText.get(i).getAttribute("value");
			System.out.println(radio);
			if (radio.equalsIgnoreCase("milk"))
			{
				rText.get(i).click();
				
			}
			else if (radio.equalsIgnoreCase("beer"))
			{
				rText.get(i).click();
			}
		}
	}

}
