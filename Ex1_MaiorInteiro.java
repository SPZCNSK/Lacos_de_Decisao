package br.com.generation.aula02;

import java.util.Scanner;

public class Ex1_MaiorInteiro {

	public static void main(String[] args) {
		int n1, n2, n3;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("= Escreva tr�s n�meros inteiros e saiba qual � o maior entre eles =");
		System.out.println("Digite o 1� n�mero: ");
		n1 = entrada.nextInt();
		
		System.out.println("Digite o 2� n�mero: ");
		n2 = entrada.nextInt();
		
		System.out.println("Digite o 3� n�mero: ");
		n3 = entrada.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			System.out.println("O n�mero " + n1 + " � o maior n�mero digitado.");
		}
		
		else if (n2 > n1 && n2 > n3) {
			System.out.println("O n�mero " + n2 + " � o maior n�mero digitado.");
		}
		
		else if (n3 > n1 && n3 > n2) {
			System.out.println("O n�mero " + n3 + " � o maior n�mero digitado.");
		}
				
		entrada.close();

	}

}
