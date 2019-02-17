/*
Sara Zavala 18893
Andres Berthet 171504
Estuctura de Datos 2019
Clase de tipo abstracto que implementa la interface lista.
Al final casi solo se usa el método de verificar si la
lista se encuentra vaciía o no

*/


public abstract class ListaAbstracta<E> implements iLista<E> {


    public E addFirst(){
        return null;
    }

    public E removeFirst(){
        return null;

    }

    public void addFirst(E e){

    }
    public int size(){
        return 0;
    }

    public boolean isEmpty() {
        return size() == 0;
    }
}
