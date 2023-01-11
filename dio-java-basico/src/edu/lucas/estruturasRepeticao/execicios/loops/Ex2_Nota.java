package edu.lucas.estruturasRepeticao.execicios.loops;

import java.util.Scanner;

/*
Aluno: Lucas Thiago Saiz Timoteo
Data: 11/01/2023

Execício 2 - Nota
- Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/
public class Ex2_Nota {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Atividade nota");
		
		int nota; // variável que receber a nota
	
		System.out.print("Digite uma nota entre 0 e 10: "); // imprime no console e recebe a nota
		nota = entrada.nextInt();
		
		while(nota < 0 | nota > 10) { // enquanto nota não estiver entre 0 e 10. Pede nota novamente.
			System.out.println("Nota Inválida! Digite novamente");
			nota = entrada.nextInt();
		}
		
		/* Segundo maneira para utilizar o while
		while(true){
			System.out.println("Digite uma nota entre zero e dez: "); // recebe a nota do usuário
			nota = entrada.nextInt(); 
			if (nota > 0 && nota < 10) break; // caso a nota esteja entre 0 e 10 sai do loop 
			System.out.println("Nota inválida! Digite novamente."); // continua pedindo até que o if acima seja verdadeiro.
		}*/
		
		entrada.close();
		System.out.println("Fim do programa!");
	}

}
