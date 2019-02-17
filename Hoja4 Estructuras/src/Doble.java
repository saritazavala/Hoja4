protected E data;
protected DoublyLinkedNode<E> nextElement;
protected DoublyLinkedNode<E> previousElement;
public DoublyLinkedNode(E v,
        DoublyLinkedNode<E> next,
        DoublyLinkedNode<E> previous) extends ListaAbstracta;
        {
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
protected int count;
protected DoublyLinkedNode<E> head;
protected DoublyLinkedNode<E> tail;
public DoublyLinkedList()
// post: constructs an empty list
        {
        head = null;
        tail = null;
        count = 0;
        }
public void addFirst(E value)
// pre: value is not null
// post: adds element to head of list
        {
// construct a new element, making it head
        head = new DoublyLinkedNode<E>(value, head, null);
// fix tail, if necessary
        if (tail == null) tail = head;
        count++;
        }
public E removeLast()
// pre: list is not empty
// post: removes value from tail of list
        {
        Assert.pre(!isEmpty(),"List is not empty.");
        DoublyLinkedNode<E> temp = tail;
        tail = tail.previous();
        if (tail == null) {
        head = null;
        } else {
        tail.setNext(null);
        }
        count--;
        return temp.value();
        }
public E remove(E value)
// pre: value is not null. List can be empty
// post: first element matching value is removed from list
        {
        DoublyLinkedNode<E> finger = head;
        while (finger != null &&
        !finger.value().equals(value))
        {
        finger = finger.next();
        }
        if (finger != null)
        {
// fix next field of element above
        if (finger.previous() != null)
        {
        finger.previous().setNext(finger.next());
        } else {
        head = finger.next();
        }
// fix previous field of element below
        if (finger.next() != null)
        {
        finger.next().setPrevious(finger.previous());
        } else {
        tail = finger.previous();
        }
        count--; // fewer elements
        return finger.value();
        }
        return null;
        }

// referencias:  libro de texto: Data Structures in java fir the principled programmer