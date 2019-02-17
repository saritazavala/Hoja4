/*
Sara Zavala 18893
Andres Berthet 171504
Estuctura de Datos 2019
Clase Simple. Este codigo fue tomada del libro
JavaStructure brindado en clase

*/
public class Simple<E> extends ListaAbstracta<E> {
    protected int contar;
    protected Nodo<E> first;

    public Simple()

    {
        first = null;
        contar = 0;
    }

    public int size()

    {
        return contar;
    }
    public void addFirst(E value)

    {

        first = new Nodo<E>(value, first);
        contar++;
    }
    public E removeFirst()

    {
        Nodo<E> temp = first;
        first = first.next();
        contar--;
        return temp.value();
    }
    public E getFirst()

    {
        return first.value();
    }

    public void addLast(E value)

    {

        Nodo<E> temp = new Nodo<E>(value,null);
        if (first != null)
        {
            // pointer to possible tail
            Nodo<E> finger = first;
            while (finger.next() != null)
            {
                finger = finger.next();
            }

            finger.setNext(temp);
        } else first = temp;

        contar++;

    }

    public boolean contains(E value)

    {
        Nodo<E> finger = first;

        while (finger != null &&
                !finger.value().equals(value))
        {
            finger = finger.next();
        }
        return finger != null;
    }

}
