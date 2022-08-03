package org.tyss.sms.pagerepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tyss.sms.genricUtility.ThreadSafeClass;

public class SmsLoginPageTest {
	@FindBy(id="email")
	private WebElement loginTxtBox;
	
	@FindBy(id="password")
	private WebElement passTxtBox;
	
	@FindBy(id="btnSubmit")
	private WebElement loginBtn;
	
	//init
	public SmsLoginPageTest() {
		PageFactory.initElements(ThreadSafeClass.getDriver(), this);
	}
	
	 //SetterMethod
	public  Sms_CommonHomePageTest login(String username,String password) {
		loginTxtBox.sendKeys(username);
		passTxtBox.sendKeys(password);
		loginBtn.click();
		//System.out.println(username+password);
		return new Sms_CommonHomePageTest();
	}
	
	

}
