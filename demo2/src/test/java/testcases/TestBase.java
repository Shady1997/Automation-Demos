package testcases;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.example.capailities.Capapility;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class TestBase extends Capapility {
    static AndroidDriver<AndroidElement> driver;
    @BeforeTest
    public static void prepare() throws IOException, InterruptedException {
        // TODO start application with appium
        driver = baseCapabilities("AppName");
        Thread.sleep(5000);
    }

    @AfterClass
    public static void TearDown() {
        driver.quit();
    }
}
