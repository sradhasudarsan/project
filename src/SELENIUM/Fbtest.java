package SELENIUM;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbtest {
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
	  driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("abc123");
	  driver.findElement(By.name("login")).click();
	  
	 
  }
  
}
