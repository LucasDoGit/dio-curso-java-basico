package edu.lucas.estruturasRepeticao.execicios.loops;

import java.util.Scanner;

/*
Aluno: Lucas Thiago Saiz Timoteo
Data: 11/01/2023

Execício 4 - Par e Impar
- Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares 
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {

	public static void main(String[] args) {
		System.out.println("Atividade Par e Impar.");
		
		Scanner entrada = new Scanner(System.in); // importa o scanner
		
		int quantidadeNumeros; // variaveis
		int numero;
		int quantPares = 0, quantImpares = 0;


		System.out.println("Quantidade de números: "); // recebe a quantidade de numeros a serem recebidos
		quantidadeNumeros = entrada.nextInt();
		
		int count = 0; // contador do loop
		do {
			System.out.println("Numero: "); // recebe os numeros
			numero = entrada.nextInt();
			
			// testa se o numero é par ou impar e soma a quantidade
			if (numero % 2 == 0) quantPares++; // se numero divisível por 2 e com resto 0 é par.
			else quantImpares++;
			
			count++; // incrementa 1 no contador
		} while (count < quantidadeNumeros);
		
		System.out.println("Quantidade de números pares: " + quantPares);// exibe os resultados
		System.out.println("Quantidade de números impares: " + quantImpares);
		
		entrada.close();
		System.out.println("Fim do programa!");
	}
}
