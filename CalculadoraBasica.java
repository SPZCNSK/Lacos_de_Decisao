package br.com.generation.aula02;

import java.util.Scanner;

public class CalculadoraBasica {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double numero1;
		double numero2;
		char operacao;
		double resultado = 0.0;
		
		System.out.println("Digite o 1� n�mero: ");
		numero1 = entrada.nextDouble(); //A variavel "numero1" recebe a entrada do tipo double
		
		System.out.println("Digite a opera��o (+,-,* ou /: ");
		operacao = entrada.next().charAt(0); // pega um caractere
		
		System.out.println("Digite o 2� n�mero: ");
		numero2 = entrada.nextDouble();
		
		if (operacao == '+') { //regra: usa-se aspas simples '' para apenas 1 caractere, e aspas duplas " " para uma cadeia string 
			resultado = numero1 + numero2;
		}
		else if (operacao == '-') {
			resultado = numero1 - numero2;
		}
		else if (operacao == '*') {
			resultado = numero1 * numero2;
		}
		else if (operacao == '/') {
			resultado = numero1 / numero2;
		}
		System.out.println("Resultado: " + resultado);
		
		entrada.close();
		
		

	}

}
