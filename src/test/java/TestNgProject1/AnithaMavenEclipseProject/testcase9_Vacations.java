package TestNgProject1.AnithaMavenEclipseProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase9_Vacations {
	
	WebDriver driver = null;
	
	@Test
	public void Vacations()
	{
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.linkText("Vacations")).click();
		driver.findElement(By.xpath("//img[@src='images/hdr_vacation.gif']"));
		
	}
}
