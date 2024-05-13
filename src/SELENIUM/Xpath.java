package SELENIUM;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	 ChromeDriver driver;
	 String baseurl="https://www.facebook.com";
	 
	 @Before
	  public void setUp()
	  {
		  driver=new ChromeDriver();
		  driver.get(baseurl);
	  }
	  @org.junit.Test
	  public void setvalues()
	  {
		  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd@gmail.com");
		  driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abc123");
		  driver.findElement(By.xpath("//button[@name='login']")).click();
		  

}
}