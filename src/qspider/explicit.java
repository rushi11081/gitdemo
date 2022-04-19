package qspider;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\rushi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//Actions act=new Actions(driver);
		
		driver.get("http://demo.actitime.com");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		//WebDriverWait wait=new WebDriverWait(driver,20);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		
		//String title=driver.getTitle();
		//System.out.println(title);
		
		//wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
		//driver.findElement(By.id("logoutLink")).click();
		
		while(true)
		{
			
			try
			{
				driver.findElement(By.id("logoutLink")).click();
				break;
			}
			catch(NoSuchElementException e)
			{
				
				System.out.println("bye");
			}
		}
	}

}
