package progs_main;

import java.util.Locale;
import java.util.Scanner;

import classes_exemplos_exercicios.Cliente;



public class ProgBanco {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		
		System.out.printf("Entre com o número da conta: ");
		int conta = scan.nextInt();

		System.out.printf("Digite o nome do correntista: ");
		String nome = scan.next();
		nome = nome.trim();
		
		System.out.println("Há deposito inicial ? S/N");
		String opcao = scan.next();
		opcao = opcao.toLowerCase();
		opcao = opcao.trim();
		
		Cliente cliente = new Cliente(conta, nome);
		
		int retorno = 0;		
		
		do {
			if(opcao.equals("s") || opcao.equals("sim")) {
				
				System.out.printf("Informe o valor do depósito: ");
				double valor = scan.nextDouble();
				cliente.setSaldo(valor);
				retorno = 1;
			}else if(opcao.equals("n") || opcao.equals("nao") || opcao.equals("não")){
				retorno = 1;		
			}else {
				System.out.println("Opcão inválida!");
			}
		}while(retorno == 0);
		
		System.out.printf(cliente.toString());
		int op = 0;
		do {
			do {
				System.out.println("\n1-Saque  |  2-Deposito  |  3-Mudar nome  |  4-Sair");
				op = scan.nextInt();
			}while(op != 1 && op != 2 && op != 3 && op != 4);
			
			if(op == 1) {
				System.out.printf("Informe o valor do saque: ");
				double saque = scan.nextDouble();
				cliente.saque(saque);
				System.out.printf(cliente.toString());
			}else if(op == 2){
				System.out.printf("Informe o valor do novo deposito: ");
				double deposito = scan.nextDouble();
				cliente.deposito(deposito);
				System.out.printf(cliente.toString());
			}else if(op == 3){
				System.out.printf("Novo nome: ");
				nome = scan.next();
				cliente.setNome(nome);
				System.out.printf(cliente.toString());
			}else {
				
			}
		}while(op != 4);
		
		
		scan.close();
	}

}
