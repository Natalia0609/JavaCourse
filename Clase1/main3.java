import java.io.*;
import java.util.Scanner;

public class main3 {


    public static void main(String[] args) {
        PrintStream output = new PrintStream(System.out);
        Scanner input = new Scanner(System.in);

        int num1, num2, num3 = 0;

        System.out.println("Bienvenido a positivo o negativo");

        System.out.println("Digite el primer numero: ");
        num1 = input.nextInt();

        System.out.println("Digite el segundo numero: ");
        num2 = input.nextInt();

        System.out.println("Digite el tercer numero: ");
        num3 = input.nextInt();

        int suma = num1 + num2 + num3;

        if (suma > 0) {
            System.out.println("El resultado es negativo");
        } else {
            System.out.println("El resultado es negativo");

        }
    }
}
