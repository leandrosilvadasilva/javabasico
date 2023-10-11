package com.leandro.javabasico.conteudo01.operadores;

import java.util.Scanner;

public class Exercicio14 {
	/*
	 * Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para
	 * controlar o rendimento di�rio de seu trabalho. 
	 * Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento
	 *  de pesca do estado de 
	 *  S�o Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. Jo�o
	 * precisa que voc� fa�a um programa que leia a vari�vel peso (peso de peixes) e
	 * verifique se h� excesso. Se houver, gravar na vari�vel excesso e na vari�vel
	 * multa o valor da multa que Jo�o dever� pagar. Caso contr�rio mostrar tais
	 * vari�veis com o conte�do ZERO.
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
