package com.leandro.javabasico.conteudo01.operadores;

import java.util.Scanner;

public class Exercicio16 {
	/*Fa�a um programa para uma loja de tintas. O programa dever� pedir o 
	tamanho em metros quadrados da �rea a ser pintada. Considere que a 
	cobertura da tinta � de 1 litro para cada 3 metros quadrados e que a 
	tinta � vendida em latas de 18 litros, que custam R$ 80,00. Informe ao 
	usu�rio a quantidades de latas de tinta a serem compradas e o pre�o 
	total.*/
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da �rea em metros: ");
		double area = scan.nextDouble();
		
		double quantTinta = area / 3;
		
		System.out.println("Quantidade de tinta necess�ria em L: " + quantTinta);
		if(quantTinta > 18) {
			double quantLata = quantTinta / 18;
			System.out.println("Voce vai precisar de: " + quantLata + "Latas ");
		}else System.out.println("Voce vai precisar de uma lata de tinta de  18L.");
		
		System.out.println("Custo da lata � de R$ 80,00");
		
	}

}
