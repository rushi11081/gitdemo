package qspider;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo 
{
	
/*	public void strrepeat()
	{
		String name="managment";
		int ctr=0;
		for(int i=0; i<name.length(); i++)
		{
			int flag=0;
			for(int j=0; j<name.length(); j++)
			{
				if(i==j)
				{
					continue;
				}
				else if(name.charAt(i)==name.charAt(j))
				{
					flag=1;
					ctr++;
					
					break;
				}
				
			}
			if(flag==0)
			{
				System.out.print(name.charAt(i));
			}
	}
	
		
		System.out.print(ctr);
	}*/

	public static void main(String[] args)   
	{
		// TODO Auto-generated method stub

		//FirefoxDriver driver=new FirefoxDriver();
	/*	System.setProperty("webdriver.chrome.driver","C:\\Users\\rushi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//WebDriverManager.Chromedriver.setup();
		driver.get("https://www.amazon.com");
		String title=driver.getTitle();
		if(title.equals("amazon"))
		{
			System.out.println("pass");
		}
		else
			System.out.println("fail");
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("https://www.amazon.com"))
		{
			System.out.println("pass");
		}
		else
			System.out.println("fail");
		
		/*Thread.sleep(2000);
		driver.navigate().to("http://www.gmail.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.quit();*/
		
		String input="java allow";
		
		int cnt=StringUtils.countMatches(input,'a');
		
		System.out.print(cnt);
		
		
		
	}
}

