package progs_main;

import java.util.Locale;
import java.util.Scanner;

import classes_exemplos_exercicios.ConverterMoeda;

public class ProgConversao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		ConverterMoeda convert = new ConverterMoeda();
		
		System.out.println("Qual � a cota��o atual do d�lar ?");
		convert.cota = sc.nextDouble();
		
		System.out.println("Quantos d�lares deseja comprar ?");
		convert.dolar = sc.nextDouble();
		
		System.out.println("O montante a ser pago em reais �: " + convert.cotacao());
		
		sc.close();
	}

}
