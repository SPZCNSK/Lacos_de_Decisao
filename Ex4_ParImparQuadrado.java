package br.com.generation.aula02;

import java.util.Scanner;

public class Ex4_ParImparQuadrado {

	public static void main(String[] args) {
		
		Scanner escreva = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Digite um numero qualquer: ");
		numero = escreva.nextDouble();
		
		if(numero % 2 == 0) {
		System.out.println("O n�mero � par e a ra�z quadrada de '" + numero + "' �: " + Math.sqrt(numero));	
		}
		else {
			System.out.println("O n�mero � impar e '" + numero +"' elevado ao quadrado �: " + Math.pow(numero, 2));
		}
		
		escreva.close();

	}

}
