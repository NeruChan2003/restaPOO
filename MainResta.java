import java.util.Scanner;

public class MainResta {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int a = input.nextInt();

        System.out.println("Ingrese el segundo número:");
        int b = input.nextInt();

        // Crear una instancia de la clase Resta
        Resta resta = new Resta();

        // Establecer los valores de a y b en la instancia de resta
        resta.setA(a);
        resta.setB(b);

        // Realizar la resta usando el método resta de la instancia de Resta
        resta.restar();

        // Obtener el resultado de la instancia de Resta
        int r = resta.getR();

        System.out.println("El resultado es: " + r);

        // Mostrar la representación de la instancia de Resta
        System.out.println(resta.toString());
    }
}
