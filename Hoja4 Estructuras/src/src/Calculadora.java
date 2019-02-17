
/*
Sara Zavala 18893
Andres Berthet 171504
Estuctura de Datos 2019
Clase Calculadora. Ya estaba hecha, sin embargo se le agrego el patrón Singleton.

*/
public class Calculadora implements iCalculadora{

    private static Calculadora calculadora;

    private Calculadora(){

    }
    /////////////////////////////////
    // Referenciado de Jarroba.com //
    /////////////////////////////////

// PATRON SINGLETON
    public static Calculadora getCalculatorInstance(){
        if (calculadora==null){
            calculadora =new Calculadora();
        }
        return calculadora;
    }

// SE CLONA NUSTRA CALCULDORA
    public Calculadora clone() {
        try {
            throw new CloneNotSupportedException();
        }  catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
//Metodos a utilizar
    public double sumar(double a, double b){
        return a+b; //Sumar ambos double
    }

    public double restar(double a, double b){
        return a-b; //Restar ambos double
    }

    public double multiplicar(double a, double b){
        return a*b; //Multiplicar ambos double
    }

    public double dividir(double a, double b){
        return a/b; //Dividir ambos double
    }
}
