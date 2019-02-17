import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
 
    @Test
    void size() {
		int contar = 0;
		Nodo<E> temp = new Nodo<E>(value);
		ListaAbstracta lista = new ListaAbstracta();
        lista.addFirst("26");
        lista.addFirst("1");
        int respuesta = list.size();
        int esperado = 2;
        assertEquals(esperado, respuesta);
    }
