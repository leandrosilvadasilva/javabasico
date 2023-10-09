package com.leandro.javabasico.conteudo01.operadores;

import java.util.Scanner;

public class Exercicio13 {
	/*
	 * Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um
	 * algoritmo que calcule seu peso ideal, utilizando as seguintes f�rmulas: .
	 * Para homens: (72.7*h) - 58 a. Para mulheres: (62.1*h) - 44.7 (h = altura) b.
	 * Pe�a o peso da pessoa e informe se ela est� dentro, acima ou abaixo do peso.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();

		System.out.println("Digite seu sexo (1 = H ou 2 = M): ");
		int sexo = scan.nextInt();
		
		double resultado = 0;
		
		switch (sexo) {
		case 1: {
			resultado = (72.7 * altura) - 58;

		}
		case 2: {
			resultado = (62.1* altura) - 44.7;
		}case 3:{
			System.out.println("Seu peso ideal �: " + resultado);
			break;
			
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " );
		}
	
		System.out.println("Digite seu peso: ");
		double peso = scan.nextDouble();
		if(resultado == peso) {
			System.out.println("Voce est� no peso ideal!");
		}if (resultado < peso) {
			System.out.println("Voce est� acima do peso ideal!");
		} else {
			System.out.println("Voce est� abaixo do peso ideal!");
		}
	}

}
