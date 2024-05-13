package SELENIUM;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Verify;

public class Brokenlink {
ChromeDriver driver;
String baseurl="https://www.facebook.com";

@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
	
}
@Test
public void test() throws IOException
{
	List<WebElement> li=driver.findElements(By.tagName("a"));
	 System.out.println("total no of link"+li.size());
	 for(WebElement ele:li)
	 {
		 String link = ele.getAttribute("href");
		 verify(link);
		 
	 }
}
private void verify(String link) throws IOException {
	try {
		URL ob=new URL(link);
		HttpURLConnection con=(HttpURLConnection)ob.openConnection();
		if(con.getResponseCode()==200)
		{
			System.out.println("successfull response code is 200----"+ link);
		}
		else if(con.getResponseCode()==404)
		{
			System.out.println("broken link response code is 404---"+ link);
		}
	}catch (Exception e) {
		System.out.println(e.getMessage());
		System.out.println("invalid");
		}
	}
	


}
