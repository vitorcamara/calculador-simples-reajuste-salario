package com.vitorcamara.projetos;

import java.util.Scanner;

class CalculadoraReajusteSalario {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe seu salário: "); 
		double salario = scan.nextDouble();

		if (salario <= 280) {
			double aumento1 = salario * 0.20; //aumento de 20% para quem recebe até 280 reais
			System.out.println("Seu salário atual é: " + salario + " reais");
			System.out.println("Você terá um aumento de 20%, ou seja, " + aumento1 + " reais");
			System.out.println("Seu novo salário é " + (salario + aumento1) + " reais");
		} else if (salario > 280 && salario <= 700) {
			double aumento2 = salario * 0.15; //aumento de 15% para quem recebe mais de 280 até 700 reais
			System.out.println("Seu salário atual é: " + salario + " reais");
			System.out.println("Você terá um aumento de 15%, ou seja, " + aumento2 + " reais");
			System.out.println("Seu novo salário é " + (salario + aumento2) + " reais");
		} else if (salario > 700 && salario <= 1500) {
			double aumento3 = salario * 0.10; //aumento de 10% para quem recebe mais de 700 até 1500 reais
			System.out.println("Seu salário atual é: " + salario + " reais");
			System.out.println("Você terá um aumento de 10%, ou seja, " + aumento3 + " reais");
			System.out.println("Seu novo salário é " + (salario + aumento3) + " reais");
		} else if (salario > 1500) {
			double aumento4 = salario * 0.05;//aumento de 5% para quem recebe mais de 1500 reais
			System.out.println("Seu salário atual é: " + salario + " reais");
			System.out.println("Você terá um aumento de 5%, ou seja, " + aumento4 + " reais");
			System.out.println("Seu novo salário é " + (salario + aumento4) + " reais");
		}

	}
}