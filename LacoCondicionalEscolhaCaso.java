package br.com.generation.aula02;

import java.util.Scanner;

public class LacoCondicionalEscolhaCaso {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//  || -->> OU em Java , && --> E em Java
		
		double numero1;
		double numero2;
		char operacao;// neste caso o escopo dos casos � determinado a partir desta vari�vel que � char
		double resultado = 0.0;
		
		System.out.println("Digite o 1� n�mero: ");
		numero1 = entrada.nextDouble(); //A variavel "numero1" recebe a entrada do tipo double
		
		System.out.println("Digite a opera��o (+,-,* ou /: ");
		operacao = entrada.next().charAt(0); // pega um caractere
		
		System.out.println("Digite o 2� n�mero: ");
		numero2 = entrada.nextDouble();
		
		switch(operacao) {//switch inicia a escolha
			case '+'://caso 1
				resultado = numero1 + numero2;
				System.out.println("A soma dos dois n�meros �: " + resultado);
			break;//se for o primeiro caso mostra s� o resultado do primeiro caso
			
			case '-':
				resultado = numero1 - numero2;
				System.out.println("A diferen�a entre os dois n�meros �: " + resultado);
			break;
			
			case '*':
				resultado = numero1 * numero2;
				System.out.println("O produto entre os dois n�meros �: " + resultado);
			break;
			
			case '/':		
				resultado = numero1 / numero2;
				System.out.println("O quociente entre os dois n�meros �: " + resultado);
			break;
			
			default:
				System.out.println("A opera��o � inv�lida!");
			break;
		}
		entrada.close();
	}

}
