// Pratica 2.5
//Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa
// variável. Considere que o valor de 1 dólar é equivalente a cotação atual. Realize a conversão
// do valor em dólares para reais e imprima o resultado formatado.

package pratica2;
import java.util.Scanner;

public class Pratica2_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da cotação atual do dolar:");
        double valorEmDolar = scanner.nextDouble();

        System.out.println("Digite o valor em reais para converter em dolar:");
        double valorEmReais = scanner.nextDouble();

        double conversao = valorEmDolar * valorEmReais;
        System.out.println("O valor em dolar e: "+ conversao);

    }
}
