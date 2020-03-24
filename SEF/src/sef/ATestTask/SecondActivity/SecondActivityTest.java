package SEF.src.sef.ATestTask.SecondActivity;
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

	//Sum
	@Test
	public void testGetSum() {

		int a = 5;
		int b = 10;
		assertEquals(15, (theCalculator.getSum(a,b)));
		assertEquals(15, (theCalculator.getSum(b,a)));

		a = -5;
		b = 10;
		assertEquals(5, (theCalculator.getSum(a,b)));
		assertEquals(5, (theCalculator.getSum(b,a)));

		a = -5;
		b = -10;
		assertEquals(-15, (theCalculator.getSum(a,b)));
		assertEquals(-15, (theCalculator.getSum(b,a)));
	}


	//Difference
	@Test
	public void testGetDifference() {

		int a = 3;
		int b = 2;
		assertEquals(1, (theCalculator.getDifference(a,b)));
		assertEquals(-1, (theCalculator.getDifference(b,a)));

		a = 5;
		b = -4;
		assertEquals(9, (theCalculator.getDifference(a,b)));
		assertEquals(-9, (theCalculator.getDifference(b,a)));

		a = -10;
		b = -5;
		assertEquals(-5, (theCalculator.getDifference(a,b)));
		assertEquals(5, (theCalculator.getDifference(b,a)));
	}


}

