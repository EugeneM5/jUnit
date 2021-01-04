package junit;

import org.hamcrest.Description;
import org.junit.runner.notification.RunListener;

public class CalculatorTestListener extends RunListener {
	
	public void testFinished(Description description) throws Exception {
		System.out.println("Execution Finished : " + description.getClass());
    }
	

}

