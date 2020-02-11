import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class programTests {

	@Test
	void testUno() {
		assertEquals(FizzBuzz.fizzBuzz(1),"1");
	}
	@Test
	void testDos() {
		assertEquals(FizzBuzz.fizzBuzz(2),"2");
	}
	@Test
	void testTres() {
		assertEquals(FizzBuzz.fizzBuzz(3),"Fizz");
	}
	@Test
	void testCinco() {
		assertEquals(FizzBuzz.fizzBuzz(5),"Buzz");
	}
	@Test
	void testQuince() {
		assertEquals(FizzBuzz.fizzBuzz(15),"FizzBuzz");
	}
}
