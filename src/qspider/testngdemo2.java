package qspider;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testngdemo2 extends base
{

public WebDriver driver;
public String etitile;



	
@BeforeMethod
public void precond()
{
	System.out.println("enter titile");
	
	Scanner sc=new Scanner(System.in);
	etitile=sc.next();
	Reporter.log("etitile"+etitile,true);
	
	testngdemo2 d=new testngdemo2();
	
}

 @Test
 public void testgoogle()
 {
	 driver.get("http://www.google.com");
	 String atitile=driver.getTitle();
	 Reporter.log("atitile" +atitile,true);
	 Assert.assertEquals(atitile, etitile);
 }
	
	
	
	
}
