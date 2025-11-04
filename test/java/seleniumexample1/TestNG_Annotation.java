package seleniumexample1;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Annotation {
	 @BeforeMethod
	    public void setup() {
	        System.out.println("BeforeMethod: Setting up the test...");
	    }

	    @Test
	    public void testCase1() {
	        System.out.println("Test Case 1 is running");
	    }

	    @Test
	    public void testCase2() {
	        System.out.println("Test Case 2 is running");
	    }

	    @AfterMethod
	    public void teardown() {
	        System.out.println("AfterMethod: Cleaning up after test...");
	    }
	}



