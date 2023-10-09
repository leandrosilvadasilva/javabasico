package com.leandro.javabasico.conteudo01.operadores;

import java.util.Scanner;

public class Exercicio08 {

	/*
	 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas
	 * trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora?");
		double ganhoHora = scan.nextDouble();
		System.out.println("Quantas horas você trabalha no mês?");
		double horasTrabalhadas = scan.nextDouble();
		
		double salario = ganhoHora * horasTrabalhadas;
		System.out.println("Seu salário é: " + salario);
	}

}
