
//Crie um programa que solicite ao usuário um número e exiba a tabuada
// desse número de 1 a 10.

package pratica3;

import java.util.Scanner;

public class Pratica3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mensagem = """
                ===== Tabuada ====
                Digite um numero para impressão:
                """;
        System.out.println(mensagem);
        int numero = scanner.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.printf("*** %d X %d = %d *** %n", numero, i, numero * i);
        }
        System.out.println("Fim do programa");
        scanner.close();
    }
}
