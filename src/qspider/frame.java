package qspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame 
{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\rushi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	driver.get("file://D://demoa.html");
	
	driver.findElement(By.id("t1")).sendKeys("abc");
	Thread.sleep(2000);
	driver.switchTo().frame(0);
	driver.findElement(By.id("t2")).sendKeys("xyz");
	
	driver.switchTo().defaultContent();
	
	Thread.sleep(2000);
	driver.findElement(By.id("t1")).clear();
	
	driver.findElement(By.id("t1")).sendKeys("123");
	
	}

}
