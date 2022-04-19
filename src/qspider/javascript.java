package qspider;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript {

	public static void main(String[] args) throws InterruptedException
	{
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\rushi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/demo4.html");
		driver.manage().window().maximize();
		
		/*List<WebElement> links=driver.findElements(By.xpath("//a"));
		
		int count=links.size();
		
		for(WebElement e:links)
		{
		//WebElement link=links.get(0);
		String text=e.getAttribute("href");
		
		System.out.println(text);
		}*/
		
		List<WebElement> check=driver.findElements(By.xpath("//td"));
		
		int sum=0;
		int count=check.size();
		
		for(int i=0;i<count;i++)
		{
			WebElement ck=check.get(i);
			String text=ck.getText();
			//int x=Integer.parseInt(text);
			
		//sum=sum+x;
			if(StringUtils.isNumeric(text))
			{
				System.out.println(text);
			}
		}
		
		
		
		/*Thread.sleep(2000);
		
		for(int i=count-1;i>=0;i--)
		{
			check.get(i).click();
		}
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//String c= "Window.scrollTo(0,document.body.scrollHeight) ";
			
				
		//js.executeScript("Window.scrollTo(0,1000)");*/
	}
	
}
