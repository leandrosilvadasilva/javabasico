package com.leandro.javabasico.conteudo01.operadores;

import java.util.Scanner;

public class Exercicio15 {

	/*Fa�a um Programa que pergunte quanto voc� ganha por hora e o 
	n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu 
	sal�rio no referido m�s, sabendo-se que s�o descontados 11% para o 
	Imposto de Renda, 8% para o INSS e 5% para o sindicato, fa�a um 
	programa que nos d�:
	. sal�rio bruto.
	a. quanto pagou ao INSS.
	b. quanto pagou ao sindicato.
	c. o sal�rio l�quido.
	d. calcule os descontos e o sal�rio l�quido, conforme a tabela 
	abaixo:
	+ Sal�rio Bruto : R$ - IR (11%) : R$ - INSS 
	(8%) : R$ - Sindicato ( 5%) : R$ = Sal�rio
	Liquido : R$
	Obs.: Sal�rio Bruto - Descontos = Sal�rio L�quido*/
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite quanto voc� ganha por hora: ");
		double ganhoHora = scan.nextDouble();
		
		System.out.print("Digite quantas horas voce trabalha no m�s: ");
		double horasMes = scan.nextDouble();
		
		double salarioTotal = ganhoHora * horasMes;
		
		System.out.println("Sal�rio Bruto: R$ " + salarioTotal);
		System.out.println("***** ************** ******");
		double descontoInss = salarioTotal * 0.08;
		System.out.println("Desconto INSS: R$ " + descontoInss);
		double descontoIr = salarioTotal * 0.11;
		System.out.println("Desconto Imposto de renda: R$ " + descontoIr);
		double descontoSindicato = salarioTotal * 0.05;
		System.out.println("Desconto Sindicado: R$ " + descontoSindicato);
		System.out.println("***** ************** ******");
		double salarioLiquido = salarioTotal - (descontoInss + descontoIr + descontoSindicato);
		System.out.println("Sal�rio L�quido: R$ " + salarioLiquido);
		
	}

}
