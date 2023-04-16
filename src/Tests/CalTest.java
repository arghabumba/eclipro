import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalTest {

	@Test
	public void caltest() {
		assertEquals(3, Calculator.add(1, 2));
		assertEquals(-3, Calculator.add(-1, -2));
		assertEquals(9, Calculator.add(9, 0));
	}
    
	public void calcTestAddFail() {
		assertEquals(0, Calculator.add(1, 2));
	}
	
	public void calcTestSubPass() {
		assertEquals(1, Calculator.add(1, 2));
		assertEquals(-1, Calculator.add(-1, -2));
		assertEquals(1, Calculator.add(2, 1));
	}
	public void calcSubFail() {
		assertEquals(4, Calculator.add(2, 1));
		
	}
	public void calcTestMulPass() {
		assertEquals(2, Calculator.add(1, 2));
		assertEquals(2, Calculator.add(-1, -2));
		assertEquals(2, Calculator.add(2, 1));
	}
	public void calcMulFail() {
		assertEquals(4, Calculator.add(2, 1));
		
	}
	public void calcTestDivPass() {
		assertEquals(2, Calculator.add(2, 1));
		assertEquals(-3, Calculator.add(-6, -2));
		assertEquals(2, Calculator.add(2, 1));
	}
	public void calcDivFail() {
		assertEquals(4, Calculator.add(2, 1));
		
	}
}
