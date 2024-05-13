package SELENIUM;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	ChromeDriver driver;
	String baseurl="https://www.google.com";
	@Before
	public void setUp()
	{
		 driver=new ChromeDriver();
		  driver.get(baseurl);
	  }
	@Test
	public void setvalues()
	{
		//driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
		  driver.findElement(By.name("q")).sendKeys("BOOK",Keys.ENTER);
		  //driver.findElement(By.name("btnk")).click();
		
		//  another method
	WebElement search=driver.findElement(By.name("q")) ;
	search.sendKeys("BOOKS");
		 search.submit();
	
	}

}
