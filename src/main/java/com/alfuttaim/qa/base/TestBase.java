package com.alfuttaim.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.alfuttaim.qa.util.TestUtil;

public class TestBase {

	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()  {
		try {
		prop=new Properties();
		
		FileInputStream ip=new FileInputStream("C:\\Users\\Saurabh\\eclipse-workspace\\SaurabhAssignmenttest"
				+ "\\src\\main\\java\\com\\alfuttaim\\qa\\config\\config.properties");
		
		prop.load(ip);
		}
		
		catch(FileNotFoundException e){
			e.printStackTrace();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void initialization() {
		
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saurabh\\eclipse-workspace\\SaurabhAssignmenttest\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Saurabh\\eclipse-workspace\\SaurabhAssignmenttest\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
		
		driver.get(prop.getProperty("url"));
		
		
	}
	
	public WebDriverWait processingimpliwait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
		return null;
	}
	
	public WebDriverWait processingExpliwait(String xpath)
	{
		WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(30))
		        .until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		// Print the first result
				System.out.println(firstResult.getText());
		return null;
	}
	
	public void switchtab()
	{
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
	}
	
	public void switchbacktab()
	{
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
	}
	
	
	public void captureScreen(String TestMethodName) throws IOException {
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:\\Users\\Saurabh\\eclipse-workspace\\SaurabhAssignmenttest\\Screenshots\\"+TestMethodName+"_"+".jpg"));
		
	}

	
	public void scrolltoelement(String elementxpath)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath(elementxpath));
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
}
