//Crie um programa que solicite ao usuário a entrada de um número inteiro.
//Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.

package pratica3;
import java.util.Scanner;

public class Pratica3_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
    }
}