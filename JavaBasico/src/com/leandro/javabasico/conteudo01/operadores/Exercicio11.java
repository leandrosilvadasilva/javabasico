package com.leandro.javabasico.conteudo01.operadores;

import java.util.Scanner;

public class Exercicio11 {
	/*
	 * Fa�a um Programa que pe�a 2 n�meros inteiros e um n�mero real. Calcule e
	 * mostre: a. o produto do dobro do primeiro com metade do segundo . b. a soma
	 * do triplo do primeiro com o terceiro. c. o terceiro elevado ao cubo
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero inteiro:");
		int num1 = scan.nextInt();
		System.out.println("Digite o segundo n�mero inteiro:");
		int num2 = scan.nextInt();
		System.out.println("Digite um n�mero real:");
		double real = scan.nextDouble();

		System.out.println("C�lculos:");
		System.out.println("A: o produto do dobro do primeiro com metade do segundo: ");
		System.out.println("Primeiro n�mero: " + num1);
		System.out.println("Segundo n�mero: " + num2);
		System.out.println("N�mero real : " + real);

		System.out.println("Resultado de A: ");
		double produto = Math.pow(num1, 2) + (num2 / 2);
		System.out.println(produto);

		System.out.println(" ******* *************  *****************");

		System.out.println("B: a soma do triplo do primeiro com o terceiro: ");
		System.out.println("Primeiro n�mero: " + num1);
		System.out.println("Segundo n�mero: " + num2);
		System.out.println("N�mero real : " + real);

		System.out.println("Resultado de B: ");
		double resultadoB = (num1 * 3) + real;
		System.out.println(resultadoB);

		System.out.println(" ******* *************  *****************");

		System.out.println("C: o terceiro elevado ao cubo: ");
		System.out.println("Primeiro n�mero: " + num1);
		System.out.println("Segundo n�mero: " + num2);
		System.out.println("N�mero real : " + real);

		System.out.println("Resultado de C: ");
		double resultadoC = Math.pow(real, 3);
		System.out.println(resultadoC);
	}

}
