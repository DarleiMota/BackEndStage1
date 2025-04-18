// Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2.
// Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da
// área com base na opção selecionada.

package pratica3;
import java.util.Scanner;

public class Pratica3_3 {

    Scanner scanner = new Scanner(System.in);

    public void calculaAreaQuadrado(){
        System.out.println("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble();
        double areaQuadrado = lado * lado;
        System.out.printf("A área do quadrado é: %.2f %n ", areaQuadrado);
    }

    public void calcularAreaCirculo(){
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();
        double areaCirculo = 3.14 * raio * raio;
        System.out.printf("A área do círculo é: %.2f %n", areaCirculo);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Pratica3_3 calculo = new Pratica3_3();

        int numeroEscolhido;

        do {
            String mensagem = """
                    
                    ===== Bem-vindo ao Cálculo de Áreas =====
                    1 - Calcular área do quadrado
                    2 - Calcular área do círculo
                    3 - Sair
                    Escolha uma opção:
                    """;
            System.out.println(mensagem);
            numeroEscolhido = scanner.nextInt();

            switch (numeroEscolhido) {
                case 1:
                    calculo.calculaAreaQuadrado();
                    break;
                case 2:
                    calculo.calcularAreaCirculo();
                    break;
                case 3:
                    System.out.println("Fim do programa!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (numeroEscolhido != 3);

        scanner.close();
    }
}