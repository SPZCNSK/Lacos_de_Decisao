package br.com.generation.aula02;

import java.util.Scanner;

public class Ex2_OrdemCrescente {

	public static void main(String[] args) {
		
		Scanner escreva = new Scanner(System.in);
		double n1, n2, n3;
		
		System.out.println("= Ordenador de números =");
		
		System.out.println("\nDigite o 1º número: ");
		n1 = escreva.nextDouble();
		
		System.out.println("Digite o 2º número: ");
		n2 = escreva.nextDouble();
		
		System.out.println("Digitet o 3º número: ");
		n3 = escreva.nextDouble();
		
		if(n1 < n2 && n1 < n3 && n2 < n3) {
			System.out.println("Em ordem: " + n1 + " , " + n2 + " , " + n3);			
		}
		else if(n1 < n2 && n1 < n3 && n3 < n2) {
			System.out.println("Em ordem: " + n1 + " , " + n3 + " , " + n2);			
		}
		
		else if (n2 < n1 && n2 < n3 && n1 < n3) {
			System.out.println("Em ordem: " + n2 + " , " + n1 + " , " + n3);			
		}
		else if (n2 < n1 && n2 < n3 && n3 < n1) {
			System.out.println("Em ordem: " + n2 + " , " + n3 + " , " + n1);
		}
		
		else if (n3 < n1 && n3 < n2 && n1 < n2) {
			System.out.println("Em ordem: " + n3 + " , " +  n1 + " , " + n2);
		}
		else if (n3 < n1 && n3 < n2 && n2 < n1) {
			System.out.println("Em ordem: " + n3 + " , " +  n2 + " , " + n1);
		}
		escreva.close();
	}
}



