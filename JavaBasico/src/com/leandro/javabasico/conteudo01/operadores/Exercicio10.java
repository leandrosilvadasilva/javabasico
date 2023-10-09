package com.leandro.javabasico.conteudo01.operadores;

import java.util.Scanner;

public class Exercicio10 {
	/*
	 * Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre
	 * em graus Farenheit.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a temperatura em Celsius:");
		double celsius = scan.nextDouble();

		double farenheit = celsius * 1.8 +32;

		System.out.println("A temperatura: " + celsius + " graus Celsius." + " Valor em Farenheit: " + farenheit + " graus");

	}

}
