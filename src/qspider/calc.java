package qspider;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.handler.timeout.TimeoutException;

public class calc {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	//	Runtime.getRuntime().exec("c:/windows/system32/calc.exe");
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\rushi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	driver.get("http://www.naukri.com/");
	Set<String> window=driver.getWindowHandles();
	int cnt=window.size();
	
	System.out.println(cnt);
	for(String wh:window)
	{
		driver.switchTo().newWindow(WindowType.WINDOW);
		String title=driver.getTitle();
		System.out.println(title);
		//driver.close();
		
	}
	
	/*WebElement em=driver.findElement(By.id("email"));
	
	String s=em.getCssValue("font-size");
	
	System.out.println(s);
	
	
String s2=em.getCssValue("color");
	
	System.out.print(s2);*/
		
	}

}
