package com.leandro.javabasico.conteudo01.operadores;

import java.util.Scanner;

public class Exercicio05 {
	/* Faça um Programa que converta metros para centímetros. */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Programa para converter metros em centímetros!");
		System.out.println("Entre com o valor em METROS:");
		double metros = scan.nextDouble();
		
		//Operação
		double conver = metros * 100;
		
		System.out.println(metros + " metros = " + conver + "cm.");

	}

}
