package com.leandro.javabasico.conteudo01.operadores;

import java.util.Scanner;

public class Exercicio17 {
	/*
	 * Fa�a um Programa para uma loja de tintas. O programa dever� pedir o 
	tamanho em metros quadrados da �rea a ser pintada. Considere que a 
	cobertura da tinta � de 1 litro para cada 6 metros quadrados e que a 
	tinta � vendida em latas de 18 litros, que custam R$ 80,00 ou em 
	gal�es de 3,6 litros, que custam R$ 25,00.
	o Informe ao usu�rio as quantidades de tinta a serem compradas 
	e os respectivos pre�os em 3 situa��es:
	o comprar apenas latas de 18 litros;
	o comprar apenas gal�es de 3,6 litros;
	o misturar latas e gal�es, de forma que o pre�o seja o 
	menor. Acrescente 10% de folga e sempre arredonde os 
	valores para cima, isto �, considere latas cheias.*/
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a �rea em metros: ");
		double area = scan.nextDouble();
		double cobertura = area / 6;
		
		System.out.println("Cobertura: " + cobertura + "Litros");
		
		
			if (cobertura < 18) {
				int numGaloes = (int) (cobertura / 3.6);
				
				System.out.println("Compre: " + numGaloes + " gal�es");
			} if (cobertura >= 18){
				double numGaloes = cobertura / 18;
				System.out.println("Compre: " + numGaloes + " Latas");
			}
			
		
		
	}

}
