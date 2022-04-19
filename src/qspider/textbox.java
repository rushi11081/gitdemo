package qspider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class textbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\rushi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/demo2.html");
		WebElement tv=driver.findElement(By.cssSelector("input[type='text']"));
		//.args..clear();
		//tv.sendKeys("webdriver");
		
		Actions act=new Actions(driver);
		
		act.contextClick(tv).perform();
		act.sendKeys("text").perform();
		//act.doubleClick(tv).perform();
		//Thread.sleep(2000);
		
		//String s=tv.getAttribute("value");
		//int count=s.length();
		//for(int i=1;i<=count;i++)
			//tv.sendKeys(Keys.BACK_SPACE);
		//tv.sendKeys(Keys.CONTROL+"a");
		
		//tv.sendKeys(Keys.CONTROL+"c");
		//Thread.sleep(2000);
		WebElement td=driver.findElement(By.xpath("/html/body/input[2]"));
		
		act.dragAndDrop(tv, td).perform();
		//td.clear();
		//td.sendKeys(Keys.CONTROL+"v");
		//tv.sendKeys(Keys.DELETE);
		
	}

}
