public interface iPila<E> {

    public void push(E item); // Ingresar datos al Stack
    public E pop(); // Quitar datos del Stack
    public E peek();// Saber cual es el siguiente dato de la pila
    public boolean empty(); // Stack vacio
    public int size();// Tamaño del Stack
}
