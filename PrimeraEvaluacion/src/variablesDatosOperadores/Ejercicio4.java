package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un primer numero:");
        int num1 = sc.nextInt();
        System.out.println("Escriba un segundo numero:");
        int num2 = sc.nextInt();
        System.out.println("Escriba un tercer numero:");
        int num3 = sc.nextInt();
        System.out.println("Escriba un cuarto numero:");
        int  num4 = sc.nextInt();
        int suma = num1 + num2;
        int multip = num3 * num4;

        System.out.println("La suma de los dos primeros numeros es = " + suma + ", y el producto del tercero y cuarto es = " + multip);

    }
}
