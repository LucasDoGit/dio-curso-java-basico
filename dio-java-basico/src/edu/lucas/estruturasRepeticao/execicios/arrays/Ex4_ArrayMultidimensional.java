package edu.lucas.estruturasRepeticao.execicios.arrays;
/*
Aluno: Lucas Thiago Saiz Timoteo
Data: 13/01/2023

Atividade 4 (Arrays) - Array Multidimensional
- Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/

import java.util.Random;

public class Ex4_ArrayMultidimensional {

	public static void main(String[] args) {
		Random random = new Random(); // importa classe random	
		System.out.println("Atividade 4 (Arrays) - Array Multidimensional");
		
		int[][] M = new int[4][4]; // array multidimensional com 4 posições de linha e coluna
		
		System.out.println("Matriz: ");
		for (int i = 0; i < M.length; i++) { // gera um numero aletório entre 0 - 9 nas posições da linha e coluna
			for (int j = 0; j < M[i].length; j++) { // elemento da coluna
				M[i][j] = random.nextInt(9); // gera os números aleatórios
			}
			
		}
		for (int[] linha : M) { // exibe o números aletórios que foram gerados
			for (int coluna: linha) {
				System.out.print(coluna + " ");
			}
			System.out.println();
		}
		
		System.out.println("Fim do programa!");
	}

}
