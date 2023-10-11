package com.leandro.javabasico.conteudo01.operadores;

import java.util.Scanner;

public class Exercicio15 {

	/*Faça um Programa que pergunte quanto você ganha por hora e o 
	número de horas trabalhadas no mês. Calcule e mostre o total do seu 
	salário no referido mês, sabendo-se que são descontados 11% para o 
	Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um 
	programa que nos dê:
	. salário bruto.
	a. quanto pagou ao INSS.
	b. quanto pagou ao sindicato.
	c. o salário líquido.
	d. calcule os descontos e o salário líquido, conforme a tabela 
	abaixo:
	+ Salário Bruto : R$ - IR (11%) : R$ - INSS 
	(8%) : R$ - Sindicato ( 5%) : R$ = Salário
	Liquido : R$
	Obs.: Salário Bruto - Descontos = Salário Líquido*/
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite quanto você ganha por hora: ");
		double ganhoHora = scan.nextDouble();
		
		System.out.print("Digite quantas horas voce trabalha no mês: ");
		double horasMes = scan.nextDouble();
		
		double salarioTotal = ganhoHora * horasMes;
		
		System.out.println("Salário Bruto: R$ " + salarioTotal);
		System.out.println("***** ************** ******");
		double descontoInss = salarioTotal * 0.08;
		System.out.println("Desconto INSS: R$ " + descontoInss);
		double descontoIr = salarioTotal * 0.11;
		System.out.println("Desconto Imposto de renda: R$ " + descontoIr);
		double descontoSindicato = salarioTotal * 0.05;
		System.out.println("Desconto Sindicado: R$ " + descontoSindicato);
		System.out.println("***** ************** ******");
		double salarioLiquido = salarioTotal - (descontoInss + descontoIr + descontoSindicato);
		System.out.println("Salário Líquido: R$ " + salarioLiquido);
		
	}

}
