package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class loginTc 
{
	@Test
	public void login()
	{
		WebDriver driver=new FirefoxDriver();
		loginPage lp=PageFactory.initElements(driver, loginPage.class);
		driver.get(lp.url);
		driver.manage().window().maximize();
		lp.org_Login(lp.u, lp.p);
		Sleeper.sleepTightInSeconds(5);
		adminPage ap=PageFactory.initElements(driver, adminPage.class);
		
		ap.welcomeclick();
		Sleeper.sleepTightInSeconds(5);
		ap.logoutclick();
		
		driver.close();
		
	}

}
