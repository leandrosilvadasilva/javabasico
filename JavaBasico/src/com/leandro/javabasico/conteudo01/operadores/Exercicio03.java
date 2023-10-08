package com.leandro.javabasico.conteudo01.operadores;

import java.util.Scanner;

public class Exercicio03 {

	/* Faça um Programa que peça dois números e imprima a soma. */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int num1 = scan.nextInt();
		System.out.println("Digite o segundo número: ");
		int num2 = scan.nextInt();
		
		double soma = num1 + num2;
		
		System.out.println("A soma dos dois números é: " + soma);

	}

}
