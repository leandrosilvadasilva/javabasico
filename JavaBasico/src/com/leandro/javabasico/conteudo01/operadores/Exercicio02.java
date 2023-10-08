package com.leandro.javabasico.conteudo01.operadores;

import java.util.Scanner;

public class Exercicio02 {

	/*
	 * Faça um Programa que peça um número e então mostre a mensagem O número
	 * informado foi [número]
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um número.");
		int num = scan.nextInt();
		System.out.println("O número informado foi: " + num +".");
		
	}
}
