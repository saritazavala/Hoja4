
/*
Sara Zavala 18893
Andres Berthet 171504
Estuctura de Datos 2019
Clase Factory: Aqui se crea nuestro patron a utilizar dentro de
nuestro vecor, arraylist

*/

public class Factory1<E> {

    ///////////////////////////////////////////////////////////////////////////////
    /////////////////////////////// CONSULTADO/////////////////////////////////////
    //https://www.arquitecturajava.com/java-8-factory-pattern-y-su-implementacion//
    //https://www.geeksforgeeks.org/design-patterns-set-2-factory-method///////////
    ///////////////////////////////////////////////////////////////////////////////

    public Pila CrearPila(String tipo) {
        Vector1 vector = new Vector1(); //Se crea un vector nuevo
        Pila pila = null; //La nueva pila crada es iguakada a null


        if (tipo.equals("V")) {

            return new Vector1<E>(); //si el tipo es igual a V se creara un vector

        } if (tipo.equals("A")) {

            return new ArrayList1<E>(); /si el tipo es igual a A se creara un arrayList
        }
        else {
            return null; //De ni ser ninguna se deja nulo
        }
    }

    public ListaAbstracta<E> Crear(String tipo){

    //Se aplica lo mismo para los tres tipos de listas
    //Si es igual se aplica, de lo contrario se regresa nulo    
        if (tipo =="Simple") {
            return new Simple<>();
        }


        else if(tipo =="Circular"){
            return new Circular<>();
        }

        else if(tipo =="Doble"){
            return new Doble<>();
        }

        return null;
    }
}
