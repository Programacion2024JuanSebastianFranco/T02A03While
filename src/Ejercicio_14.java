import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Declaracion de las Variables
        int operacion = 0;
        int acumulador = 0;
        int numero;

        // Relcoleccion de Datos del Usuario
        System.out.println("Introduzca un número entero\no\nIntroduce un número negativo para finalizar");
        numero = scan.nextInt();

        //Operacion del Algoritmo
        if (numero >= 0) {
            while (numero >= 0) {
                operacion += numero;
                System.out.println("Introduzca un número entero\n o \nIntroduce un número negativo para finalizar");
                numero = scan.nextInt();
                acumulador++;
            }
            double resultado = operacion / acumulador;

            System.out.println("Tu media fue " + resultado);
        } else System.out.println("Introduce un valor positivo. Fin de programa");

    }
}
