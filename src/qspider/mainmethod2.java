package qspider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainmethod2 {

	public static void main(String[] args) throws InterruptedException   {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\rushi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file://D:/demo4.html");
		login2 l=new login2(driver);
		
		l.selectchk();
		
		Thread.sleep(2000);
		l.selectchk();
	}

}
