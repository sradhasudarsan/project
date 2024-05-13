package testpackage;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fbvalidation {

		  ChromeDriver driver;
		  String baseurl=("https://www.facebook.com");
		  @BeforeTest
		  public void setUp()
		  {
			  driver=new ChromeDriver();
			  driver.get(baseurl);
		  }
		  @Test
		  public void setvalues()
		  {
			  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
			  driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abc123");
			  driver.findElement(By.xpath("//button[@name='login']")).click();
			  String link=driver.getCurrentUrl();
			  System.out.println(link);
			  
			 
		  }

}
