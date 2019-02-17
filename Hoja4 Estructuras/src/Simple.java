public class Node<E>
{
    protected E data; // value stored in this element
    protected Node<E> nextElement; // ref to next
    public Node(E v, Node<E> next)
// pre: v is a value, next is a reference to remainder of list
// post: an element is constructed as the new head of list
    {
        data = v;
        nextElement = next;
    }
    public Node(E v)
// post: constructs a new tail of a list with value v
    {
        this(v,null);
    }
    public Node<E> next()
// post: returns reference to next value in list
    {
        return nextElement;
    }
    public void setNext(Node<E> next)
// post: sets reference to new next value
    {
        nextElement = next;
    }
    public E value()
// post: returns value associated with this element
    {
        return data;
    }
    public void setValue(E value)
// post: sets value associated with this element
    {
        data = value;
    }
}
    public int size()
// post: returns number of elements in list
    {
        return count;
    }
    public void addFirst(E value)
// post: value is added to beginning of list
    {
// note order that things happen:
// head is parameter, then assigned
        head = new Node<E>(value, head);
        count++;
    }
    public E removeFirst()
// pre: list is not empty
// post: removes and returns value from beginning of list
    {
        Node<E> temp = head;
        head = head.next(); // move head down list
        count--;
        return temp.value();
    }
    public void addLast(E value)
// post: adds value to end of list
{
// location for new value
    Node<E> temp = new Node<E>(value,null);
    if (head != null)
    {
// pointer to possible tail
        Node<E> finger = head;
        while (finger.next() != null)
        {
            finger = finger.next();
        }
        finger.setNext(temp);
    } else head = temp;
    count++;
}
    public E removeLast()
// pre: list is not empty
// post: removes last value from list
    {
        Node<E> finger = head;
        Node<E> previous = null;
        Assert.pre(head != null,"List is not empty.");
        while (finger.next() != null) // find end of list
        {
            previous = finger;
            finger = finger.next();
        }
// finger is null, or points to end of list
        if (previous == null)
        {
// has exactly one element
            head = null;
        }
        else
        {
// pointer to last element is reset
            previous.setNext(null);
        }
        count--;
        return finger.value();
    }
    public void add(int i, E o)
// pre: 0 <= i <= size()
// post: adds ith entry of list to value o
    {
        Assert.pre((0 <= i) && (i <= size()),
                "Index in range.");
        if (i == size()) {
            addLast(o);
        } else if (i == 0) {
            addFirst(o);
        } else {
            Node<E> previous = null;
            Node<E> finger = head;
// search for ith position, or end of list
            while (i > 0)
            {
                previous = finger;
                finger = finger.next();
                i--;
            }
// create new value to insert in correct position
            Node<E> current =
                    new Node<E>(o,finger);
            count++;
// make previous value point to new value
            previous.setNext(current);
        }
    }
    public E remove(int i)
// pre: 0 <= i < size()
// post: removes and returns object found at that location
    {
        Assert.pre((0 <= i) && (i < size()),
                "Index in range.");
        if (i == 0) return removeFirst();
        else if (i == size()-1) return removeLast();
        Node<E> previous = null;
        Node<E> finger = head;
// search for value indexed, keep track of previous
        while (i > 0)
        {
            previous = finger;
            9.5 Implementation: Doubly Linked Lists 201
            finger = finger.next();
            i--;
        }
// in list, somewhere in middle
        previous.setNext(finger.next());
        count--;
// finger's value is old value, return it
        return finger.value();
    }


    // referencias:  libro de texto: Data Structures in java fir the principled programmer