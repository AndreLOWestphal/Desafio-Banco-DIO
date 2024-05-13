package com.banco;
import java.util.Scanner;
import java.util.Locale;


public class BancoTerminal {
    public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("De acordo com a mensagem de texto enviada via SMS, iremos solicitar os dados para preencher via terminal.");
    System.out.println("Digite seu primeiro nome: ");
    String nome = scanner.next();

    System.out.println("Digite o numero da sua Agência: ");
    String agencia = scanner.next();

    System.out.println("Digite o numero da conta bancária: ");
    int numero = scanner.nextInt();

    System.out.println("Digite o valor do deposito para abrir a conta: ");
    double saldo = scanner.nextDouble();

    System.out.println("Olá " +nome+ ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+ ", conta " +numero+ " e seu saldo R$" +saldo+ " já está disponivel para saque.");
    
    }
}  
