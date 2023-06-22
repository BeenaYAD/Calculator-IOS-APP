package com.setup;

import com.util.Utility;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static IOSDriver driver;

    @BeforeSuite
    public void setup() throws IOException, InterruptedException {
        final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
        try {
            File appDir = new File(" IOS App");
            File app = new File(appDir, Utility.getvar("IOS App"));

            //create an object of Desired Capabilities
            DesiredCapabilities caps = new DesiredCapabilities();

            //Setup the device info
            caps.setCapability("platformName", Utility.getvar("PLATFORM_NAME"));
            caps.setCapability("platformVersion", Utility.getvar("PLATFORM_VERSION"));
            caps.setCapability("deviceName", Utility.getvar("DEVICE_NAME"));
            caps.setCapability("app", app.getAbsolutePath());
            caps.setCapability("autoAcceptAlerts", true);
            caps.setCapability("autoAcceptAlerts", true); //to accept all alerts
            caps.setCapability("noReset", "true");
            caps.setCapability("fullReset", "false");
            driver = new IOSDriver<MobileElement>(new URL(URL_STRING), caps);

            driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
            this.driver = driver;
        } catch (Exception exp) {
            System.out.println("cause is :" + exp.getCause());
            System.out.println("message is :" + exp.getMessage());
            exp.printStackTrace();
        }
    }

    @AfterSuite
    public void close() {
        // TODO Auto-generated method stub
        System.out.println("close driver");

    }

}