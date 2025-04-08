package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Conta;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		Conta conta;
		
		System.out.print("Digite o numero da conta: ");
		int numero = sc.nextInt();
		System.out.print("Digite o nome do titular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Havera deposito inicial (y/n)?: ");
		char response = sc.next().charAt(0);
		if(response == 'y') {
			System.out.print("Entre com deposito inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, titular, depositoInicial);
		}
		else {
			conta = new Conta(numero, titular);
		}
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Entre com valor do deposito: ");
		double depositValue = sc.nextDouble();
		conta.deposito(depositValue);
		System.out.println("Dados de conta atualizados:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Entre com valor de saque: ");
		double saque = sc.nextDouble();
		conta.saque(saque);
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		
		
		
		sc.close();

	}

}
