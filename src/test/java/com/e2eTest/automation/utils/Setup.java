package com.e2eTest.automation.utils;

import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.cucumber.java.Scenario;


public class Setup {
	
	private static WebDriver driver;
	private static final Logger LOGGER = (Logger) LogManager.getLogger(Setup.class.getName());
	
	public void setWebDriver (Scenario scenario) {
		
		LOGGER.info("Scenario: ", +scenario.getName() + "-Started-");
		String browser = System.getProperty("browser");
		if ( browser == null )
		{
		browser = "chrome " ;
			
	}
      switch (browser) {
      
      case " chrome" :
      
      ChromeOptions chromeOptions = new ChromeOptions();
      chromeOptions.addArguments("['start-maximized']");
      chromeOptions.addArguments("disable_search_engine_choice_screen");
      driver = new ChromeDriver(chromeOptions);
      break;
      
      case " firefox" :
          
          FirefoxOptions firefoxOptions = new FirefoxOptions();
          firefoxOptions.setCapability("plateform", Platform.WIN11);
          driver = new FirefoxOptions(firefoxOptions);
          break;
          
      case "edge" :
    	  driver= new EdgeDriver();
    	  break;
    	  default :
    		  throw new IllegalArgumentException("Browser \"" + browser + "\" is not supported.");
      
      }
      
      }

	public static TakesScreenshot getDriver() {
		// TODO Auto-generated method stub
		return null;
	}
}
