import java.io.*;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args){
        PrintStream output = new PrintStream(System.out);
        Scanner input = new Scanner(System.in);

        int numA = 0;
        int numB = 0;

        System.out.println("Digite el primer numero:");
        numA = input.nextInt();
        System.out.println("Digite el segundo numero");
        numB = input.nextInt();

        //En este momento la variable numA y numB tienen los datos ingresados mediante el teclado.

        int suma = numA + numB;
        System.out.println("La suma es: "+ suma);

        System.out.println("La suma es: "+(numA + numB));

    }
}
