package junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimpleMathTest extends Assert{
	
	Calculator calculator;
	
	@Before // чтобы перед каждым методом выводил
	public void beforeTest() {
		System.out.println("Before test");
		calculator = new Calculator();
	}
	
	@After // чтобы после каждого методом выводил
	public void afterTest() {
		System.out.println("After test");
		calculator = null;
	}
	
	
	@Test // помечаем единицу тестирования
	public void testMathPlus() {
		System.out.println("@testMathPlus");
		assertEquals(4, Calculator.getSum(2,2)); // ожидаем 4 при вызове getSum, если поменять 2 на 1, то будет ошибка теста
	}
//	@Test
//	public void assertNul(Object obj) { херня какая то написана мной. нужно протестить методы акцесс
//		System.out.println("@testAssertNull");
//		assertNotNull(null);
//	}
}
