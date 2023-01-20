package edu.lucas.metodos.ex2;
/*
Aluno: Lucas Thiago Saiz Timoteo
Data: 11/01/2023
Execício 2 - Utilizando sobrecarga 
- Crie uma aplicação que calcula a área dos 3 quadriláteros
notáveis: quadrado, retângulo e trapézio.
*/
public class Ex02_main {

	public static void main(String[] args) {
		
		// Quadrilátero
		System.out.println("Exercicio 2 - Utilizando sobrecarga"); // chamando os metodos com sobrecarga
		Quadrilatero.area(3); // chama o primeiro metodo
		Quadrilatero.area(5, 5); // chama o segundo metodo
		Quadrilatero.area(7, 8, 9); // chama o terceiro metodo
	}

}
