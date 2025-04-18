package Desafio;

import java.util.Scanner;

public class ContaBancaria {
    String nomeDoTitular;
    String tipoConta;
    double saldo;

    // Construtor
    public ContaBancaria(String nomeDoTitular, String tipoConta, double saldoInicial) {
        this.nomeDoTitular = nomeDoTitular;
        this.tipoConta = tipoConta;
        this.saldo = saldoInicial;
    }

    public void verSaldo() {
        System.out.println("========== Dados da Conta ==========");
        System.out.println("Titular: " + nomeDoTitular);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso.%n", valor);
        } else {
            System.out.println("Valor de depósito inválido. O valor deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valor);
            } else {
                System.out.printf("Saldo insuficiente! Saldo atual: R$ %.2f%n", saldo);
            }
        } else {
            System.out.println("Valor de saque inválido. O valor deve ser positivo.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dados iniciais da conta
        System.out.print("Digite o nome do titular: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o tipo da conta (ex: Corrente, Poupança): ");
        String tipo = scanner.nextLine();

        System.out.print("Digite o saldo inicial: R$ ");
        double saldoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(nome, tipo, saldoInicial);

        int opcao;

        do {
            String menu = """
                    \n====== MENU ======
                    1 - Ver Saldo
                    2 - Depositar
                    3 - Sacar
                    4 - Sair
                    Escolha uma opção:
                    """;
            System.out.print(menu);
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    conta.verSaldo();
                    break;

                case 2:
                    System.out.print("Digite o valor para depositar: R$ ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;

                case 3:
                    System.out.print("Digite o valor para sacar: R$ ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;

                case 4:
                    System.out.println("Fim do programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (opcao != 4);

        scanner.close();
    }
}
