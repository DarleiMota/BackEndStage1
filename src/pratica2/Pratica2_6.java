// Prática 2.6
// Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável,
// representando o preço original de um produto.
// Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto
// ao produto (por exemplo, 10 para 10%).
// Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.

package pratica2;
public class Pratica2_6 {
    public static void main(String[] args) {
        double precoOriginal = 150.00;
        double percentualDesconto = 15.0; // 15%

        double valorDesconto = precoOriginal * (percentualDesconto / 100);
        double precoComDesconto = precoOriginal - valorDesconto;

        System.out.printf("Preço original: R$ %.2f\n", precoOriginal);
        System.out.printf("Desconto aplicado: %.2f%% (R$ %.2f)\n", percentualDesconto, valorDesconto);
        System.out.printf("Preço com desconto: R$ %.2f\n", precoComDesconto);
    }
}