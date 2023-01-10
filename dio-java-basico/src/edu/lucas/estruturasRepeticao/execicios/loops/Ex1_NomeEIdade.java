package edu.lucas.estruturasRepeticao.execicios.loops;

import java.util.Scanner;
/*
Aluno: Lucas Thiago Saiz Timoteo
Data: 10/01/2023

Execício Nome e Idade - Loops (While)
*/
public class Ex1_NomeEIdade {

	public static void main(String[] args) {
		System.out.println("Execício 1 - Loop Nome e Idade");
		Scanner scan = new Scanner(System.in); // importa o scanner para receber as entradas.
	    
        // variaveis.
        String nome = ""; 
        int idade = 0;
        
        // loop verdadeiro ate que nome receba "0".
        while(true){
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break; // sai do loop se a condicao for verdadeira
            System.out.println("idade: ");
            idade = scan.nextInt();
        }
        scan.close(); // finaliza o scanner
        System.out.println("Fim do programa!...");
	}

}
