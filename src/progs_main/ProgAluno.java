package progs_main;

import java.util.Locale;
import java.util.Scanner;

import classes_exemplos_exercicios.Aluno;

public class ProgAluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Aluno aluno = new Aluno();
		
		System.out.print("Nome do aluno: ");
		aluno.nome = sc.nextLine();
		
		System.out.print("Informe as 3 notas: ");
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("Nota Final é: %.2f%n", aluno.somaNotas());
		
		if(aluno.somaNotas() < 60.0) {
			System.out.println("REPROVADO");
			System.out.printf("Faltou %.2f pontos para ser aprovado%n", aluno.faltaPontos());
		}else {
			System.out.println("Parabéns - APROVADO");
		}
		
		sc.close();
	}

}
