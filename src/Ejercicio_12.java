import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Inicializacion de las Variables
        int clase;
        int ordenadores;
        int suma = 1;

        //Recolccion de datos del Usuario
        System.out.println("Introduce el numero de la clase: ");
        clase = scan.nextInt();
        System.out.println("Introduce el numero de computadores:");
        ordenadores = scan.nextInt();

        //Operacion de Algoritmo
        while (suma <= ordenadores) {
            System.out.println(clase + "." + suma);
            suma++;
        }
    }
}
