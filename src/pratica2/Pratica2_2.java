// Pratica 2.2
//Declare uma variável do tipo double e uma variável do tipo int.
//Faça o casting da variável double para int e imprima o resultado.

package pratica2;

public class Pratica2_2 {
    public static void main(String[] args) {
        double valor1 = 50.34;
        int valorConvertido = (int) valor1;
        System.out.printf("O valor convertido de double %.2f para int e: %d ",valor1, valorConvertido);
    }
}
