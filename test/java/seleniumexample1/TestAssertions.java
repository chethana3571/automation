package seleniumexample1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestAssertions {
//assertions-hard assertions
	@Test
	public void testA() {
		/*System.out.println("A");
		Assert.assertTrue(2==2);//PASS CONTINUES THE EXECUTION
		//Assert.assertTrue(2>=3);//false stops the execution only true condtions
		Assert.assertFalse(2>=3);// pass exectution continues check the false contion
		System.out.println("B");
		Assert.assertEquals("chethana", "chethana");
		System.out.println("C");
		System.out.println("D");
	}*/	
	
		
		//soft ASSertion
		
		SoftAssert sa=new SoftAssert();
		System.out.println("A");
		sa.assertTrue(2==2);//PASS CONTINUES THE EXECUTION
		//Assert.assertTrue(2>=3);//false stops the execution only true condtions
		sa.assertFalse(2>=3);// pass exectution continues check the false contion
		System.out.println("B");
		sa.assertEquals("chethana", "chethana");
		System.out.println("C");
		System.out.println("D");
	}
}
		
		
		
		
		
		
		