package com.leandro.javabasico.conteudo01.operadores;

import java.util.Scanner;

public class Exercicio06 {
	/*
	 * Fa�a um Programa que pe�a o raio de um c�rculo, calcule e mostre sua �rea
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o raio do c�rculo");
		
		double raio = scan.nextDouble();
		
		// Opera��o
		
		double area = Math.PI * (raio * raio);
		
		System.out.println("O valor da �rea do c�rulo �: " + area);
		

	}

}
