public class Factory {
    public  Pila CrearPila(String TipoDePila){
        Pila pila = null;

        if (TipoDePila.equals("V")){
            return  new Vector1();
        }
        else if (TipoDePila.equals("A")){
            return  new ArrayList1();
        }
        else {
            return null
        }
    }
}