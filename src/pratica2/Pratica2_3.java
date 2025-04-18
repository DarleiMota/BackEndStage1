//Pratica 2.3
//Declare uma variável do tipo char (letra) e uma variável do tipo String
//(palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.

package pratica2;

public class Pratica2_3 {
    public static void main(String[] args) {
        char verdadeiro = 'S';
        String palavraSim = "sim";

        String mensagem = "A letra " + verdadeiro + "Representa sim" +palavraSim +".";
        System.out.println(mensagem);
    }
}
