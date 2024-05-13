package testpackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonnewquestion {
WebDriver d;
	
	@BeforeTest
	public void beforetest()
	{
		d= new ChromeDriver();
		
	}
	
	@Test
	public void SearchItem() {

		WebElement search=d.findElement(By.name("iphone")) ;
		search.sendKeys("mobile phones");
			 search.submit();
	}
	
	@Test
	public void test()
	{
		d.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();
	}
	@Test
	public void test2()
	{
		d.get("https://www.amazon.ae/?&tag=googlepcabken-21&ref=pd_sl_7prtp2xrfz_e&adgrpid=151932057817&hvpone=&hvptwo=&hvadid=675493480723&hvpos=&hvnetw=g&hvrand=13132521728055970678&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1000010&hvtargid=kwd-10573980&hydadcr=20918_2270148&gad_source=1");
		String parentWindow = d.getWindowHandle(); //curent window
		System.out.println("parent window title "+d.getTitle());
		d.findElement(By.xpath("/html/body")).click();
		Set<String> allWindowHandles =d.getWindowHandles();
		for(String handle:allWindowHandles)
		{
			if(!handle.equalsIgnoreCase(parentWindow))
			{
				d.switchTo().window(handle);
			d.findElement(By.xpath("/html/body")).sendKeys("anbc@gmail.com");
			d.close();
		}
		d.switchTo().window(parentWindow);
		}
	}



}