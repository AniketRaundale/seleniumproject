package session1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _2_FirefoxInvocation {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ANIKET RAUNDALE\\eclipse-workspace\\Batch17SeleniumWebDriver\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		String titleExpected="Facebook – log in or sign up";
		System.out.print("web page title is ->"+title);
		if(title.equals(titleExpected))
		{
			System.out.println("Title matched");
		}
		else
		{
			System.out.println("Title does not matched");
			
			
		}
	}
	}
