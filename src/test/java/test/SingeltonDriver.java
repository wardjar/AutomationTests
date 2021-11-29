package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingeltonDriver {

	    private static SingeltonDriver instance = null;
	    private WebDriver driver;

	    private SingeltonDriver() {

	    }

	    public WebDriver openBrowser() {
	    	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        return driver;
	    }

	    public static SingeltonDriver getInstance() {
	        if (instance == null) {
	            instance = new SingeltonDriver();
	        }
	        return instance;
	    }

	}

