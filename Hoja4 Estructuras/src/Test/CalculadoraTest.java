import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void test() {
		double a = 1.0; 
		double b = 1.0; 
		Calculadora test = new Calculadora();
		double res = test.sumar(a,b);
		assertEquals(res,2.0);
	}

}
