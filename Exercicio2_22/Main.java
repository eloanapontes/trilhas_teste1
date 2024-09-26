package Exercicio2_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("Nome do cliente: ");
        String nomeCliente = scanner.nextLine();


        System.out.println("Digite o numero da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o saldo da conta: ");
        double saldoConta = scanner.nextDouble();

        Banco conta = new Banco(nomeCliente, numeroConta, saldoConta);


        System.out.println("Qual operação deseja realizar? 1 - DEPÓSITO 2 - SAQUE");
        int opcao = scanner.nextInt();

        if (opcao ==1){
            System.out.println("digite o valor para depósito: ");
            double deposito = scanner.nextDouble();
            conta.deposito(deposito+saldoConta);
            System.out.println("depositado com sucesso");
            System.out.println(saldoConta);


        } else if (opcao==2){
            System.out.println("digite o valor para saque: ");
            double saque = scanner.nextDouble();
            conta.saque(saque);
            System.out.println("saque realizado com successo");


        }else{
            System.out.println("OPÇÃO INVÁLIDA!");
        }
        scanner.close();
    }
}
