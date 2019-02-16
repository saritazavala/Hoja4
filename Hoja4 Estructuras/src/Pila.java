import java.util.*;

public class Pila<E>implements iPila<E> {

    Vector<E> vector = new Vector<E>(); //Se crea un vector con elementos E

    public void push(E item){
        this.vector.add(item); //Se instacea y se agrega al vector
    }

    public E pop(){
        int algo = vector.size(); // Se crea variable int para guardar el tamaño del vector creado
        return this.vector.remove(algo-1); // Se istacea y se le quita 1 unidad para que las posiciones empiecen desde 1 y no en 0
        //Tambien se elimina un elemento del vector
    }

    public E peek(){
        int algo = vector.size();// Se crea variable int para guardar el tamaño del vector creado
        return this.vector.get(algo-1);// Se istacea y se le quita 1 unidad para que las posiciones empiecen desde 1 y no en 0
        //Toma el ultimo valor del Vector
    }

    public boolean empty(){
        if(this.vector.isEmpty()){ //Se instancea
            return true;
            //Si el vector esta vacio se devolverá true
        }
        else{
            return false;
            //Si el vector no esta vacio se devolverá false
        }
    }

    public int size(){
        return this.vector.size(); //Instaciar
    }
}
