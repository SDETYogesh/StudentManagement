package org.seleniumgrid;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid001 {
public static void main(String[] args) throws MalformedURLException {
	URL url = new URL("https://65.2.10.241:5555");
	//step2
	
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setBrowserName("chrome");
	cap.setPlatform(Platform.WINDOWS);
	//step3
	RemoteWebDriver rmw = new RemoteWebDriver(url, cap);
	
	//step4
	rmw.get("https://www.selenium.dev/");
}
}
