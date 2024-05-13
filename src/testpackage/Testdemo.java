package testpackage;

	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Testdemo {
		@BeforeTest
		public void setUp()
		{
			System.out.println("beforetest method");
		}
		@BeforeMethod
		public void urloading()
		{
			System.out.println("before method");
		}

		@Test(priority=3)
		public void test1()
		{
			System.out.println("test1");
		}
		@Test(priority=2)
		public void test2()
		{
			System.out.print("test2");
		}
		@Test(priority=1)
		public void test3()
		{
			System.out.println("test3");
		}
		@AfterMethod
		public void method()
		{
			System.out.println("aftermethod");
		}
		
		@AfterTest
		public void teardown()
		{
			System.out.println("after test");
		}
		}



