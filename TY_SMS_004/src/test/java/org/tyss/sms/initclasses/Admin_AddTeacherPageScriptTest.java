package org.tyss.sms.initclasses;


import org.testng.annotations.Test;
import org.tyss.sms.genricUtility.BaseClassTest;
import org.tyss.sms.pagerepo.Admin_AddTeacherPageTest;
import org.tyss.sms.pagerepo.SmsLoginPageTest;
import org.tyss.sms.pagerepo.Sms_CommonHomePageTest;

public class Admin_AddTeacherPageScriptTest extends BaseClassTest {
	Admin_AddTeacherPageScriptTest addTeacher;
	SmsLoginPageTest loginPage;
	Sms_CommonHomePageTest commonPage;
	@Test
	public void AddTeacher() {
		loginPage = new SmsLoginPageTest();
		commonPage = new Sms_CommonHomePageTest();
		 addTeacher = new Admin_AddTeacherPageScriptTest();
		 loginPage.login(username,password).getTeacherTab().getAddTeacherTab().setAddTeachersData(excelUtility, password, password, password, password, password, password, username, password);
				
	}

}
