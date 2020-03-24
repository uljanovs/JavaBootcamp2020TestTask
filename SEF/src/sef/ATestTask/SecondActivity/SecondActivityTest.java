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
		assertEquals(15, (int) theCalculator.sum(5, 10));
		assertEquals(15, (int) theCalculator.sum(10, 5));
	}

	//Example ->
	@Test
	public void testGetSumNegativeValue() {
		assertEquals(5, (int) theCalculator.sum(-5, 10));
		assertEquals(-5, (int) theCalculator.sum(5, -10));
	}

	@Test
	public void testGDiv() {
		assertEquals(0, (int) theCalculator.divide(0, 10));
	}

	@Test
	public void testGDivToZero() {
		assertEquals(0, (int) theCalculator.divide(0, 0));
	}

}

