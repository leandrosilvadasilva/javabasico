package com.leandro.javabasico.conteudo01.operadores;

import java.util.Scanner;

public class Exercicio12 {
	/*
	 * Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que
	 * calcule seu peso ideal, usando a seguinte f�rmula: (72.7*altura) - 58
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("Seu peso ideal �: " + pesoIdeal + "kg.");
	}

}
