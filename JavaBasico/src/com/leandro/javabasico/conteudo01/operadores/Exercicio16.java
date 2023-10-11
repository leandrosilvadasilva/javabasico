package com.leandro.javabasico.conteudo01.operadores;

import java.util.Scanner;

public class Exercicio16 {
	/*Faça um programa para uma loja de tintas. O programa deverá pedir o 
	tamanho em metros quadrados da área a ser pintada. Considere que a 
	cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a 
	tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao 
	usuário a quantidades de latas de tinta a serem compradas e o preço 
	total.*/
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da área em metros: ");
		double area = scan.nextDouble();
		
		double quantTinta = area / 3;
		
		System.out.println("Quantidade de tinta necessária em L: " + quantTinta);
		if(quantTinta > 18) {
			double quantLata = quantTinta / 18;
			System.out.println("Voce vai precisar de: " + quantLata + "Latas ");
		}else System.out.println("Voce vai precisar de uma lata de tinta de  18L.");
		
		System.out.println("Custo da lata é de R$ 80,00");
		
	}

}
