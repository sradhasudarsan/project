package SELENIUM;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkfacebook {
		ChromeDriver driver;
		 String baseurl="https://www.facebook.com";
		 @Before
		 public void setUp()
		  {
			  driver=new ChromeDriver();
			  driver.get(baseurl);
		  }
		 @Test
		 public void setvalues()
		  {
			 // to print how many links
			 List<WebElement> li=driver.findElements(By.tagName("a"));
			 System.out.println("total no of links="+li.size());
			 
			 //to print alla link anad name
			 for(WebElement ele:li) {
				 String link=ele.getAttribute("href");
				
			 String linktext=ele.getText();
				System.out.println(link+"--------"+linktext);
				 
				 
			 }
		  }
		 
	}

