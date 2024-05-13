package testpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assert {
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}	
		@Test
		public void test()
		{
			String actualtitle = driver.getTitle();
			String exp="google";
			Assert.assertEquals(actualtitle,exp);
		}
		private static void assertEquals(String actualtitle, String exp) {
			// TODO Auto-generated method stub
			
		}
		
		}
	


