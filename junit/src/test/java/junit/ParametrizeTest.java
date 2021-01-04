package junit;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith (Parameterized.class)
public class ParametrizeTest extends Assert {

	private int firstNumber;
	private int secondNumber;
	private int expectedResult;
	private Calculator calculator;

	public ParametrizeTest(int firstNumber, int secondNumber, int expectedResult) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.expectedResult = expectedResult;
	}

	@Before
	public void initialize() {
		calculator = new Calculator();
	}
	
	@Parameterized.Parameters()
	public static Collection<Integer[]> input() {
		return Arrays.asList(new Integer[][] { { 2, 2, 4 }, { 3, 1, 5 }, { 1, 2, 3 }, });
	}
	
	@Test
	public void Summ() {
		assertEquals(expectedResult, Calculator.getSum(firstNumber, secondNumber));

	}

	@Test
	public void Devide() {
		assertEquals(expectedResult, Calculator.getDevide(firstNumber, secondNumber));

	}

	@Test
	public void Multiply() {
		assertEquals(expectedResult, Calculator.getMultiple(firstNumber, secondNumber));

	}
}
