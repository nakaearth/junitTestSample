package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
//
//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
//	
	@Test
	public void addMethodTest(){
		Calculator cal = new Calculator();
		int expected = 10;
		int result = cal.add(3, 7);
		assertEquals(expected, result);
		assertThat(result,is(expected));
	}
	
	@Test
	public void substractionTest(){
		Calculator cal = new Calculator();
		int expected = 5;
		int result = cal.substraction(10, 5);
		assertThat(result, is(expected));
	}
	@Test
	public void substractionTest2(){
		Calculator cal = new Calculator();
		int expected = -5;
		int result = cal.substraction(0, 5);
		assertThat(result, is(expected));
	}
	@Test
	public void substractionTest3(){
		Calculator cal = new Calculator();
		int expected = 0;
		int result = cal.substraction(0, 0);
		assertThat(result, is(expected));
	}
	
	@Test
	public void multiplyTest() {
		Calculator cal = new Calculator();
		long expected = 10;
		long result = cal.multiply(2, 5);
		assertThat(result, is(expected));
	}
	@Test
	public void devideTest() {
		Calculator cal = new Calculator();
		float expected = 2;
		float result = cal.devide(10 ,5);
		assertThat(result, is(expected));
	}
	
	@Test
	public void devideTest2() {
		Calculator cal = new Calculator();
		float expected = 2.5f;
		float result = cal.devide(10 ,4);
//		assertThat(result, is(expected));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void devideTest3(){
		Calculator cal = new Calculator();
		cal.devide(0 ,5);
	}
	
}
