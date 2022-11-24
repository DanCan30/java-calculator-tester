import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.calculator.test.italy.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	private static Calculator c;
	private final static String WRONG_EXPECTED_VALUE = "The obtained value is not the expected one.";
	@BeforeAll
	private static void setup() {
		c = new Calculator();
	}
	
	@Test
	@DisplayName("Addiction test")
	void addictionTest() {

		float value1 = c.add(20, 3);
		assertEquals(23, value1, WRONG_EXPECTED_VALUE);

		float value2 = c.add(6.3f, 4);
		assertEquals(10.3f, value2, WRONG_EXPECTED_VALUE);
		
		float value3 = c.add(9.5f, 5.6f);
		assertEquals(15.1f, value3, WRONG_EXPECTED_VALUE);
	}
	
	@Test
	@DisplayName("Subtraction test")
	void subtractionTest() {

		float value1 = c.subtract(9, 3);
		assertEquals(6, value1, WRONG_EXPECTED_VALUE);
		
		float value2 = c.subtract(4.7f, 9.2f);
		assertEquals(-4.5f, value2, WRONG_EXPECTED_VALUE);
	}
	
	@Test
	@DisplayName("Division test")
	void divisionTest() {
		
		float value1 = c.divide(10f, 2f);
		assertEquals(5f, value1, WRONG_EXPECTED_VALUE);
		
		float value2 = c.divide(5f, 10f);
		assertEquals(.5f, value2, WRONG_EXPECTED_VALUE);
		
//		Division for 0 test
		assertThrows(IllegalArgumentException.class, ()-> c.divide(4f, 0) );
	}
	
	@Test
	@DisplayName("Multiplication test")
	void multiplicationTest() {
		
		float value1 = c.multiply(6, 10);
		assertEquals(60, value1, WRONG_EXPECTED_VALUE);
		
		float value2 = c.multiply(4.5f, 20f);
		assertEquals(90, value2, WRONG_EXPECTED_VALUE);
	}
}
