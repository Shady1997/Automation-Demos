package simpleAppiumProject;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class main extends Capabilities{

	public static void main(String[] args) throws MalformedURLException{
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver=baseCapabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
	}

}
