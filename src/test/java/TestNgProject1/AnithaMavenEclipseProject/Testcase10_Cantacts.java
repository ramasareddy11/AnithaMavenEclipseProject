package TestNgProject1.AnithaMavenEclipseProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase10_Cantacts {

	WebDriver driver=null;
	@Test
	public void contacts() {
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.linkText("CONTACT")).click();
		driver.findElement(By.xpath("//img[@src='images/mast_CONTACT.gif']"));
		//driver.findElement(By.xpath("//img[@src='images/home.gif']")).click();
		driver.quit();
	}

	
}
