package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Torridtest {
	
		ChromeDriver driver;
		@BeforeTest
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get("https://www.torrid.com/account");
		}
		@Test
		public void test()
		{
			driver.findElement(By.xpath("//*[@class='login-box login-account']/div/form/fieldset/div[1]/input")).sendKeys("sradhasudarsan13@gmail.com");
			driver.findElement(By.xpath("//*[@class='login-box login-account']/div/form/fieldset/div[2]/input")).sendKeys("Lallu@1234");
		driver.findElement(By.xpath("//*[@class='login-box login-account']/div/form/fieldset/div[4]/button")).click();
		String link=driver.getCurrentUrl();
		System.out.println(link);
	}

}	


