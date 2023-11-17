package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;

	public static void init() {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://techfios.com/billing/?ng=login");

	}

	public void takeScreenshot(WebDriver driver) {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yy_HHmmss");
		Date date = new Date();
		String label = formatter.format(date);

		

		try {
		  //FileUtils.copyFile(sourceFile,new File(System.getProperty("user.dir") + "/screenshots/" + System.currentTimeMillis() + ".png"));
			FileUtils.copyFile(sourceFile,new File(System.getProperty("user.dir") + "/screenshots/" + label + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}

	public int generateRandomNum(int boundaryNum) {

		Random rnd = new Random();
		int num = rnd.nextInt(boundaryNum);
		return num; 
		
	}
	
}
