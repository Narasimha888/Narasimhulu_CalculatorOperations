package Presentation_code;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Calculator_test {
Calculator_operation obj=new Calculator_operation();
	@Test
	void test() {
		assertEquals(5.0,obj.arithematic(2.0, 3.0,'+'));
		assertEquals(3.0,obj.arithematic(9.0, 6.0,'-'));
		assertEquals(6.0,obj.arithematic(2.0, 3.0,'*'));
		assertEquals(2.0,obj.arithematic(6.0, 3.0,'/'));
	}
	

}
