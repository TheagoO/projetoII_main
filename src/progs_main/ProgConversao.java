package progs_main;

import java.util.Locale;
import java.util.Scanner;

import classes_exemplos_exercicios.ConverterMoeda;

public class ProgConversao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		ConverterMoeda convert = new ConverterMoeda();
		
		System.out.println("Qual é a cotação atual do dólar ?");
		convert.cota = sc.nextDouble();
		
		System.out.println("Quantos dólares deseja comprar ?");
		convert.dolar = sc.nextDouble();
		
		System.out.println("O montante a ser pago em reais é: " + convert.cotacao());
		
		sc.close();
	}

}
