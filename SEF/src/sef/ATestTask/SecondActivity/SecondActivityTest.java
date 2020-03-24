package sef.ATestTask.SecondActivity;
// Complete Code
import junit.framework.TestCase;
import org.junit.Test;

public class SecondActivityTest extends TestCase {

	//TODO try to achieve 100% of test coverage

	private SecondActivity theCalculator;

	protected void setUp() throws Exception {
		super.setUp();
		//	Initialize variables to be used here
		theCalculator = new SecondActivity();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	//Example ->
	@Test
	public void testGetSumPositiveValue() {
		assertEquals(15.0, (theCalculator.getSum(5, 10)));
		assertEquals(15.0, (theCalculator.getSum(10, 5)));
	}

	//Example ->
	@Test
	public void testGetSumNegativeValue() {
		assertEquals(5.0, (theCalculator.getSum(-5, 10)));
		assertEquals(-5.0, (theCalculator.getSum(5, -10)));
	}

	@Test
	public void testGetSubPositiveValue() {
		assertEquals(5.0, (theCalculator.getSub(10, 5)));
		assertEquals(5.0, (theCalculator.getSub(15, 10)));
	}

	@Test
	public void testGetSubNegativeValue() {
		assertEquals(-5.0, (theCalculator.getSub(5, 10)));
		assertEquals(-15.0, (theCalculator.getSub(-5, 10)));
	}

	@Test
	public void testGetMultPositiveValue() {
		assertEquals(50.0, (theCalculator.getMult(5, 10)));
		assertEquals(50.0, (theCalculator.getMult(-5, -10)));
	}

	@Test
	public void testGetMultNegativeValue() {
		assertEquals(-50.0, (theCalculator.getMult(-5, 10)));
		assertEquals(-50.0, (theCalculator.getMult(5, -10)));
	}

	@Test
	public void testGetDivPositiveValue() {
		assertEquals(2.0, (theCalculator.getDiv(10, 5)));
		assertEquals(0.5, (theCalculator.getDiv(5, 10)));
	}

	@Test
	public void testGetDivNegativeValue() {
		assertEquals(-2.0, (theCalculator.getDiv(10, -5)));
		assertEquals(-0.5, (theCalculator.getDiv(5, -10)));
	}
}

