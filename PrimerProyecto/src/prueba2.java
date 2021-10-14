import java.util.Scanner;

public class prueba2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hola, como te llamas?"); //esto me lo podria saltar
        //declaro una variable para guardar el nombre
        String nombre = sc.nextLine(); //lo que escriba en el teclado se guardara en nombre
        System.out.println("Hola, " + nombre);

        System.out.println("cual es tu edad?");
        //declaro otra variable para guardar mi edad
        int edad = sc.nextInt();
        System.out.println("Vaya, no parece que tengas " + edad + "años...");
    }
}
