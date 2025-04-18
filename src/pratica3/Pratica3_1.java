//Crie um programa que solicite ao usuário digitar um número. Se o número for positivo,
//exiba "Número positivo", caso contrário, exiba "Número negativo".

package pratica3;
import java.util.Scanner;

public class Pratica3_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String mensagem = """
                ===== Verificar Numero =====
                ==== Positivo ou Negativo ====
                Digite um numero para verificar:
                """;
        System.out.println(mensagem);
        double numero = scanner.nextDouble();
        if (numero > 0){
            System.out.printf("O numero: %.1f é positivo \n", numero);
        }else {
            System.out.printf("O numero: %.1f é negativo \n", numero);
        }
    }
}

