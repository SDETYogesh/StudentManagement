package org.tyss.sms.initclasses;

import org.testng.annotations.Test;
import org.tyss.sms.genricUtility.BaseClassTest;
import org.tyss.sms.pagerepo.SmsLoginPageTest;
import org.tyss.sms.pagerepo.Sms_CommonHomePageTest;

public class Parent_AllTeacherScriptTest extends BaseClassTest {
	Parent_AllTeacherScriptTest PAllTeacher;
	SmsLoginPageTest loginPage;
	Sms_CommonHomePageTest commonPage;
	@Test
	public void P_AllTeacher() {
		loginPage = new SmsLoginPageTest();
		commonPage = new Sms_CommonHomePageTest();
		PAllTeacher = new Parent_AllTeacherScriptTest();
		loginPage.login(username, password).getAllTeacherTab().setsal(webdriverUtil);
	}
}
