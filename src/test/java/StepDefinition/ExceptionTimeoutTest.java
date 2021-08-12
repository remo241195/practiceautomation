package StepDefinition;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest {

	//without using try-catch block i used to handle this expected exception
	@Test(expectedExceptions=NumberFormatException.class)
	public void test1()
	{
		String x = "100A";
		Integer.parseInt(x);
	}
}
