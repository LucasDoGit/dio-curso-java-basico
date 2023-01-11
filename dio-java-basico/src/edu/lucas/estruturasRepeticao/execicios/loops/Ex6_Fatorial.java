package edu.lucas.estruturasRepeticao.execicios.loops;

import java.util.Scanner;

/*
Aluno: Lucas Thiago Saiz Timoteo
Data: 11/01/2023

Execício 6 - Fatorial
- Faça um programa que calcule o fatorial de um número fornecido pelo usuário.
Ex.: 5!= 120
*/
public class Ex6_Fatorial {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); // importa o scanner.
		System.out.println("Atividade - Fatorial");
		
		System.out.println("Fatorial: "); // recebe o numero fatorial.
		int fatorial = entrada.nextInt();
		
		int multilicação = 1; // inicializa a variavel para guardar a multiplicacao do fatorial.
		
		System.out.print(fatorial +"!= "); // exibe o número fatorial.
		for (int i = fatorial; i >= 1; i--) { // recebe o fatorial e diminui ate chegar em 1.
			multilicação = multilicação * i; // guarda a multiplicacao do fatorial.
		}
		
		System.out.println(multilicação); // exibe o resultado do fatorial.
		entrada.close();
		System.out.println("Fim do programa!");
	}

}
