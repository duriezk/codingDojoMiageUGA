package fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testFizzBuzz {

	@Test
	void test3equalsFizz() {
		FizzBuzz test = new FizzBuzz(3);
		assertEquals("FizzFizz", test.toString());
	}
	
	@Test
	void test5equalsBuzz() {
		FizzBuzz test = new FizzBuzz(5);
		assertEquals("BuzzBuzz", test.toString());
	}
	
	@Test
	void test6equalsFizz() {
		FizzBuzz test = new FizzBuzz(6);
		assertEquals("Fizz", test.toString());	
	}
	
	@Test
	void test15equalsFizzBuzz() {
		FizzBuzz test = new FizzBuzz(15);
		assertEquals("FizzBuzzBuzz", test.toString());
	}

	@Test
	void test10equalsBuzz() {
		FizzBuzz test = new FizzBuzz(10);
		assertEquals("Buzz", test.toString());
	}
	
	@Test
	void test2equals2() {
		FizzBuzz test = new FizzBuzz(2);
		assertEquals("2", test.toString());
	}
	
	@Test
	void test22equals22() {
		FizzBuzz test = new FizzBuzz(22);
		assertEquals("22", test.toString());
	}
	
	@Test
	void test23equalsFizz() {
		FizzBuzz test = new FizzBuzz(23);
		assertEquals("Fizz", test.toString());
	}
	
	@Test
	void test53equalsFizzBuzz() {
		FizzBuzz test = new FizzBuzz(53);
		assertEquals("BuzzFizz", test.toString());
	}
	
	@Test
	void test52equalsBuzz() {
		FizzBuzz test = new FizzBuzz(52);
		assertEquals("Buzz", test.toString());
	}
	
	@Test
	void test51equalsBuzz() {
		FizzBuzz test = new FizzBuzz(51);
		assertEquals("FizzBuzz", test.toString());
	}
	
	@Test
	void test35equalsBuzz() {
		FizzBuzz test = new FizzBuzz(35);
		assertEquals("BuzzFizzBuzz", test.toString());
	}
	
	@Test
	void test30equalsBuzz() {
		FizzBuzz test = new FizzBuzz(30);
		assertEquals("FizzBuzzFizz", test.toString());
	}
}
