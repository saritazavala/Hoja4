/*
Sara Zavala 18893
Andres Berthet 171504
Estuctura de Datos 2019
Main: corre el programa
*/



import java.io.File;
import java.io.*;
import java.util.Scanner;
import java.io.*;
import java.util.*;


public class Main {
    //Se crean todas las variables a utilizar
    //Incluida la calculadora, su instacia, para leer el archivo txt
    //y un factory
    public static void main(String[] args) {
        double x = 0;
        double y = 0;
        double res = 0;
        boolean leido = false;
        boolean operar = false;
        String line = null;
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        Scanner teclado = new Scanner(System.in); //Teclado para ingresar datos
        Calculadora calculadora = Calculadora.getCalculatorInstance(); 
        Pila pila = null;
        Factory1<String> factory = new Factory1<String>();

        System.out.println("Ingrese direccion de su archivo:");
        String direccionDeArchivo = teclado.nextLine();
        //Desde aqui se le pide al usario que ingrese la direccion
        //Se prueba y si se encuentra el documento se continua, si no marcará error

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda


            archivo = new File(direccionDeArchivo);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                leido = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Archivo no encontrado");
        }

        //Si es verdadero que se leyó el documento correctamente va a seguir fluyendo el programa
        if (leido == true) {
            System.out.println("Elija que desea utlizar");
            System.out.println("1. 1. ArrayList");
            System.out.println("2. Vector");
            System.out.println("3. Lista.");
            System.out.println("");

            int opcion = teclado.nextInt();
            teclado.nextLine();

            if (opcion == 1) {
                pila = factory.CrearPila("A");
                operar = true;
            }

            if (opcion == 2) {
                pila = factory.CrearPila("V");
                operar = true;

            }
            if (opcion == 3) {
                System.out.println("Elija que tipo de lista desea utilizar");
                System.out.println("1. Simplemente encadenadas");
                System.out.println("2. Doblemente encadenadas");
                System.out.println("3. Lista circular.");
                System.out.println("");
                int eleccion = teclado.nextInt();
                teclado.nextLine();

                if (eleccion == 1) {
                    pila = new Lista1<String>("Simple");
                    operar = true;
                }
                if (eleccion == 2) {
                    pila = new Lista1<String>("Doble");
                    operar = true;

                }
                if (eleccion == 3) {
                    pila = new Lista1<String>("Circular");
                    operar = true;

                }

            }

            //Si se ingresa una opcion valida continuara el proceso
            //Este codigo es el de la HDT2
            if (operar == true) {
                char[] datos = line.toCharArray();

                for (int i = 0; i < datos.length; i++) {
                    switch (datos[i]) {
                        case '+':
                            if (pila.size() <= 1) {
                                System.out.println("No hay suficientes operandos para realizar la operación. El siguiente resultado está incorrecto debido a esto.");
                            } else {
                                x = (double) pila.pop();
                                y = (double) pila.pop();
                                res = calculadora.sumar(x, y);
                                pila.push(res);
                            }
                            break;
                        case '-':
                            if (pila.size() <= 1) {
                                System.out.println("No hay suficientes operandos para realizar la operación. El siguiente resultado está incorrecto debido a esto.");
                            } else {
                                x = (double) pila.pop();
                                y = (double) pila.pop();
                                res = calculadora.restar(x, y);
                                pila.push(res);
                            }
                            break;
                        case '*':
                            if (pila.size() <= 1) {
                                System.out.println("No hay suficientes operandos para realizar la operación. El siguiente resultado está incorrecto debido a esto.");
                            } else {
                                x = (double) pila.pop();
                                y = (double) pila.pop();
                                res = calculadora.multiplicar(x, y);
                                pila.push(res);
                            }
                            break;
                        case '/':
                            if (pila.size() <= 1) {
                                System.out.println("No hay suficientes operandos para realizar la operación. El siguiente resultado está incorrecto debido a esto.");
                            } else {
                                x = (double) pila.pop();
                                y = (double) pila.pop();
                                if (y == 0) {
                                    System.out.println("Está tratando de dividir entro de cero.");
                                } else {
                                    res = calculadora.dividir(x, y);
                                    pila.push(res);
                                }
                                break;
                            }
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case '0':
                            double pusher = Character.getNumericValue(datos[i]);
                            pila.push(pusher);
                            break;
                        default:
                            break;
                    }
                }
                res = (double) pila.pop();
                System.out.println(res);
            }


        }
    }
}





