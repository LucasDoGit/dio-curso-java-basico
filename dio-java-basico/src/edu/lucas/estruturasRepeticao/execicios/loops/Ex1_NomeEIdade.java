package edu.lucas.estruturasRepeticao.execicios.loops;

import java.util.Scanner;
/*
Aluno: Lucas Thiago Saiz Timoteo
Data: 10/01/2023

Execício 1 - Nome e Idade
- Faça um programa que leia um conjunto de dois valores
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(pare o programa inserindo o valor "0" no campo nome).
*/
public class Ex1_NomeEIdade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // importa o scanner para receber as entradas.
		System.out.println("Execício 1 - Loop Nome e Idade");
	 
        String nome = ""; // variaveis. 
        int idade = 0;
        
        while(true){ // loop verdadeiro ate que nome receba "0".
            System.out.println("Nome: ");
            nome = scan.next(); // variavel nome recebe a entrada do console
            if (nome.equals("0")) break; // sai do loop se a condicao for verdadeira
            System.out.println("idade: ");
            idade = scan.nextInt(); // variavel idade recebe a entrada do console
        }
        scan.close(); // finaliza o scanner
        System.out.println("Fim do programa!");
	}

}
