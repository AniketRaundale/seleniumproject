package session1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class _4_EdgeInvocation {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"/msedgedriver.exe");
	
	EdgeDriver driver = new EdgeDriver();
		
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
	driver.navigate().to("https://www.amazon.in/");
	if(driver.getTitle().equals("Amazon.in: Online Shopping India - Buy mobiles, laptops, cameras, books, watches, apparel, shoes and e-Gift Cards. Free Shipping & Cash on Delivery Available."))
		
	{
		System.out.println("Amazon title is correct");
	}
		else
		{
			System.out.println("Amazon title is incorrect");
			
	}
	
	driver.navigate().back();
	System.out.println("title after navigating back is ->"+ driver.getTitle());
	
	
	driver.navigate().forward();
	System.out.println("title after navigating forward is ->"+ driver.getTitle());
	
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	driver.quit();
}

}
