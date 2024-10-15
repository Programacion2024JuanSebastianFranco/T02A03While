import java.util.Scanner;

public class Ejercicio_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Declaracion de Variables
        int contadorInicio;
        int contadorFin;

        //Reunion de Informacion del Usuario
        System.out.println("Introduce el numero de inicio: ");
        contadorInicio = scan.nextInt();
        System.out.println("Introduce el numero final: ");
        contadorFin = scan.nextInt();

        //Operacion y realizacion de Algoritmos
        while (contadorInicio <= contadorFin) {
            System.out.println("contador es: " + contadorInicio);
            contadorInicio++;
        }
        System.out.println("Termina el bucle");

    }
}
