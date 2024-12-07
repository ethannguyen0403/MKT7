package driver.mobile;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.apache.commons.lang3.text.WordUtils;
import driver.Driver;
import driver.DriverProperties;

import static driver.mobile.AppiumServer.startAppiumServer;

public class MobileAndroidDriver extends Driver {

    public MobileAndroidDriver(DriverProperties properties) throws MalformedURLException {
        super(properties);
        UiAutomator2Options options = new UiAutomator2Options()
                .setUdid(properties.getUDID())
                .setDeviceName(properties.getDeviceName())
                .setPlatformName(WordUtils.capitalize(properties.getPlatform().toString().toLowerCase()))
                .setPlatformVersion(properties.getPlatformVersion())
                .setNewCommandTimeout(Duration.ofSeconds(60))
                .setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2)
                .withBrowserName(WordUtils.capitalize(properties.getBrowserName().toString().toLowerCase()))
                .setSkipUnlock(true)
                .setSkipDeviceInitialization(true)
                .setNoReset(true);
        startAppiumServer();
        setWebDriver(new AndroidDriver(new URL(properties.getRemoteURL()), options));
        getWebDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

}
