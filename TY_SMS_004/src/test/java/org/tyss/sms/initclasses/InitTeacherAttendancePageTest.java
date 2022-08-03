package org.tyss.sms.initclasses;
import org.testng.annotations.Test;
import org.tyss.sms.genricUtility.BaseClassTest;
import org.tyss.sms.pagerepo.SmsLoginPageTest;
import org.tyss.sms.pagerepo.Sms_CommonHomePageTest;

public class InitTeacherAttendancePageTest extends BaseClassTest {

	SmsLoginPageTest loginPage;
	Sms_CommonHomePageTest commonPage;
	Sms_CommonHomePageTest homePage;
	@Test
	public void TeacherAttendanceTest() {
		//Create objects of pom classes
		loginPage = new SmsLoginPageTest();
		commonPage = new Sms_CommonHomePageTest();
		homePage = new Sms_CommonHomePageTest();

		//init methods
		loginPage.login(username,password).getTimetableTab();
	}		
}

