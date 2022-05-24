package session1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class _1_InvokeChrome {
		

	
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ANIKET RAUNDALE\\eclipse-workspace\\Batch17SeleniumWebDriver\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
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
