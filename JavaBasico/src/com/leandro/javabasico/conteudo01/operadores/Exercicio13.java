package com.leandro.javabasico.conteudo01.operadores;

import java.util.Scanner;

public class Exercicio13 {
	/*
	 * Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um
	 * algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas: .
	 * Para homens: (72.7*h) - 58 a. Para mulheres: (62.1*h) - 44.7 (h = altura) b.
	 * Peça o peso da pessoa e informe se ela está dentro, acima ou abaixo do peso.
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
			System.out.println("Seu peso ideal é: " + resultado);
			break;
			
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " );
		}
	
		System.out.println("Digite seu peso: ");
		double peso = scan.nextDouble();
		if(resultado == peso) {
			System.out.println("Voce está no peso ideal!");
		}if (resultado < peso) {
			System.out.println("Voce está acima do peso ideal!");
		} else {
			System.out.println("Voce está abaixo do peso ideal!");
		}
	}

}
