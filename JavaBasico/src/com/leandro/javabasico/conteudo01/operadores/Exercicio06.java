package com.leandro.javabasico.conteudo01.operadores;

import java.util.Scanner;

public class Exercicio06 {
	/*
	 * Faça um Programa que peça o raio de um círculo, calcule e mostre sua área
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o raio do círculo");
		
		double raio = scan.nextDouble();
		
		// Operação
		
		double area = Math.PI * (raio * raio);
		
		System.out.println("O valor da área do círulo é: " + area);
		

	}

}
