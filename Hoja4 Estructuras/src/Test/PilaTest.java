import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PilaTest<E> {

	@Test
	void test() {
		Pila<E> test = new Pila();
		boolean res = test.empty();
		assertEquals(res,true);
		
	}

}
