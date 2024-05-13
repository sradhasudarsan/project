package SELENIUM;

import java.net.HttpURLConnection;
import java.net.URL;
//import java.net MalformedURLException;

import org.junit.Test;

public class Responsecode {
	String link="https://www.google.com";
	
	@Test
	public void test() throws Exception
	{
		URL ob=new URL(link);
		HttpURLConnection con=(HttpURLConnection)ob.openConnection();
		int responsecode=con.getResponseCode();
		System.out.println(responsecode);
	}

}
