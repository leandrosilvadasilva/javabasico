package com.leandro.javabasico.conteudo01.operadores;

import java.util.Scanner;

public class Exercicio02 {

	/*
	 * Fa�a um Programa que pe�a um n�mero e ent�o mostre a mensagem O n�mero
	 * informado foi [n�mero]
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um n�mero.");
		int num = scan.nextInt();
		System.out.println("O n�mero informado foi: " + num +".");
		
	}
}
