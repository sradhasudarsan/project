package SELENIUM;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpage {
	ChromeDriver driver;
	 String baseurl="file:///C:/Users/HP/Desktop/shradha/webpage.html";
	 @Before
	 public void setUp()
	  {
		  driver=new ChromeDriver();
		  driver.get(baseurl);
	  }
	 @Test
	 public void setvalues()
	  {
		 
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();// alert handling
		System.out.println(a.getText());
		a.accept();
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
		
	     driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("cd");
          driver.findElement(By.xpath("/html/body/input[4]")).click();
}
}
