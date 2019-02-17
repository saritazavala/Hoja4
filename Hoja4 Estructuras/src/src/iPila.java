
/*
Sara Zavala 18893
Andres Berthet 171504
Estuctura de Datos 2019
Interface de la Pila

*/

public interface iPila<E> {

    public void push(E item); // Ingresar datos al Stack
    public E pop(); // Quitar datos del Stack
    public E peek();// Saber cual es el siguiente dato de la pila
    public boolean isEmpty(); // Stack vacio
    public int size();// Tamaño del Stack
}
