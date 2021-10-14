package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        /* N ardillas encuentran K nueces y deciden dividirlas equitativamente. Escribe un
programa que calcule (y muestre) cuántas nueces corresponden a cada ardilla y
cuántas sobrarán tras el reparto. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas ardillas son?");
        int N = sc.nextInt();
        System.out.println(" Cuantas nueces encuentran?");
        int K = sc.nextInt();

        int cociente = K / N;
        int resto = K % N;

        System.out.println("A las ardillas le corresponderan " + cociente + ", y sobran: " + resto);

    }
}
