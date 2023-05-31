package ExercicioDoisListaSeis;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();
        
        System.out.print("Digite seu nome completo: ");
        String nomePessoa = scanner.nextLine();

        System.out.print("Digite o número da Conta: ");
        String numeroConta = scanner.nextLine();

        System.out.print("Digite o saldo Inicial: ");
        double saldoInicial = scanner.nextDouble();

        conta.criarConta(nomePessoa, numeroConta, saldoInicial); 
        System.out.println("Conta bancária criada com sucesso.");

        int opcao = 0;
        while(opcao != 4){
            conta.menu();
            opcao = scanner.nextInt();

            switch (opcao){
            case 1:
            System.out.println("Digite o valor a ser depositado: ");
            double valorDeposito = scanner.nextDouble();
            conta.depositar(valorDeposito);
            break;

            case 2:
            System.out.println("Digite o valor a ser sacado: ");
            double valorSaque = scanner.nextDouble();
            conta.sacar(valorSaque);
            break;

            case 3:
            conta.obterSaldo();
            break;

            case 4:
            System.out.println("Encerrando!");

            default:
            System.out.println("Opção invalida. Digite um número de 1 a 4.");
            break;
            }
        }

        scanner.close();     
    }
}
       
