package qspider;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class list {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver","C:\\Users\\rushi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/demo5.html");
	
		WebElement list=driver.findElement(By.name("country"));
		Select sel=new Select(list);
		
		/*boolean b=sel.isMultiple();
		
		System.out.print(b);
		
		sel.selectByIndex(1);
		Thread.sleep(2000);
		sel.selectByValue("usd");
		Thread.sleep(2000);
		sel.selectByVisibleText("united states");
		
		
		sel.deselectByIndex(1);
		Thread.sleep(2000);
		sel.deselectByValue("usd");
		
		sel.deselectByVisibleText("united states");*/
		
		
		List<WebElement> alloption=sel.getOptions();
		
		int count=alloption.size();
		
		/*System.out.print(count);
		
		for(int i=0;i<count;i++)
		{
			
			sel.selectByIndex(i);
			Thread.sleep(2000);
			
		}
		
		sel.deselectAll();*/
		
		ArrayList<String> alltext=new ArrayList<String>();
		
		for(int i=0;i<count;i++)
		{
			
			String text=alloption.get(i).getText();
			alltext.add(text);
		}
		
		Collections.sort(alltext);
		for(String s:alltext)
		{
			
			System.out.println(s);
		}
		
	
	}

}
