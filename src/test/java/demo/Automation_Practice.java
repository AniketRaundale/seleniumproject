package demo;
import java.util.ArrayList;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import junit.framework.Assert;

public class Automation_Practice {
	
	WebDriver driver;
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	}
		@Test 
		public void radio2(){
		
		  WebElement radio2 = driver.findElement(By.xpath("//input[@value='radio2']"));
		  radio2.click();
	      Assert.assertEquals("radio2 button not selected", true, radio2.isSelected());
	      System.out.println("Radio2 button is selected");
	     
	}
	
	   @Test
		public void Drop_Down(){
		   
	    	WebElement Drop_DownBtn =driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
			Select optionSelect =new Select(Drop_DownBtn);
			
			optionSelect.selectByValue("option3");
			System.out.println(" Drop_Down \"Option3\" Is selected");
			
	    }
	    
		@Test
     	public void checkbox(){
			
         WebElement Option1 = driver.findElement(By.xpath("//input[@value='option1']"));
         Option1.click();
	       Assert.assertEquals("Option1 not selected", true, Option1.isSelected());
	       System.out.println("Option1 is selected");
	    
		}
	
	    @Test
	    public void openwindow() throws InterruptedException{
	    	
	    	WebElement OpenNewWindow=driver.findElement(By.xpath("//button[@id='openwindow']"));
			OpenNewWindow.click();
			
			ArrayList<String> windowHandle=new ArrayList<String>(driver.getWindowHandles());
			
			String ParentID=windowHandle.get(0);
			String ChildID=windowHandle.get(1);
			
			driver.switchTo().window(ChildID);
			Assert.assertEquals("New Window URL not Match","http://www.qaclickacademy.com/", driver.getCurrentUrl());
			System.out.println("URL on new window is: "+ driver.getCurrentUrl());
			System.out.println("New Window URL  Match");
			Thread.sleep(2000);
			
		}
	    @Test
	    public void Alert() throws InterruptedException {
		
         	WebElement AlertBox=driver.findElement(By.xpath("//input[@id='name']"));
	    	AlertBox.sendKeys("HII ANIKET");
	     	Thread.sleep(4000);
		
	    	WebElement GenerateAlert=driver.findElement(By.xpath("//input[@id='alertbtn']"));
	    	GenerateAlert.click();
	    	Thread.sleep(5000);
		
	    	Alert alert=driver.switchTo().alert();		
	    	String AlertMsg=alert.getText();
	     	Thread.sleep(3000);
				
	    	Assert.assertTrue("Alert massage not Match", AlertMsg.contains("HII ANIKET"));
	    	alert.accept();
	    	System.out.println("alert message get match");
	    	Thread.sleep(2000);
	        }
		
	    	
	  @After
		public void teardown() throws InterruptedException
		{
	
			Thread.sleep(3000);
			driver.quit();
		}
}

