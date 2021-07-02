package br.com.generation.aula02;

import java.util.Scanner;

public class Ex4_ParImparQuadrado {

	public static void main(String[] args) {
		
		Scanner escreva = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Digite um numero qualquer: ");
		numero = escreva.nextDouble();
		
		if(numero % 2 == 0) {
		System.out.println("O número é par e a raíz quadrada de '" + numero + "' é: " + Math.sqrt(numero));	
		}
		else {
			System.out.println("O número é impar e '" + numero +"' elevado ao quadrado é: " + Math.pow(numero, 2));
		}
		
		escreva.close();

	}

}
