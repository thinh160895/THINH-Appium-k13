package Core.Services;

import Core.Constants.MobileCapabilityType;
import Core.Enums.Platform;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MobileDriver {
    public static AppiumDriver getDriver(Platform platform){
        AppiumDriver appiumDriver = null;
        // DesiredCaps
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.FLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.UDID, "R39M10FTLFM");
        desiredCapabilities.setCapability(MobileCapabilityType.APP_PACKAGE, "com.wdiodemoapp");
        desiredCapabilities.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.wdiodemoapp.MainActivity");
        URL appiumSever = null;

        try {
            appiumSever = new URL("http://localhost:4723");
        } catch (Exception e){
            e.printStackTrace();
        }
        if(appiumSever == null){
            throw new RuntimeException("Can't construct appium server URL");
        }

        switch (platform){
            case ANDROID:
                appiumDriver = new AndroidDriver(appiumSever, desiredCapabilities);
                break;
            case IOS:
                appiumDriver = new IOSDriver(appiumSever, desiredCapabilities);
                break;
        }
        return appiumDriver;
    }
}
