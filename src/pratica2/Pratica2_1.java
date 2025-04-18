//Crie um programa que realize a média de duas notas decimais e exiba o
//resultado.

package pratica2;//Pratica 2.1
import java.util.Scanner;

public class Pratica2_1 {

    double MediaNota;
    double Nota1;
    double Nota2;

    public double fazerMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pratica2_1 notaFinal = new Pratica2_1();

        System.out.println("Digite a primeira nota");
        double primeiraNota = scanner.nextDouble();

        System.out.println("Digite a segunda nota");
        double segundaNota = scanner.nextDouble();

        notaFinal.fazerMedia(primeiraNota,segundaNota);
        scanner.close();
    }
}
