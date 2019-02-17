/*
Sara Zavala 18893
Andres Berthet 171504
Estuctura de Datos 2019
Clase DoublyLinkedNode. Este codigo fue tomada del libro
JavaStructure brindado en clase

*/

public class DoublyLinkedNode<E>{
    protected E data;
    protected DoublyLinkedNode<E> nextElement;
    protected DoublyLinkedNode<E> previousElement;



    public DoublyLinkedNode(E v,
                            DoublyLinkedNode<E> next, DoublyLinkedNode<E> previous){
        data = v;
        nextElement = next;

        if (nextElement != null)
            nextElement.previousElement = this;

        previousElement = previous;

        if (previousElement != null)
            previousElement.nextElement = this;

    }

    public DoublyLinkedNode(E v)
    // post: constructs a single element
    {
        this(v,null,null);
    }

    public E value() {

        return null;
    }

    public DoublyLinkedNode<E> previous() {

        return null;
    }

    public void  setNext(DoublyLinkedNode<E> next) {

        nextElement = next;
    }

    public DoublyLinkedNode<E> next() {

        return nextElement;
    }

    public void setPrevious(DoublyLinkedNode<E> previous) {

        previousElement = previous;

    }
}
