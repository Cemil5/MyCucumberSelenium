package com.vytrack.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {

    private static WebDriver driver;       // static variable: only one copy for all objects

    private Driver() {}                 // private constructor : to prevent creating object from this class

    public static WebDriver get() {     // no parameter, getting the browser type from Configuration.Properties

        if (driver == null) {
            String browser = ConfigurationReader.get("browser");

            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "chrome-headless":     // headless : invisible chrome, your test will be executed.
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case "chrome-noSSL":        // change chrome options to accept untrusted certificate
                    WebDriverManager.chromedriver().setup();
                    //Create instance of ChromeOptions Class
                    ChromeOptions handlingSSL = new ChromeOptions();

                    //Accept insecure cert method with true as parameter to accept the untrusted certificate
                    handlingSSL.setAcceptInsecureCerts(true);

                    //Creating instance of Chrome driver by passing reference of ChromeOptions object
                    driver = new ChromeDriver(handlingSSL);
   /*
ChromeOptions handlingSSL = new ChromeOptions(); -- We create an object of ChromeOptions class.
handlingSSL.setAcceptInsecureCerts(true); -- Now we will use a capability setAcceptInsecureCerts. We pass the parameter
as true, which means the invalid certificate will be trusted implicitly by the browser.
WebDriver driver = new ChromeDriver(handlingSSL); -- Next, we create an instance of chrome driver and pass the
ChromeOptions object as an argument so that our browser session will inherit the properties that we have just set.
    */

                    break;
                case "chrome-eager":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setPageLoadStrategy(PageLoadStrategy.EAGER));
                    break;
                case "chrome-none":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setPageLoadStrategy(PageLoadStrategy.NONE));
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "firefox-headless":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
                    break;

                case "ie":
                    if (!System.getProperty("os.name").toLowerCase().contains("windows"))
                        throw new WebDriverException("Your OS doesn't support Internet Explorer");
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;
                case "edge":
                    if (!System.getProperty("os.name").toLowerCase().contains("windows"))
                        throw new WebDriverException("Your OS doesn't support Edge");
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;

                case "safari":
                    if (!System.getProperty("os.name").toLowerCase().contains("mac"))
                        throw new WebDriverException("Your OS doesn't support Safari");
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver = new SafariDriver();
                    break;
            }
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {   // to be able to user different browser for the next test cases.
            driver.quit();
            driver = null;
        }
    }
}