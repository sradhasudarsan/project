package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload 
{
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");

	}
	@Test
	public void test()
	{
		 WebElement upload=driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
		 upload.sendKeys("C:\\Users\\HP\\Desktop");
		 WebElement check=driver.findElement(By.xpath("//*[@id=\"terms\"]"));
		 check.click();
		 WebElement submit=driver.findElement(By.xpath("//*[@id=\"submitbutton\"]"));
		 submit.click();
		 
	}
				 
	}


