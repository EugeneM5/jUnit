package junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ThirdMathTest {

	Calculator calculator;

	@Before // чтобы перед каждым методом выводил
	public void beforeTest() {
		System.out.println("Before devide test");
		calculator = new Calculator();
	}

	@After // чтобы после каждого методом выводил
	public void afterTest() {
		System.out.println("After devide test");
		calculator = null;
	}

	@Test // помечаем единицу тестирования
	public void testMathDevide() {
		System.out.println("@testThirdDevide");
		assertEquals(2, Calculator.getDevide(4, 2)); 
	}

}
