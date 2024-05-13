package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Fbtestng {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Parameters({"UN","pswd"})
	@Test
	public void test(String Un,String pswd)
	{
		driver.findElement(By.id("email")).sendKeys(Un);
		driver.findElement(By.id("pass")).sendKeys(pswd);
		driver.findElement(By.name("login")).click();
	}
	
	
	

}
