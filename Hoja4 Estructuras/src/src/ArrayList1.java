
/*
Sara Zavala 18893
Andres Berthet 171504
Estuctura de Datos 2019
Clase ArrayLista con metodos de pila
*/
import java.util.ArrayList;
import java.util.*;



public class ArrayList1<E> extends Pila<E> {
    ArrayList<E> numeros;

    public ArrayList1(){
        numeros = new ArrayList<E>();
    }// se crea el objeto

    public E pop() {
        return numeros.remove(size() - 1);
    }//para eliminar

    public void push(E item) {
        numeros.add(item);
    }// para añadir

    public int size() {
        return numeros.size();
    } //verificar tamaño
    public boolean isEmpty(){
        if(this.numeros.isEmpty()){ //Se instancea
            return true;
            //Si el vector esta vacio se devolverá true
        }
        else{
            return false;
            //Si el vector no esta vacio se devolverá false
        }
    }



}
