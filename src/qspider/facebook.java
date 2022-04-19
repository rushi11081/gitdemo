package qspider;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\rushi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		//WebElement em=driver.findElement(By.id("email"));

		//org.openqa.selenium.Point p= em.getLocation();
//System.out.println(p.getX());
		//System.out.println(p.getY());
		
		WebElement next=driver.findElement(By.id("login_link"));
		
		next.click();
	/*	if(next.isEnabled())
		{
			
			System.out.println("ok");
		}
		
		else
		{
			System.out.println("not ok");
		}
		//org.openqa.selenium.Point p2= next.getLocation();
		
		/*if(p2.getX()-p.getX()<=0)
		{
			System.out.println("horizontal");
		}
		else
		{
			System.out.println("not horizontal");
		}*/
		/*org.openqa.selenium.Dimension size = em.getSize();
		
		System.out.println("Width :"+size.getWidth()+ "," +"Height : "+size.getHeight());
		int w1=size.getWidth();
		WebElement em2=driver.findElement(By.id("pass"));
		
		em2.sendKeys("pass");
		
		org.openqa.selenium.Dimension size2 = em2.getSize();
		
		int w2=size2.getWidth();
		
		System.out.println(w2);
		int h2=size2.getHeight();
		System.out.println(h2);
		if(w1==w2 )
		{
			System.out.print("same");
		}
		else
		{
			System.out.print("not same");
		}*/
		
	}

}
