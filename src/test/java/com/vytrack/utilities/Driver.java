package com.vytrack.utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Driver {

    private Driver() {
    }
    // InheritableThreadLocal  --> this is like a container, bag, pool.
    // in this pool we can have separate objects for each thread
    // for each thread, in InheritableThreadLocal we can have separate object for that thread
    // driver class will provide separate webdriver object per thread

    private static final InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();

    public static WebDriver get(){
        String browser = System.getProperty("browser") != null ? browser = System.getProperty("browser") : ConfigurationReader.get("browser");
    //    String browser = ConfigurationReader.get("browser");
        if (driverPool.get() == null) {
            setDriver(browser);
        }

        return driverPool.get();
    }



    public static WebDriver get(String browserType) {
        //if this thread doesn't have driver - create it and add to pool
        if (driverPool.get() == null) {
//            if we pass the driver from terminal then use that one
//           if we do not pass the driver from terminal then use the one property file
//            String browser = System.getProperty("browser") != null ? browser = System.getProperty("browser") :
 //                   ConfigurationReader.get("browser");

            setDriver(browserType);
        }
        return driverPool.get();
    }

    public static void setDriver(String browserType){
        switch (browserType) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driverPool.set(new ChromeDriver());
                break;
            case "chrome-headless":
                WebDriverManager.chromedriver().setup();
                driverPool.set(new ChromeDriver(new ChromeOptions().setHeadless(true)));
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driverPool.set(new FirefoxDriver());
                break;
            case "firefox-headless":
                WebDriverManager.firefoxdriver().setup();
                driverPool.set(new FirefoxDriver(new FirefoxOptions().setHeadless(true)));
                break;
            case "ie":
                if (!System.getProperty("os.name").toLowerCase().contains("windows"))
                    throw new WebDriverException("Your OS doesn't support Internet Explorer");
                WebDriverManager.iedriver().setup();
                driverPool.set(new InternetExplorerDriver());
                break;
            case "edge":
                if (!System.getProperty("os.name").toLowerCase().contains("windows"))
                    throw new WebDriverException("Your OS doesn't support Edge");
                WebDriverManager.edgedriver().setup();
                driverPool.set(new EdgeDriver());
                break;
            case "safari":
                if (!System.getProperty("os.name").toLowerCase().contains("mac"))
                    throw new WebDriverException("Your OS doesn't support Safari");
                WebDriverManager.getInstance(SafariDriver.class).setup();
                driverPool.set(new SafariDriver());
                break;
            case "remote-chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setCapability("platform", Platform.ANY);
                try {
                    //   driverPool.set(new RemoteWebDriver(new URL("http://3.236.102.181:4444/wd/hub"),chromeOptions));
                    //  jenkins 18.212.210.75 benim aws ip'im 20-11
                    // selenimgrid ip 172.31.5.13:4444
                    // selenimgrid public ip : 13.58.94.118
                    //  driverPool.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),chromeOptions));


                    driverPool.set(new RemoteWebDriver(new URL("https://oauth-sdet.cemil.sahin-4698a:f5e9d6e6-8ad4-435c-ad5d-89605c889b2c@ondemand.eu-central-1.saucelabs.com:443/wd/hub"),chromeOptions));


                    //    driverPool.set(new RemoteWebDriver(new URL("http://13.58.94.118:4444/wd/hub"),chromeOptions));

                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                break;

            case "remote-firefox":
                try{
                    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                    desiredCapabilities.setBrowserName(BrowserType.FIREFOX);
                    driverPool.set(new RemoteWebDriver(new URL("http://13.58.94.118:4444/wd/hub"),
                            desiredCapabilities));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "remote-firefox1":
                try{
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.setCapability("platform", Platform.ANY);
                    driverPool.set(new RemoteWebDriver(new URL("http://13.58.94.118:4444/wd/hub"),
                            //   driverPool.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
                            firefoxOptions));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;

            case "mobile-chrome":
                DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

                desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
                desiredCapabilities.setCapability(MobileCapabilityType.VERSION,"8.0");
                desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel_2");
                desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");

                desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserType.CHROME);

                try {
                    driverPool.set(new RemoteWebDriver(new URL("http://localhost:4723/wd/hub"),desiredCapabilities));
                    //    driverPool.set(new AppiumDriver<>(new URL("http://localhost:4723/wd/hub"),
                    //           desiredCapabilities));
                } catch (MalformedURLException e){
                    e.printStackTrace();
                }
                break;

            case "saucelabs":
                SafariOptions browserOptions = new SafariOptions();
                browserOptions.setCapability("platformName", "macOS 12");
                browserOptions.setCapability("browserVersion", "15");
                Map<String, Object> sauceOptions = new HashMap<>();
                browserOptions.setCapability("sauce:options", sauceOptions);
                try {
                    driverPool.set(new RemoteWebDriver(new URL("https://oauth-sdet.cemil.sahin-4698a:f5e9d6e6-8ad4-435c-ad5d-89605c889b2c@ondemand.eu-central-1.saucelabs.com:443/wd/hub"),browserOptions));
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                break;

            case "mobile-saucelabs":
                MutableCapabilities caps = new MutableCapabilities();
                caps.setCapability("platformName", "Android");
                caps.setCapability("browserName", "Chrome");
                caps.setCapability("appium:deviceName", "Google Pixel GoogleAPI Emulator");
                caps.setCapability("appium:platformVersion", "8.0");
                MutableCapabilities sauceOptions1 = new MutableCapabilities();
                sauceOptions1.setCapability("appiumVersion", "1.20.2");
                caps.setCapability("sauce:options", sauceOptions1);
                try {
                    driverPool.set(new RemoteWebDriver(new URL("https://oauth-sdet.cemil.sahin-4698a:f5e9d6e6-8ad4-435c-ad5d-89605c889b2c@ondemand.eu-central-1.saucelabs.com:443/wd/hub"),caps));
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                break;
            default:
                throw new WebDriverException("Your OS doesn't support " + browserType + ". Check the browser " +
                        "type in configuration.properties file.");
        }
    }


    public static void closeDriver() {
        if(driverPool.get() != null) {
            driverPool.get().quit();
            driverPool.remove();
        }
    }
}