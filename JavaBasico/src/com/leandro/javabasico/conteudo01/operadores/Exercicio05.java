package com.leandro.javabasico.conteudo01.operadores;

import java.util.Scanner;

public class Exercicio05 {
	/* Fa�a um Programa que converta metros para cent�metros. */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Programa para converter metros em cent�metros!");
		System.out.println("Entre com o valor em METROS:");
		double metros = scan.nextDouble();
		
		//Opera��o
		double conver = metros * 100;
		
		System.out.println(metros + " metros = " + conver + "cm.");

	}

}
