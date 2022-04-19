package qspider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainmethod  {

	public static void main(String[] args) throws InterruptedException   {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\rushi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/");
		login l=new login(driver);
		
		String xlpath="./testdata/tdr.xlsx";
		
		l.login2("abc", "xyz");
		
		Thread.sleep(2000);
		
		l.login2("admin","manager");
	}

}
