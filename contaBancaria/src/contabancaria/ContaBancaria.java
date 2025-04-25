package contabancaria;
import java.util.Scanner;
public class ContaBancaria {
public static void main(String[] args) {
        int contaCorrente;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero da Conta Corrente:");
        contaCorrente = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o numero da Agencia Bancária:");
        agencia = scanner.nextLine();
        System.out.println("Digite seu nome:");
        nomeCliente = scanner.nextLine();
        System.out.println("Digite o saldo atual:");
        saldo = scanner.nextDouble();
        
        System.out.println("\n---Dados do Cliente---");
        System.out.println("Sr(a): " + nomeCliente);
        System.out.println("Numero da Conta Corrente: " + contaCorrente);
        System.out.println("Numero da Agencia Bancaria: " + agencia);
        System.out.println("Valor do saldo atual é de R$" + saldo);
    }
}