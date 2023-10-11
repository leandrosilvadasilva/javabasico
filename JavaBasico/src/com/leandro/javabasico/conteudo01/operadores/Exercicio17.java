package com.leandro.javabasico.conteudo01.operadores;

import java.util.Scanner;

public class Exercicio17 {
	/*
	 * Faça um Programa para uma loja de tintas. O programa deverá pedir o 
	tamanho em metros quadrados da área a ser pintada. Considere que a 
	cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a 
	tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em 
	galões de 3,6 litros, que custam R$ 25,00.
	o Informe ao usuário as quantidades de tinta a serem compradas 
	e os respectivos preços em 3 situações:
	o comprar apenas latas de 18 litros;
	o comprar apenas galões de 3,6 litros;
	o misturar latas e galões, de forma que o preço seja o 
	menor. Acrescente 10% de folga e sempre arredonde os 
	valores para cima, isto é, considere latas cheias.*/
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a área em metros: ");
		double area = scan.nextDouble();
		double cobertura = area / 6;
		
		System.out.println("Cobertura: " + cobertura + "Litros");
		
		
			if (cobertura < 18) {
				int numGaloes = (int) (cobertura / 3.6);
				
				System.out.println("Compre: " + numGaloes + " galões");
			} if (cobertura >= 18){
				double numGaloes = cobertura / 18;
				System.out.println("Compre: " + numGaloes + " Latas");
			}
			
		
		
	}

}
