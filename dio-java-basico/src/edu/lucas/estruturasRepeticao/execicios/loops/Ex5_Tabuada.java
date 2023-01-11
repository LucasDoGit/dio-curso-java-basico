package edu.lucas.estruturasRepeticao.execicios.loops;

import java.util.Scanner;

/*
Aluno: Lucas Thiago Saiz Timoteo
Data: 11/01/2023

Execício 5 - Tabuada
- Desenvolva um gerador de tabuada, 
capaz de gerar a tabuada de qualquer numero entre 1 e 10.
O usuário deve informar qual número ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada de 5: 
5 X 1 = 5
5 x 2 = 10
...
5 x 10 = 50
*/
public class Ex5_Tabuada {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); // importa o scanner 
		System.out.println("Atividade - Tabuada");
		
		int tabuada; // variavel
		
		System.out.println("Tabuada: "); // recebe qual tabuada deve ser calculada
		tabuada = entrada.nextInt();
		
		while (tabuada < 0 | tabuada > 10) { // verifica se a tabuada está entre 0 e 10.
			System.out.println("Número inválido! Digite novamente"); // pede o valor valido
			tabuada = entrada.nextInt();
		}
		System.out.println("Tabuada de: " + tabuada); // exibe a tabuada a ser calculada
		 
		for(int i = 1; i <= 10; i++) { // multiplica a tabuada de 1 ate 10 e mostra no console.
			System.out.println(tabuada + " X " + i +" = "+ (tabuada*i));
		}
		
		entrada.close();
		System.out.print("Fim do programa!");
	}

}
