package ExercicioDoisListaSeis;

import java.util.Scanner;
public class ContaBancaria {

    Scanner scanner = new Scanner(System.in);

    private String nomePessoa;
    private String numeroConta;
    private double saldoInicial;

    public String getNomePessoa() {
        return nomePessoa;
    }
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
    public String getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
    public double getSaldoInicial() {
        return saldoInicial;
    }
    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }


    public void criarConta(String nomePessoa, String numeroConta, double saldoInicial){
        this.nomePessoa = nomePessoa;
        this.numeroConta = numeroConta;
        this.saldoInicial = saldoInicial;
    }
    public void menu(){
        System.out.println("Qual operação deseja realizar:");
        System.out.println("1- Depositar valor");
        System.out.println("2- Sacar valor");
        System.out.println("3- Obter saldo disponível");
        System.out.println("4- Sair");
    }
    public void depositar(double valor) {
        saldoInicial += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }
    public void sacar(double valor) {
        if (valor > saldoInicial) {
            System.out.println("Saldo insuficiente para realizar a operação.");
        } else if (valor > 5000) {
            System.out.println("Valor do saque acima do permitido.");
        } else {
            saldoInicial -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }
    }
    public void obterSaldo() {
        System.out.println("Saldo disponível: R$" + saldoInicial);
    }
}
     

