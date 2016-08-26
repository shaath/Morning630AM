package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class testngMaster 
{
	public static String expval,actval;
	public static WebDriver driver;
	public static String url="http://orangehrm.qedgetech.com";
	public static String u="Admin",p="admin";
	public static String f="QEdge",l="Tech";
	
	public static String ename=f+" "+l,uname="QEdge8912389",pswd="QEdge8912345",cpswd="QEdge8912345";
	
	
	@BeforeSuite
	public void org_Launch()
	{
		expval="LOGIN";
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();
		actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
		Assert.assertEquals(actval, expval,"Launch Failed");
		
	}
	
	@AfterSuite
	public void close_App()
	{
		driver.close();
	}
	
	@BeforeTest
	public void Org_Login()
	{
		expval="Welcome Admin";
		driver.findElement(By.id("txtUsername")).sendKeys(u);
		driver.findElement(By.id("txtPassword")).sendKeys(p);
		driver.findElement(By.id("btnLogin")).click();
		actval=driver.findElement(By.id("welcome")).getText();
		Assert.assertEquals(actval, expval,"Login Failed");
	}
	
	@AfterTest
	public void org_Logout()
	{
		expval="LOGIN";
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath(".//*[@id='welcome-menu']/ul/li[3]/a")).click();
		actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
		Assert.assertEquals(actval, expval,"Logout Failed");
	}

}
