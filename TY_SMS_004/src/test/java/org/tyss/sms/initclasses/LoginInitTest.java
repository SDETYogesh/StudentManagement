package org.tyss.sms.initclasses;
import org.testng.annotations.Test;
import org.tyss.sms.genricUtility.BaseClassTest;
import org.tyss.sms.pagerepo.SmsLoginPageTest;
import org.tyss.sms.pagerepo.Sms_CommonHomePageTest;

public class LoginInitTest extends BaseClassTest {

	SmsLoginPageTest loginPage;
	Sms_CommonHomePageTest homePage;
	@Test
	public void loginApp() {
		
		//Create objects of pom classes
	loginPage = new SmsLoginPageTest();
	homePage = new Sms_CommonHomePageTest();
		
		//init methods
		loginPage.login(username,password);
		
		
		
		
	}

}
 
