package junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class) // обязательная аннотация для след строки
@Suite.SuiteClasses({ FirstMathTest.class, SecondMathTest.class, ThirdMathTest.class, ParametrizeTest.class }) // здесь собираем наши тесты и можно запустить все указанные
public class SuitTestDemo {
}
