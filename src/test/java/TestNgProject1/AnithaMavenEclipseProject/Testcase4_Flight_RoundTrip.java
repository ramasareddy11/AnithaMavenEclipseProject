package TestNgProject1.AnithaMavenEclipseProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testcase4_Flight_RoundTrip {
	WebDriver driver = null;
	

	@Test

	public void roundTrip()
	{
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/reservation.php");
		driver.manage().window().maximize();

		driver.findElement(By.name("tripType")).click();

		Select select= new Select (driver.findElement(By.name("passCount")));

		select.selectByValue("2");

		Select select1= new Select (driver.findElement(By.name("fromPort")));
		select1.selectByValue("Zurich");

		Select select2= new Select (driver.findElement(By.name("fromMonth")));
		select2.selectByVisibleText("March");

		Select select3= new Select (driver.findElement(By.name("fromDay")));
		select3.selectByVisibleText("11");

		Select select4= new Select (driver.findElement(By.name("toPort")));
		select4.selectByVisibleText("Paris");

		Select select5= new Select (driver.findElement(By.name("toMonth")));
		select5.selectByVisibleText("June");

		Select select6= new Select (driver.findElement(By.name("toDay")));
		select6.selectByVisibleText("22");
		
		driver.findElement(By.xpath("//input[@value='Business']")).click();

		Select select8= new Select (driver.findElement(By.name("airline")));
		select8.selectByVisibleText("Blue Skies Airlines");

		driver.findElement(By.name("findFlights")).click();

		driver.findElement(By.linkText("Home")).click();
		driver.quit();

	}
}
