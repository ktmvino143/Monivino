package testngtesting;
	
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
	
	public class testngpractice {
	
	@Test
	public void testcase1(){
	System.out.println("test case 1 passed");
	}

	@Test
	public void testcase2(){
	System.out.println("test case 2 passed");
	}

	@BeforeMethod
	public void beforemethod(){
	System.out.println("Before method passed");
	}

	@AfterMethod
	public void afterMethod(){
	System.out.println("After method passed");
	}

	@BeforeClass
	public void beforeclass(){
	System.out.println("Before class passed");
	}

	@AfterClass
	public void afterclass(){
	System.out.println("After class passed");
	}

	@BeforeTest
	public void beforetest(){
	System.out.println("Before test passed");
	}

	@AfterTest
	public void aftertest(){
	System.out.println("After test passed");
	}

	@BeforeSuite
	public void beforesuite(){
	System.out.println("Before suite passed");
	}

	@AfterSuite
	public void aftersuite(){
	System.out.println("After suite passed");
	}
	}

