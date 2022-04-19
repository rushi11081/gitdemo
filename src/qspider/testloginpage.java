package qspider;

import org.testng.annotations.Test;

public class testloginpage extends base{

	@Test
	public void testvalidlogin()
	{
		
		login page=new login(driver);
		
		page.login2("admin", "manager");
	}
}
