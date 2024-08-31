package Core.Services;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class LaunchAppTest {
    public static void main(String[] args) {
        // DesiredCaps
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability("udid", "R39M10FTLFM");
        desiredCapabilities.setCapability("appPackage", "com.wdiodemoapp");
        desiredCapabilities.setCapability("appActivity", "com.wdiodemoapp.MainActivity");

        AppiumDriver appiumDriver = null;
        // Init session
        try {
            URL appiumSever = new URL("http://localhost:4723");
            appiumDriver = new AndroidDriver(appiumSever, desiredCapabilities);
        } catch (Exception e){
            e.printStackTrace();
        }


        // Close session
        if (appiumDriver != null) {
            appiumDriver.quit();
        }
    }
}
