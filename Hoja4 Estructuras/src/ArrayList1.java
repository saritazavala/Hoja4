import java.util.ArrayList;
import java.util.*;



public class ArrayList1<E> extends Pila<E> {
    ArrayList<E> numeros;

    public ArrayList1(){
        numeros = new ArrayList<E>();
    }

    public E pop() {
        return numeros.remove(size() - 1);
    }

    public void push(E item) {
        numeros.add(item);
    }

    public int size() {
        return numeros.size();
    }



}
