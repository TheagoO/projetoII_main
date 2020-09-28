package progs_main;

import java.util.Scanner;

public class Equação {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Valor de A");
		double a = scan.nextDouble();
		System.out.println("Valor de B");
		double b = scan.nextDouble();
		System.out.println("Valor de C");
		double c = scan.nextDouble();
		
		System.out.println("Equação: "+a+"x² "+b+"x "+c);
		
		
		double part = Math.pow(b, 2);
		double segpar = (-4*(a*c));
		
		double delta = part+segpar;
		
		double x1;
		double x2;
		
		x1 = -b+Math.sqrt(delta);
		x2 = -b-Math.sqrt(delta);
		
		x1 = x1/(2*a);
		x2 = x2/(2*a);
	
		System.out.println("x1: "+x1);
		System.out.println("x2: "+x2);
		
		double media = (x1+x2)/6;
		
		System.out.println("A média do x: "+ media);
		
		scan.close();
	}

}
