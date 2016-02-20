package testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import com.thoughtworks.selenium.*;

import java.util.regex.Pattern;

public class TC_002 {
	private Selenium selenium;

	@BeforeMethod(alwaysRun=true)
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*googlechrome", "http://www.thetestingworld.com/");
		selenium.start();
	}

	@Test(groups={"P3","Smoke"})
	public void testUntitled() throws Exception {
	    System.out.println("P3, smoke");
		selenium.open("/");
		selenium.click("link=Step By Step");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Jmeter88");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Training");
		selenium.waitForPageToLoad("30000");
	}

	
	
	@AfterMethod(alwaysRun=true)
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
