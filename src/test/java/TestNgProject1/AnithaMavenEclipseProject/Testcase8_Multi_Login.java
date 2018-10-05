package TestNgProject1.AnithaMavenEclipseProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testcase8_Multi_Login {
	
	WebDriver driver=null;
	
	@DataProvider
	
	public Object[][] getLogin()
	{
		Object[][] login = new Object[2][2];
		
		login[0][0]="anitha";
		login[0][1]="Sunanda";
		
		login[1][0]="anireddy";
		login[1][1]="Siva";
		
		return login;
	}
	
	
	@Test(dataProvider="getLogin")
	public void multiLogin(String login,String pwd1)
	{
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.name("userName")).sendKeys(login);
		driver.findElement(By.name("password")).sendKeys(pwd1);
		driver.findElement(By.name("submit")).click();
	}
}
