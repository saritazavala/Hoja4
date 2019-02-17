public class Factory {
    public  Pila CrearPila(String TipoDePila){
        Pila pila = null;

        if (TipoDePila.equals("V")){
            return  new Vector1();
        }
        else if (TipoDePila.equals("A")){
            return  new ArrayList1();
        }
        else if (TipoDePila.equals("C")){
            return  new Circular();
        }
        else if (TipoDePila.equals("S")){
            return  new Simple();
        }
        else if (TipoDePila.equals("D")){
            return  new Double();
        }
        else {
            return null
        }
    }
}