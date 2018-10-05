package TestNgProject1.AnithaMavenEclipseProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testcase2_Register {
	
	WebDriver driver = null;
	@Parameters({"firstName","lastName","phone","email","address","city","state","postalcode"})
	@Test
	
	public void registerPage(String f,String l,String p,String e,String a,String c,String s,String pc)
	{
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.findElement(By.xpath("//img[@src='images/mast_register.gif']"));
		driver.findElement(By.name("firstName")).sendKeys(f);
		driver.findElement(By.name("lastName")).sendKeys(l);
		driver.findElement(By.name("phone")).sendKeys(p);
		driver.findElement(By.name("userName")).sendKeys(e);
		driver.findElement(By.name("address1")).sendKeys(a);
		driver.findElement(By.name("city")).sendKeys(c);
		driver.findElement(By.name("state")).sendKeys(s);		
		driver.findElement(By.name("postalCode")).sendKeys(pc);		
		Select select = new Select(driver.findElement(By.name("country")));
		select.selectByVisibleText("INDIA");
		
		driver.findElement(By.id("email")).sendKeys("anitha");
		driver.findElement(By.name("password")).sendKeys("Sunanda");
		driver.findElement(By.name("confirmPassword")).sendKeys("Sunanda");
		driver.findElement(By.name("submit")).click();
		
		driver.get("http://demo.guru99.com/test/newtours/register_sucess.php");
		driver.findElement(By.linkText("SIGN-OFF")).click();
		
		driver.quit();
		
	}
}
