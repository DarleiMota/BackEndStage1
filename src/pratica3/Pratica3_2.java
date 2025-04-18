//Peça ao usuário para inserir dois números inteiros. Compare os números e imprima
// uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.

package pratica3;
import java.util.Scanner;

public class Pratica3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        int resultadoComparacao;

        if (numero1 == numero2) {
            resultadoComparacao = 1;
        } else if (numero1 > numero2) {
            resultadoComparacao = 2;
        } else {
            resultadoComparacao = 3;
        }

        switch (resultadoComparacao) {
            case 1:
                System.out.printf("O número %d é igual a %d.%n", numero1, numero2);
                break;
            case 2:
                System.out.printf("O número %d é maior que %d.%n", numero1, numero2);
                break;
            case 3:
                System.out.printf("O número %d é menor que %d.%n", numero1, numero2);
                break;
        }

        System.out.println("Fim do programa!!!");
        scanner.close();
    }
}