package TestNgProject1.AnithaMavenEclipseProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testcas3_Flight {

	WebDriver driver = null;
	@Parameters({""})
	@Test
	
	public void flight()
	{
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		driver.findElement(By.linkText("Flights")).click();
		driver.get("http://demo.guru99.com/test/newtours/reservation.php");
		driver.findElement(By.xpath("//img[@src='images/mast_flightfinder.gif']"));
	
}
}

