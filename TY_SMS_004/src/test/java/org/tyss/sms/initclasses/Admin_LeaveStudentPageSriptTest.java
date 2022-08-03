package org.tyss.sms.initclasses;


import org.testng.annotations.Test;
import org.tyss.sms.genricUtility.BaseClassTest;
import org.tyss.sms.pagerepo.Admin_LeaveStudentPageTest;
import org.tyss.sms.pagerepo.SmsLoginPageTest;
import org.tyss.sms.pagerepo.Sms_CommonHomePageTest;

public class Admin_LeaveStudentPageSriptTest extends BaseClassTest {
		SmsLoginPageTest loginPage;
		Sms_CommonHomePageTest commonPage;
		Admin_LeaveStudentPageTest studentLeavePage;
		
		@Test
		public void loginTest() {
		//Create objects of pom classes
			loginPage = new SmsLoginPageTest();
			commonPage = new Sms_CommonHomePageTest();
			studentLeavePage = new Admin_LeaveStudentPageTest();
			
//		Sms_CommonHomePage homePage = new Sms_CommonHomePage(driver);
		
		//init methods
		loginPage.login(username,password).getStudentTab().getLeaveStudentTab();
		studentLeavePage.setActive();
		webdriverUtil.intiallizeExplicitWait(longTimeout, longTimeout);
		studentLeavePage.handleTab().gradeSelect(webdriverUtil);
		webdriverUtil.intiallizeExplicitWait(longTimeout, longTimeout);
		studentLeavePage.checkboxhandle().clickOnSubmit();

		
		
		//webdriverUtil.dropdownByText("class2", timeout);
	}

	}
//}

