package org.tyss.sms.genricUtility;

import org.openqa.selenium.WebDriver;

public class ThreadSafeClass {
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	public static WebDriver getDriver() {
		return driver.get();
	}
	public static void setDriver(WebDriver actdriver) {
		driver.set(actdriver);
	}

}
