package org.sms.runtests;
import org.testng.annotations.Test;
import org.tyss.sms.genricUtility.BaseClassTest;
import org.tyss.sms.pagerepo.SmsLoginPageTest;
import org.tyss.sms.pagerepo.Sms_CommonHomePageTest;

public class AddteacherScriptTest extends BaseClassTest {
	SmsLoginPageTest loginPage;
	Sms_CommonHomePageTest commonPage;
	Sms_CommonHomePageTest  homePage;
	@Test
	public void addTeacher() {	

		//Create objects of pom classes
		loginPage = new SmsLoginPageTest();
		commonPage = new Sms_CommonHomePageTest();
		homePage = new Sms_CommonHomePageTest();

		//init methods
		loginPage.login(username, password).getTeacherTab()
		.getAddTeacherTab()
		.setAddTeachersData(excelUtility,password, password, password, password, password, password, username, password);

	}
}
