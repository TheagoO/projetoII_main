package progs_main;

import java.util.Scanner;

import banco.dados.Banco;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Banco banco = new Banco();
		
		System.out.println(banco.Read());
		
	
		sc.close();
	}

}
