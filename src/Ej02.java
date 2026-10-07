import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su nombre:");
        String nombre = sc.nextLine();

        System.out.println("Introduzca su edad:");
        int edad = sc.nextInt();
        sc.nextLine();
        
        System.out.println("¿Qué estudias?");
        String modulo = sc.nextLine();

        System.out.println("Nombre: " + nombre + " Edad: " + edad + " Estudios: " + modulo);

        sc.close();
    }
}
