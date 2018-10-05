package TestNgProject1.AnithaMavenEclipseProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase7_Destinations {
WebDriver driver=null;
	
	@Test
	public void Hotels()
	{
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.linkText("Destinations")).click();
		driver.findElement(By.xpath("//img[@src='images/mast_destinations.gif']"));
		driver.findElement(By.linkText("Home")).click();
		driver.quit();
	}
	
}
