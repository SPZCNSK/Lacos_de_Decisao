package br.com.generation.aula02;

import java.util.Scanner;

public class LacoCondicionalEscolhaCaso {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//  || -->> OU em Java , && --> E em Java
		
		double numero1;
		double numero2;
		char operacao;// neste caso o escopo dos casos é determinado a partir desta variável que é char
		double resultado = 0.0;
		
		System.out.println("Digite o 1º número: ");
		numero1 = entrada.nextDouble(); //A variavel "numero1" recebe a entrada do tipo double
		
		System.out.println("Digite a operação (+,-,* ou /: ");
		operacao = entrada.next().charAt(0); // pega um caractere
		
		System.out.println("Digite o 2º número: ");
		numero2 = entrada.nextDouble();
		
		switch(operacao) {//switch inicia a escolha
			case '+'://caso 1
				resultado = numero1 + numero2;
				System.out.println("A soma dos dois números é: " + resultado);
			break;//se for o primeiro caso mostra só o resultado do primeiro caso
			
			case '-':
				resultado = numero1 - numero2;
				System.out.println("A diferença entre os dois números é: " + resultado);
			break;
			
			case '*':
				resultado = numero1 * numero2;
				System.out.println("O produto entre os dois números é: " + resultado);
			break;
			
			case '/':		
				resultado = numero1 / numero2;
				System.out.println("O quociente entre os dois números é: " + resultado);
			break;
			
			default:
				System.out.println("A operação é inválida!");
			break;
		}
		entrada.close();
	}

}
