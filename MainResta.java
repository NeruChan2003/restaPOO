import java.util.Scanner;

public class MainResta {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int a = n1.nextInt();
        System.out.println("Ingrese el segundo numero");
        int b = n1.nextInt();
        int r = a - b;
        System.out.println("El resultado es:" + r);

    }
}