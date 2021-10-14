import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba los siguientes datos a continuación");

        System.out.println("Nombre:");
        String nombre = sc.nextLine();

        System.out.println("Edad:");
        int edad = sc.nextInt();

        System.out.println("Años de experiencia:");
        int añosexp = sc.nextInt();
        sc.nextLine();

        System.out.println("Preferencia de cocina:");
        String tipococina = sc.nextLine();

        System.out.println("El formulario de " + nombre + ", de " + edad + " años y " + añosexp + " de experiencia, está completo. Nos comunicaremos con usted si necesitamos a alguien que cocine comida " +tipococina);
    }
}
