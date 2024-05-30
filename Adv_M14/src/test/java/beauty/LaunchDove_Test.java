package beauty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LaunchDove_Test {

	@Test
	public void nykaa() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Window is maximized",true);
	//	driver.get("https://www.dove-india.com/");
      String url = System.getProperty("url");
      driver.get(url);
 
		Thread.sleep(2000);
		driver.quit();
	}
}
