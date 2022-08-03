package org.tyss.sms.pagerepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tyss.sms.genricUtility.SmsExcelUtility;
import org.tyss.sms.genricUtility.ThreadSafeClass;

public class Admin_AddTeacherPageTest {

	@FindBy(id="index_number")
	private WebElement indexNumTxtBox;

	@FindBy(id="full_name")
	private WebElement full_nameTxtBox;

	@FindBy(id="i_name")
	private WebElement i_nameTxtBox;

	@FindBy(id="address")
	private WebElement addressTxtBox;

	@FindBy(id="phone")
	private WebElement phoneTxtBox;

	@FindBy(id="email")
	private WebElement emailTxtBox;

	@FindBy(id="fileToUpload")
	private WebElement fileToUploadBtn;

	@FindBy(id="btnSubmit")
	private WebElement submitbtn;

	public Admin_AddTeacherPageTest() {
		PageFactory.initElements(ThreadSafeClass.getDriver(), this);
	}

	public void setAddTeachersData(SmsExcelUtility excelUtility,String index_number,
			String full_nameTxBox, String i_nameTxt,String addressTxt,String phoneTxt, String emailTxt,
			String fileToUpload,String submit) {
		indexNumTxtBox.sendKeys(full_nameTxBox);
		full_nameTxtBox.sendKeys(index_number);
		i_nameTxtBox.sendKeys(i_nameTxt);
		addressTxtBox.sendKeys(addressTxt);
		phoneTxtBox.sendKeys(phoneTxt);
		emailTxtBox.sendKeys(emailTxt);
		fileToUploadBtn.sendKeys(fileToUpload);
		submitbtn.sendKeys(submit);




	}

}
