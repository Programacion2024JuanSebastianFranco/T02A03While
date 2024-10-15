import java.awt.print.Printable;
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


        //

    }
}