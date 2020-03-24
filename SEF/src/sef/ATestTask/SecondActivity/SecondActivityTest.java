package sef.ATestTask.SecondActivity;
// Complete Code
import junit.framework.TestCase;
import org.junit.Test;

public class SecondActivityTest extends TestCase {

	private SecondActivity theCalculator;

	protected void setUp() throws Exception {
		super.setUp();
		//	Initialize variables to be used here
		theCalculator = new SecondActivity();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testGetSumPositiveValue() {
	assertEquals(15.0, (theCalculator.sum(5, 10)));
	assertEquals(15.0, (theCalculator.sum(10, 5)));
	}

	public void testGetSumNegativeValue() {
	assertEquals(5.0, (theCalculator.sum(-5, 10)));
	assertEquals(-5.0, (theCalculator.sum(5, -10)));
	}

	public void testGetDividePositiveValue(){
	assertEquals(5.0, (theCalculator.divide(15, 3)));
	assertEquals(6.0, (theCalculator.divide(-24, -4)));
	}
	public void testGetDivideNegativeValue(){
		assertEquals(-3.0, theCalculator.divide(18, -6));
	}
	public void testGetSubstractionPositiveValue(){
		assertEquals(10.0, theCalculator.substraction(23, 13));
	}
	public void testGetSubstractionNegativeVaue(){
		assertEquals(-1.0, theCalculator.substraction(10, 11));
	}
	public void testGetMultiplyPositiveValue(){
		assertEquals( 10.0, theCalculator.multiply(2,5));
	}
	public void testGetMultiplyNegativeValue(){
		assertEquals(-21.0, theCalculator.multiply(-3, 7));
	}
}

