package junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SecondClassTest extends Assert{
	
	Calculator calculator;
	
	@Before // чтобы перед каждым методом выводил
	public void beforeTest() {
		System.out.println("Before");
		calculator = new Calculator();
	}
	
	@After // чтобы после каждого методом выводил
	public void afterTest() {
		System.out.println("After");
		calculator = null;
	}
	
	
	@Test // помечаем единицу тестирования
	public void testMathPlus() {
		System.out.println("@testSecondPlus");
		assertEquals(4, Calculator.getSum(2,2)); // ожидаем 4 при вызове getSum, если поменять 2 на 1, то будет ошибка теста
	}
}
