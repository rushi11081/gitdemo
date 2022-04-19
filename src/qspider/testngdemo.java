package qspider;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testngdemo {


	@BeforeClass
	public void start()
	{
		Reporter.log("this is start",true);
	}
	
	@AfterClass
	public void end()
	{
		Reporter.log("this is end",true);
	}
		
		
	@Test(priority=2,invocationCount=2)
	public void edituser()
	{
		Reporter.log("edit user",true);
	}
	
	@Test
	public void register()
	{
		Reporter.log("register",true);
	}
	
	
	@Test
	public void deleteuser()
	{
		Reporter.log("delete user",true);
		
	}
	
	@BeforeMethod
	public void login()
	{
		Reporter.log("login",true);
	}
	
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout",true);
	}
	
}
