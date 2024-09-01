package Core.Services;

import Core.Enums.Platform;
import io.appium.java_client.AppiumDriver;

public class LaunchAppTest {
    public static void main(String[] args) {
        AppiumDriver appiumDriver = MobileDriver.getDriver(Platform.ANDROID);
        appiumDriver.quit();
    }
}
