package TestNgProject1.AnithaMavenEclipseProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase10_CarRentals {
	WebDriver driver=null;
	
	@Test
	public void CarRentals()
	{
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.linkText("Car Rentals")).click();
		driver.findElement(By.xpath("//img[@src='images/mast_Car Rentals.gif']"));
		driver.quit();
	}
	
	
}
