package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmailLogin 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		//findElement()
		
		WebElement email=driver.findElement(By.id("Email"));
		email.sendKeys("gandesharath");
//		Thread.sleep(5000);
//		email.clear();
		
		driver.findElement(By.name("signIn")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("123456789");
		driver.findElement(By.cssSelector("#signIn")).click();

	}

}
