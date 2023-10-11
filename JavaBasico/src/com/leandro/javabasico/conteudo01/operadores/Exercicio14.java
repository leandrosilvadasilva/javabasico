package com.leandro.javabasico.conteudo01.operadores;

import java.util.Scanner;

public class Exercicio14 {
	/*
	 * João Papo-de-Pescador, homem de bem, comprou um microcomputador para
	 * controlar o rendimento diário de seu trabalho. 
	 * Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento
	 *  de pesca do estado de 
	 *  São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João
	 * precisa que você faça um programa que leia a variável peso (peso de peixes) e
	 * verifique se há excesso. Se houver, gravar na variável excesso e na variável
	 * multa o valor da multa que João deverá pagar. Caso contrário mostrar tais
	 * variáveis com o conteúdo ZERO.
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digte a quantidade de peso dos peixes: ");
		double pesoPeixe = scan.nextDouble();
		
		if(pesoPeixe > 50) {
			System.out.println("Peso excedido!");
			double excesso = pesoPeixe - 50;
			double multa = excesso * 4;
			System.out.println("Multa aplicada no valor de: " + "R$ " + multa);
		}else System.out.println("Peso dentro do limite da lei.");

	}

}
