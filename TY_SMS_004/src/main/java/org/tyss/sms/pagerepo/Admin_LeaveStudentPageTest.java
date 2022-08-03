 package org.tyss.sms.pagerepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tyss.sms.genricUtility.SmsWebDriverUtility;
import org.tyss.sms.genricUtility.ThreadSafeClass;

public class Admin_LeaveStudentPageTest {
	@FindBy(xpath="//td[.='1']/following-sibling::td[2]/a[.='Active']")
	private WebElement activeBtn;
	
	@FindBy(xpath="//td[.='1']/following-sibling::td[2]/a[.='View']") 
	private WebElement viewBtn;
	@FindBy(xpath="//select[@id='grade']")
	private WebElement selectDropDown;
	@FindBy(xpath = "(//table[@class='table ']/tbody/tr/td[1])[1]")
	private WebElement checkbox;
	
	@FindBy(xpath="//a[@id='btnYes']")
	private WebElement yesbtn;
	@FindBy(xpath="//button[@id='btnSubmit1']")
	private WebElement submitbtn;

	public Admin_LeaveStudentPageTest() {
		PageFactory.initElements(ThreadSafeClass.getDriver(),this);
	}
	
	
	
	
	public Admin_LeaveStudentPageTest setActive() {
		activeBtn.click();
		return this;
	}
	public Admin_LeaveStudentPageTest setView() {
		viewBtn.click();
		return this;
	}
	public Admin_LeaveStudentPageTest handleTab() {
		yesbtn.click();
		return this;
		
	}
	public void gradeSelect(SmsWebDriverUtility webdriverutil) {
		 webdriverutil.dropdownByText(selectDropDown, "Grade 1");
		selectDropDown.click();
	}
	public Admin_LeaveStudentPageTest checkboxhandle() {
		checkbox.click();
		return this;
	}
	public Admin_LeaveStudentPageTest clickOnSubmit() {
		submitbtn.click();
		return this;
	}

}
