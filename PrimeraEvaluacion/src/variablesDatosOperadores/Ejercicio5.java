package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Establece un valor a n en la siguiente operacion: ((n + 1) * n + 2) * n + 3");
        int n = sc.nextInt();
        int resultado = ((n + 1) * n + 2) * n + 3;
        System.out.println("Resultado: " + resultado);
    }
}
