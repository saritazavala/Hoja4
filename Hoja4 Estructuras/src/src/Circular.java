/*
Sara Zavala 18893
Andres Berthet 171504
Estuctura de Datos 2019
Clase Circular. Este codigo fue tomada del libro
JavaStructure brindado en clase

*/
public class Circular<E> extends ListaAbstracta<E> {
    protected Nodo<E> cola;
    protected int contar;

    public Circular()
    // pre: constructs a new circular list
    {
        cola = null;
        contar = 0;
    }

    public void addFirst(E value)
    // pre: value non-null
    // post: adds element to head of list
    {
        Nodo<E> temp = new Nodo<E>(value);
        if (cola == null) { // first value added
            cola = temp;
            cola.setNext(cola);
        } else { // element exists in list
            temp.setNext(cola.next());
            cola.setNext(temp);
        }
        contar++;
    }


    public void addLast(E value)
    // pre: value non-null
    // post: adds element to tail of list
    {
        // new entry:
        addFirst(value);
        cola = cola.next();
    }


    // lo dificil es quitar el elemento de la cola

    public E removeLast()
    // pre: !isEmpty()
    // post: returns and removes value from tail of list
    {
        Nodo<E> finger = cola;
        while (finger.next() != cola) {
            finger = finger.next();
        }
        // finger now points to second-to-last value
        Nodo<E> temp = cola;
        if (finger == cola)
        {
            cola = null;
        } else {
            finger.setNext(cola.next());
            cola = finger;
        }
        contar--;
        return temp.value();
    }


}
