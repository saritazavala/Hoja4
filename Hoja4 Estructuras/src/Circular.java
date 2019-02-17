public class Circular<E> extends ListaAbstracta<E> {

    private static class Node<E>{
        private E element;
        private Node<E> next;
        public Node(E element, Node<E> next) {
            super();
            this.element = element;
            this.next = next;
        }
        public E getElement() {
            return element;
        }
        public Node<E> getNext() {
            return next;
        }
        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    /**
     * Tail node. It points to the end of the node
     */
    private Node<E> tail = null;

    /**
     * Size of the List
     */
    private int size = 0;

    /**
     * Adds a generic item to the top of the list
     * @param e Generic
     */
    @Override
    public void addFirst(E e)
    //Pre: a valid generic type
    {
        if(size == 0) {
            tail = new Node<>(e, null);
            tail.setNext(tail);
        }else {
            Node<E> newest = new Node<>(e, tail.getNext());
            tail.setNext(newest);
        }
        size++;
    }

    /**
     * Retrieves the first element of the List
     * @return Generic item
     */
    @Override
    public E removeFirst()
    //Pre: The list must not be empty
    //Post: A Generic element of the list
    {
        if(isEmpty()) return null;
        Node<E> head = tail.getNext();
        if(head == tail) tail = null;
        else tail.setNext(head.getNext());
        size--;
        return head.getElement();
    }

    /**
     * Size of the list
     * @return Quantity of elements in the list
     */
    @Override
    public int size()
    //Post: The list size
    {

        return this.size;
    }
}
