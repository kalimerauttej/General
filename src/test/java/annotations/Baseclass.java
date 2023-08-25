package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	@BeforeSuite
	public void SuiteConfig() {
		System.out.println("BeforeSuite");
	}
	@BeforeTest
	public void testConfig() {
		System.out.println("beforetest");
	}
	@BeforeClass
	public void classConfig() {
		System.out.println("Beforeclass");
	}
	@AfterTest
	public void testTearDown() {
		System.out.println("AfterTest");
	}
	@AfterSuite
	public void TestSuite1() {
		System.out.println("Aftersuite");
	}
	@AfterMethod
	public void AfterMethod1() {
		System.out.println("Aftermethod");
	}
	@AfterClass
	public void AfterMethodTest() {
		System.out.println("AfterClass");
	}
	}

