package br.com.generation.aula02;

import java.util.Scanner;

public class LacoCondicional {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Informe a primeira nota: ");
		nota1 = entrada.nextDouble();
		
		System.out.println("Informe a segunda nota: ");
		nota2 = entrada.nextDouble();
		
		media = (nota1 + nota2) / 2;
				
		if(media >= 6.0 && media <=10) {
			System.out.println("\nAprovado!" + " M�dia: " + media);			
		}
		else if (media >= 3.0 && media < 6.0) {//&& ==> "e"
			System.out.println("\nRecupera��o!"+ " M�dia: " + media);
		}
		else if (media >= 0.0 && media < 3.0){
			System.out.println("\nReprovado!" + " M�dia: " + media);
		}
		else {
			System.out.println("Valor inv�lido! Insira um valor maior que zero e menor que  10");
		}
		entrada.close();		
	}

}
