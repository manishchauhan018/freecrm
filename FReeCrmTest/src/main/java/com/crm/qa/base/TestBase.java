package com.crm.qa.base;

import java.io.FileInputStream; 
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.crm.qa.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() throws IOException {
		
		prop= new Properties();
		try {
			FileInputStream ip=new FileInputStream(System.getProperty("C:\\Users\\dell\\eclipse-workspace\\FReeCrmTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties"));
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void initialization() {
		
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	/*	else if(browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\geckodriver.exe");
			driver = new FirefoxDriver();
		} */
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			
			driver.get(prop.getProperty("url"));

	}

	}
