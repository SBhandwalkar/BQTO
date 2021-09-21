package com.cucumber.utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.CapabilityType;

/**
 * This class defines driver initializing activity. This class has methods like
 * open browser and close browser.
 */

public class BrowserFactory extends LoggerClass {
	public static WebDriver driver;
	public static WebDriverWait wait;

	public static WebDriver getDriver() {

		return driver;
	}

    /**
    * @FUNCTION_HEADER*****************************************************************************
    * @name: openBrowser
    * @purpose: launch the browser according to the properties value
    * @param :none
    * @author kuabhis5
    * @return: void
    * @throws InterruptedException
     * @throws MalformedURLException 
    * 
     ***/
    public static void openBrowser(String Browser, String Url) throws InterruptedException, MalformedURLException {
           if (Browser.equalsIgnoreCase("Firefox")) {
                  System.setProperty("webdriver.geckodriver.driver", "src/test/resources/BrowserDriver/geckodriver.exe");
                  driver = new FirefoxDriver();
           //     wait = new WebDriverWait(driver, 20);
                  
                  log.info("Fire Fox driver created");
           } else if (Browser.equalsIgnoreCase("chrome")) {
        	   
        	   
                  System.setProperty("webdriver.chrome.driver", "src/test/resources/BrowserDriver/chromedriver.exe");
                  
               // configure options parameter to Chrome driver
                  ChromeOptions options= new ChromeOptions();
                  // add Incognito parameter
                  options.addArguments("--incognito");
                  // DesiredCapabilities object
                  DesiredCapabilities c = DesiredCapabilities.chrome();
                  //set capability to browser
                  c.setCapability(ChromeOptions.CAPABILITY, options);
//                  WebDriver driver = new ChromeDriver(o);
                 //DesiredCapabilities dc = DesiredCapabilities.chrome();
                  
//                  WebDriver driver = new ChromeDriver(options);
//                  driver.get("https://www.tutorialspoint.com/index.htm ");
                 // dc.setPlatform(Platform.LINUX);
                  //dc.setBrowserName("chrome");
                  driver = new ChromeDriver(options);
                 //driver = new RemoteWebDriver(new URL("http://zalenium-grid.mgmt.bpm.dev.za.omapps.net/wd/hub"), dc);

                  driver.manage().deleteAllCookies();
                  wait = new WebDriverWait(driver, 20);
                  log.info("Chrome driver created");
                  // clearBrowserCache();
                  
           } else if (Browser.equalsIgnoreCase("IE")) {
                  System.setProperty("webdriver.ie.driver", "src/test/resources/BrowserDriver/IEDriverServer.exe");
                  InternetExplorerOptions ieOpts = new InternetExplorerOptions();
         ieOpts.setCapability("nativeEvents", false);
         ieOpts.setCapability("unexpectedAlertBehaviour", "accept");
         ieOpts.setCapability("ignoreProtectedModeSettings", true);
         ieOpts.setCapability("disable-popup-blocking", true);
         ieOpts.setCapability("enablePersistentHover", true);
         ieOpts.setCapability("ignoreZoomSetting", true);
         ieOpts.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
         driver = new InternetExplorerDriver(ieOpts);
                  //driver = new InternetExplorerDriver();
                  wait = new WebDriverWait(driver, 20);
                  log.info("IE driver created");
           }

           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
          
//           String[] arr = Url.split("//",2);
//        		   Url= arr[0] + "username:password@"+arr[1];
        		   
        		   
        		    
       
           driver.get(Url);
    
    }

    
    
    public static void HealthCheckUrl(String Browser,String strDataFile, String strDataSheet) throws InterruptedException, MalformedURLException {
        String Url = "";
    	if (Browser.equalsIgnoreCase("Firefox")) {
               System.setProperty("webdriver.geckodriver.driver", "src/test/resources/BrowserDriver/geckodriver.exe");
               driver = new FirefoxDriver();
        //     wait = new WebDriverWait(driver, 20);
               
               log.info("Fire Fox driver created");
        } else if (Browser.equalsIgnoreCase("chrome")) {
               System.setProperty("webdriver.chrome.driver", "src/test/resources/BrowserDriver/chromedriver.exe");
              // driver = new ChromeDriver();
               
               driver = new RemoteWebDriver(new URL("https://zalenium.mgmt.bpm.dev.za.omapps.net/grid/console"), DesiredCapabilities.chrome());
               driver.manage().deleteAllCookies();
               //wait = new WebDriverWait(driver, 20);
               log.info("Chrome driver created");
               // clearBrowserCache();

        } else if (Browser.equalsIgnoreCase("IE")) {
               System.setProperty("webdriver.ie.driver", "src/test/resources/BrowserDriver/IEDriverServer.exe");
               InternetExplorerOptions ieOpts = new InternetExplorerOptions();
      ieOpts.setCapability("nativeEvents", false);
      ieOpts.setCapability("unexpectedAlertBehaviour", "accept");
      ieOpts.setCapability("ignoreProtectedModeSettings", true);
      ieOpts.setCapability("disable-popup-blocking", true);
      ieOpts.setCapability("enablePersistentHover", true);
      ieOpts.setCapability("ignoreZoomSetting", true);
      ieOpts.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
      driver = new InternetExplorerDriver(ieOpts);
               //driver = new InternetExplorerDriver();
               wait = new WebDriverWait(driver, 20);
               log.info("IE driver created");
        }

        driver.manage().window().maximize();
        Url = strDataFile + strDataSheet;
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(Url);
 
 }


	public static void clearBrowserCache() throws InterruptedException {
		// Clearing browser cache implementation
		driver.get("chrome://settings/clearBrowserData");

		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("* /deep/ #advancedPage")));
		wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.cssSelector("* /deep/ #clearBrowsingDataConfirm"))));
		// click the button to clear the cache
		driver.findElement(By.cssSelector("* /deep/ #clearBrowsingDataConfirm")).click();

		// wait for the button to be gone before returning
		wait.until(
				ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("* /deep/ #clearBrowsingDataConfirm")));
	}

	public void closeBrowser() {
		getDriver().quit();
	}

	

}
