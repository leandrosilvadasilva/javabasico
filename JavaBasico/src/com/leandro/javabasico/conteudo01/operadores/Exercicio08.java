package com.leandro.javabasico.conteudo01.operadores;

import java.util.Scanner;

public class Exercicio08 {

	/*
	 * Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas
	 * trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no referido m�s.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto voc� ganha por hora?");
		double ganhoHora = scan.nextDouble();
		System.out.println("Quantas horas voc� trabalha no m�s?");
		double horasTrabalhadas = scan.nextDouble();
		
		double salario = ganhoHora * horasTrabalhadas;
		System.out.println("Seu sal�rio �: " + salario);
	}

}
