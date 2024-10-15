import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        //8
        int contadorInicio;
        int contadorFin;

        System.out.println("Introduce el numero de inicio: ");
        contadorInicio = scan.nextInt();
        System.out.println("Introduce el numero final: ");
        contadorFin = scan.nextInt();

        while (contadorInicio <= contadorFin) {
            System.out.println("contador es: "+contadorInicio);
            contadorInicio++;
        }
        System.out.println("Termina el bucle");



        //12
        int clase;
        int ordenadores;
        int suma = 1;

        System.out.println("Introduce el numero de la clase: ");
        clase = scan.nextInt();
        System.out.println("Introduce el numero de computadores:");
        ordenadores = scan.nextInt();

        while(suma <= ordenadores){
            System.out.println(clase + "." + suma);
            suma++;
        }




        //14
        int operacion = 0;
        int acumulador = 0;
        int numero;


        System.out.println("Introduzca un número entero \nIntroduce un número negativo para finalizar");
        numero = scan.nextInt();


        if (numero >= 0) {
            while (numero >= 0) {
                operacion += numero;
                System.out.println("Introduzca un número entero \nIntroduce un número negativo para finalizar");
                numero = scan.nextInt();
                acumulador++;
            }
            double resultado = operacion/acumulador;

            System.out.println("Tu media fue " + resultado);
        }
        else System.out.println("Introduce un valor positivo. Fin de programa");




        //16
         Random rand = new Random();

         int numRand = rand.nextInt(1,11);
         int num;
         int intentos = 0;

        System.out.println("Intenta adivinar el numero del 1 al 10: ");
        num = scan.nextInt();
        intentos++;

        while (num != numRand){
            if (num > numRand){
                System.out.println("Tu numero es mayor");
            }
            else if (num < numRand) {
                System.out.println("Tu numero es menor");
            }
            else {
                System.out.println("Te dije del 1 al 10");
            }
            System.out.println("Intenta adivinar el numero del 1 al 10: ");
            num = scan.nextInt();
            intentos++;
        }
        System.out.println("¡¡¡¡¡¡Premio!!!!!!! Lo has conseguido en " + intentos + " intentos");


    }
}