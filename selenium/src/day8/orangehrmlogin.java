package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrmlogin {

	public static void main(String[] args)
	{
		String actval;
		String expval="welcome";
		System.setProperty("webdriver.chrome.driver","F:\\Cdownloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		try 
		{
			actval=driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
			
			
		}
		catch (Exception e)
		{
			actval=driver.findElement(By.id("spanMessage")).getText();
//			System.out.println("expected element not available");
		}
		
		if (expval.equalsIgnoreCase(actval))
		{
			System.out.println("Pass");
			
		}
		else if (actval.equalsIgnoreCase("Invalid credentials"))
		{
			System.out.println("Enter valid credentials");
			
		}
		else if (actval.equalsIgnoreCase("Username cannot be empty"))
		{
			System.out.println("Fileds can not be empty");
		}
		else
		{
			System.out.println("Fail");
		}
			
		
		
		
	}

}
