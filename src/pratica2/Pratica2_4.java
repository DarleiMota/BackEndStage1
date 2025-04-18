// Pratica 2.4
//Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total
//multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.

package pratica2;

public class Pratica2_4 {
    public static void main(String[] args) {
        double precoProduto = 238.60;
        int quantidadeProduto = 10;
        double resultado = precoProduto * quantidadeProduto;

        // Imprimindo com prinf
        System.out.printf("O valor do produto %.2f e da quantidade %d e igual a: %.2f \n ",precoProduto,
                quantidadeProduto,resultado);

        // Imprimindo com a mensagem usando String
        String mensagem = "O valor do produto "+precoProduto+" e da quantidade "
                +quantidadeProduto+ " é igual a: "+resultado;
        System.out.println(mensagem);
    }
}
