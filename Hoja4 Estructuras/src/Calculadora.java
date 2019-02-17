public class Calculadora implements iCalculadora{

    private static Calculadora calculadora;

    private Calculadora(){

    }
    /////////////////////////////////
    // Referenciado de Jarroba.com //
    /////////////////////////////////


    public static Calculadora getCalculatorInstance(){
        if (calculadora==null){
            calculadora =new Calculadora();
        }
        return calculadora;
    }


    public Calculadora clone() {
        try {
            throw new CloneNotSupportedException();
        }  catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

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
