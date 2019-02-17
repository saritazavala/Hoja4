/*
Sara Zavala 18893
Andres Berthet 171504
Estuctura de Datos 2019
Lista1: utiliza los metodos de la clase Pila

*/
public class Lista1<E> extends Pila<E>{

    private String tipo;
    private ListaAbstracta<E> NuevaLista;
    private Factory1<E> factory = new Factory1<>();


    public Lista1(String tipo) {
        this.tipo = tipo;
        NuevaLista = factory.Crear(tipo);
    }


    public void push(E item) {
        NuevaLista.addFirst(item);
    }

    public E pop() {
        return NuevaLista.removeFirst();
    }


    public int size() {
        return NuevaLista.size();
    }


    public boolean isEmpty(){
        if(this.NuevaLista.isEmpty()){ //Se instancea
            return true;
            //Si el vector esta vacio se devolverá true
        }
        else{
            return false;
            //Si el vector no esta vacio se devolverá false
        }
    }




}
