package com.leandro.javabasico.conteudo01.operadores;

import java.util.Scanner;

public class Exercicio07 {
	/*
	 * Fa�a um Programa que calcule a �rea de um quadrado, em seguida mostre o dobro
	 * desta �rea para o usu�rio.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor do lado do quadrado: ");
		double lado = scan.nextDouble();
		
		double areaQuadrado = Math.pow(lado, 2);
		
		System.out.println("O valor da �rea do quadrado � " + areaQuadrado);
		
		double dobroArea = areaQuadrado * 2;
		
		System.out.println("O valor do dobro da �rea do quadrado � " + dobroArea);

	}

}
