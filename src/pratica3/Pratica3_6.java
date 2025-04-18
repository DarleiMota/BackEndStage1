//Crie um programa que solicite ao usuário um número e
//calcule o fatorial desse número.

package pratica3;
import java.util.Scanner;

public class Pratica3_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para saber seu fatorial");
        int numero = scanner.nextInt();
        double fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.printf("O fatorial de %d é %f%n", numero, fatorial);
        scanner.close();
    }
}
