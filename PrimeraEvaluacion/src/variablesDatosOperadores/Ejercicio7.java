package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
/* Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a
cuantas horas y minutos corresponde. Por ejemplo: 1000 minutos son 16 horas y 40
minutos.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe los minutos:");
        int minutos = sc.nextInt();
        int horas = minutos / 60;
        int resto = minutos % 60;
        System.out.println(+ minutos + "minutos = " + horas + " horas y " + resto + " minutos.");


    }
}
