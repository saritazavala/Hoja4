
/*
Sara Zavala 18893
Andres Berthet 171504
Estuctura de Datos 2019
Clase Vector1. Esta clase ya estaba hecha en HDT2

*/
import java.util.Vector;
public class Vector1<E> extends Pila<E> {
    Vector<E> numeros;

    public  Vector1(){
        numeros = new Vector<E>();
    }

    public E pop() {
        return numeros.remove(size()-1);
    }

    public void push(E item) {
        numeros.add(item);
    }


    public int size() {
        return numeros.size();
    }

    public boolean isEmpty() {
        if (this.numeros.isEmpty()) { //Se instancea
            return true;
            //Si el vector esta vacio se devolverá true
        } else {
            return false;
            //Si el vector no esta vacio se devolverá false
        }
    }
}
