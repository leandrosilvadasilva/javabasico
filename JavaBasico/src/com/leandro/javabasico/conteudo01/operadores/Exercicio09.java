package com.leandro.javabasico.conteudo01.operadores;

import java.util.Scanner;

public class Exercicio09 {
	/*
	 * Faça um Programa que peça a temperatura em graus Farenheit, transforme e
	 * mostre a temperatura em graus Celsius. o C = (5 * (F-32) / 9).
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatua em Farenheit: ");
		double farenheit = scan.nextDouble();
		
		double celsius = (5 * (farenheit-32) / 9);
		
		System.out.println("Temperatua em Celsius: " + celsius);
		
		
	}

}
