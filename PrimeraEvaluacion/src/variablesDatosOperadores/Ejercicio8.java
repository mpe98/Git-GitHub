package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        /* Escribe un programa que reciba un tiempo en segundos y muestre por pantalla este
tiempo pero expresado en horas, minutos y segundos. Por ejemplo, 12.610 segundos
son 3 horas, 30 minutos y 10 segundos.*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Escribe la cantidad de segundos:");
        int segundos = sc.nextInt();
        int horas = segundos / 3600;
        int resto1 = segundos % 3600;
        int minutos = resto1 / 60;
        int resto2 = resto1 % 60;

        System.out.println("En " + segundos + " segundos hay " + horas + " horas, " + minutos + " minutos y " + resto2 + "segundos");
    }
}
