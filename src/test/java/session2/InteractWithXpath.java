package session2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractWithXpath {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		driver.get("http://demo.automationtesting.in/Register.html");
		System.out.println("Landing page title is- " + driver.getTitle());
		
		WebElement UserFirstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		UserFirstName.sendKeys("Aniket");
		
		WebElement UserLastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		UserLastName.sendKeys("Raundale");
		
		WebElement UserAdress = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		UserAdress.sendKeys("Amravati");
		
		WebElement UserEmailAdress = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		UserEmailAdress.sendKeys("raundaleaniket@gmail.com");
		
		WebElement UserPhoneNo = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		UserPhoneNo.sendKeys("8600963658");
		
		WebElement maleRadio = driver.findElement(By.xpath("//input[@value='Male']"));
		maleRadio.click();
		
		WebElement moviesCheckBox = driver.findElement(By.id("checkbox2"));
		
		moviesCheckBox.click();
		
		WebElement UserPassword = driver.findElement(By.xpath("//input[@ng-model='Password']"));
		UserPassword.sendKeys("963658");
		
		WebElement UserCPassword = driver.findElement(By.xpath("//input[@ng-model='CPassword']"));
		UserCPassword.sendKeys("963658");
		
       WebElement submitApp=driver.findElement(By.xpath("//button[@id='submitbtn']"));
       submitApp.click();
		
		
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}

