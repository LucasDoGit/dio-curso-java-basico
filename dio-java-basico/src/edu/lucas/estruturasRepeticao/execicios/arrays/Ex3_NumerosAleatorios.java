package edu.lucas.estruturasRepeticao.execicios.arrays;

import java.util.Random;
import java.util.Scanner;
/*
Aluno: Lucas Thiago Saiz Timoteo
Data: 13/01/2023

Atividade 3 (Arrays) - Números Aleatórios
- Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final monstre os números e seus sucessores.
*/
public class Ex3_NumerosAleatorios {

	public static void main(String[] args) {
		Random random = new Random(); // importa classe random
		System.out.println("Atividade 3 (Arrays) - Números Aleatórios");
		
		int[] numerosAleatorios = new int[20]; // array com 20 posicoes para guardar números aleatórios
		
		for(int i = 0; i < numerosAleatorios.length; i++) { // gera numeros aleatórios até chegar a ultima posição do array
			int numero = random.nextInt(100);
			numerosAleatorios[i] = numero; // cada posicação recebe um número aleatório
		}
		
		System.out.println("Números aleatórios: "); // variável recebe cada número aleatório e imprime
		for (int numero : numerosAleatorios) { 
			System.out.print(numero + " ");
		}
 		
		System.out.println("\nSucessores números aleatórios: "); // variável recebe cada sucessor dos números aleatório e imprime
		for (int numero : numerosAleatorios) {
			System.out.print((numero+1) + " ");
		}
		
		System.out.println("\nFinal do programa!");
	}

}
