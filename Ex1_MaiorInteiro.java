package br.com.generation.aula02;

import java.util.Scanner;

public class Ex1_MaiorInteiro {

	public static void main(String[] args) {
		int n1, n2, n3;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("= Escreva três números inteiros e saiba qual é o maior entre eles =");
		System.out.println("Digite o 1º número: ");
		n1 = entrada.nextInt();
		
		System.out.println("Digite o 2º número: ");
		n2 = entrada.nextInt();
		
		System.out.println("Digite o 3º número: ");
		n3 = entrada.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			System.out.println("O número " + n1 + " é o maior número digitado.");
		}
		
		else if (n2 > n1 && n2 > n3) {
			System.out.println("O número " + n2 + " é o maior número digitado.");
		}
		
		else if (n3 > n1 && n3 > n2) {
			System.out.println("O número " + n3 + " é o maior número digitado.");
		}
				
		entrada.close();

	}

}
