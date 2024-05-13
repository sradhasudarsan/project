package SELENIUM;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathamazon {
	ChromeDriver driver;
	 String baseurl="https://www.amazon.ae/?&tag=googlepcabken-21&ref=pd_sl_7prtp2xrfz_e&adgrpid=151932057817&hvpone=&hvptwo=&hvadid=675493480723&hvpos=&hvnetw=g&hvrand=2977681325957190271&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1000010&hvtargid=kwd-10573980&hydadcr=20918_2270148&gad_source=1";
	 
	 @Before
	  public void setUp()
	  {
		  driver=new ChromeDriver();
		  driver.get(baseurl);
	  }
	  @org.junit.Test
	  public void setvalues()
	  {
		//  driver.findElement(By.xpath("//input[@name='field-keyword']")).sendKeys("mobiles",Keys.ENTER);
		 driver.findElement(By.xpath("//*[@id='nav-cart']")).click();
		  driver.findElement(By.xpath("//*[@data-nav-role='signin']")).click();
		  driver.findElement(By.xpath("//*[@id='nav-hamburger-menu']")).click();
		 

  WebElement search=driver.findElement(By.id("twotabsearchtextbox")) ;
		search.sendKeys("IPHONE");
		 search.submit();
	  }
}
