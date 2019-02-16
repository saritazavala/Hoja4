
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
}
