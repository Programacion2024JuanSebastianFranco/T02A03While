import java.util.Random;
import java.util.Scanner;

public class Ejercicio_16 {
    public static void main(String[] args) {
        //Declaracion del Flujo de Trabajo
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        //Declaracion de Variables
        int numRand = rand.nextInt(1,11);
        int num;
        int intentos = 0;

        //Recoleccion de Datos del Usuario
        System.out.println("Intenta adivinar el numero del 1 al 10: ");
        num = scan.nextInt();
        intentos++;

        //Operacion de Algoritmo
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