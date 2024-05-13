package SELENIUM;

import org.openqa.selenium.chrome.ChromeDriver;

public class Newproject {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String actualtitle=driver.getTitle();
		String exp="Google";
		System.out.println("page title is:"+ driver.getTitle());
		driver.close();

	}

}
