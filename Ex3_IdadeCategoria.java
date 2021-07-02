//Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual
//categoria ela se encontra:
//10-14 infantil / 15-17 juvenil / 18-25 adulto

//Autor Juan Sapiezcinski
//Data 02/07/2021
package br.com.generation.aula02;

import java.util.Scanner;

public class Ex3_IdadeCategoria {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade;	
				
		System.out.println("Insira sua idade e descubra sua categoria: ");
		idade = entrada.nextInt();
		
		if(idade <=0) {
			System.out.println("Valor inv�lido, come�e novamente");
		}
		else if(idade <= 14) {
			System.out.println("Sua categoria �: Infantil");
		}
		else if (idade <= 17) {
			System.out.println("Sua categoria �: Juvenil");
		}
		else if (idade <= 25) {
			System.out.println("Sua categoria �: Adulto");
		}
		else {
			System.out.println("Sua categoria �: S�nior");
		}
		
		entrada.close();

	}

}
