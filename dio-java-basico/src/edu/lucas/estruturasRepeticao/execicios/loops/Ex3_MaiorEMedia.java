package edu.lucas.estruturasRepeticao.execicios.loops;

import java.util.Scanner;

/*
Aluno: Lucas Thiago Saiz Timoteo
Data: 11/01/2023

Execício 3 - Maior e Media
- Faça um programa que leia 5 números
e infome o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Atividade - Programa maior e média");
		
		int numero;
		int maior = 0;
		int soma = 0;
		
		int count = 0; // contador
		do {
			System.out.println("Numero: ");
			numero = entrada.nextInt();
			
			soma = soma + numero;
			// System.out.println("Soma: " + soma); //exibe a soma dos números
			if (numero > maior) maior = numero;
			
			count = count + 1;
		} while(count < 5);
		
		System.out.println("Maior: " + maior);
		System.out.println("Média: " + soma/5);
		
		entrada.close();
		System.out.println("Fim do programa!");
	}
}
