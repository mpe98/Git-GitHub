package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        /* Escribe un programa que calcule (y muestre) cuántas horas, minutos y segundos han
transcurrido entre dos momentos del mismo día.
Para ello, el programa ha de pedir
por teclado seis números enteros: las horas, minutos y segundos para el momento
inicial y lo mismo para el momento final. De momento vamos a considerar que los
números introducidos van a estar en el rango adecuado y que el momento inicial
introducido es menor (o igual) que el momento final. Por ejemplo, si se introducen
los números 1, 2, 30,15, 21, 1 entenderemos que el momento inicial es 1:02:30 am y
el momento final es 15:21:1. El programa debe mostrar por pantalla la diferencia en
el formato: hh:mm:ss. */
        Scanner sc=new Scanner(System.in);
        System.out.println("Inicio");
        System.out.println("Horas:");
        int h1 = sc.nextInt();
        System.out.println("Minutos:");
        int m1 = sc.nextInt();
        System.out.println("Segundos:");
        int s1 = sc.nextInt();

        System.out.println("Final");
        System.out.println("Horas");
        int h2 = sc.nextInt();
        System.out.println("Minutos:");
        int m2 = sc.nextInt();
        System.out.println("Segundos:");
        int s2 = sc.nextInt();

        int horaf = h1 - h2;
        

    }
}
