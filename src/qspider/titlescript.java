package qspider;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class titlescript 
{

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rushi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//Actions act=new Actions(driver);
		
		driver.get("https://www.amazon.com");
		
		WebElement list=driver.findElement(By.xpath("//select[@title='Search in']"));
		
		Select list1= new Select(list);
		
		list1.selectByIndex(2);
		
		WebElement serach=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		
	     serach.click();
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("selenium books");
		//act.driver.findElement(By.id("twotabsearchtextbox"));
		//driver.findElement(By.className("a-m-us a-aui_72554-c a-aui_accordion_a11y_role_354025-c a-aui_killswitch_csa_logger_372963-c a-aui_launch_2021_ally_fixes_392482-c a-aui_pci_risk_banner_210084-c a-aui_preload_261698-c a-aui_rel_noreferrer_noopener_309527-c a-aui_template_weblab_cache_333406-c a-aui_tnr_v2_180836-c a-meter-animate")).click();
		//driver.findElement(By.xpath("/html/body/class")).click();
		
		/*TakesScreenshot ts= (TakesScreenshot)driver;
		File scrfile= ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("D://raja.png");
		FileUtils.copyFile(scrfile, dest);*/
		
	}
}
