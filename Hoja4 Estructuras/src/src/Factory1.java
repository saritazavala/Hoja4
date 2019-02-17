
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
        Vector1 vector = new Vector1();
        Pila pila = null;


        if (tipo.equals("V")) {

            return new Vector1<E>();

        } if (tipo.equals("A")) {

            return new ArrayList1<E>();
        }
        else {
            return null;
        }
    }

    public ListaAbstracta<E> Crear(String tipo){


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
