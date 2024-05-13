package testpackage;

import java.io.File;
import java.io.IOException;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.base.VerifyException;

public class Janasyatest {
	
		ChromeDriver driver;
		@BeforeTest
		public void setUp()
		{
			driver=new ChromeDriver();
			driver.get("https://www.janasya.us/collections/kurta-sets");
		}
		@Test
		public void test()
		{
			Boolean logo = driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--22163962724639__0551e2c3-4916-467e-a6e9-b0d8594a3ff3\"]/header/div/div/div[2]/div/div/div/a/img")).isDisplayed();
			if(logo)
			{
				System.out.println("logo is present");
			}
			else
			{
				System.out.println("fail");
			}
		}
		
			public void test1()
			{
			 driver.findElement(By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul/li[1]/a/span")).click();
			}
	
	
	public void test2() 
	{
		List<WebElement> li =driver.findElements(By.tagName("a"));
		 System.out.println("total no of link"+li.size());
		for(WebElement ele:li)
		 {
			String link=ele.getAttribute("href");
			String linktext=ele.getText();
			System.out.println(link+"----"+linktext);
			 
		 }
	}
	

	
	@Test
	
	public void test3() throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:\\Users\\HP\\Desktop\\shradha\\facebook.png"));
		WebElement button = driver.findElement(By.name("/html/body"));
		File screenshot=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshot,new File("./SCREENSHOTPROJECT/newscreenshot.png"));
	}
	@Test
	public void test4()
	{
	driver.findElement(By.xpath("//*[@id=\"47336694317343\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"halo-cart-sidebar\"]/div[2]/cart-coupon-discount/div/div/div/a")).click();
	driver.findElement(By.xpath("//*[@id=\"halo-cart-sidebar\"]/div[2]/cart-coupon-discount/div/div[3]/div/div/a ")).click();
	
	}
	
}



