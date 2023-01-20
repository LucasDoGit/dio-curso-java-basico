package edu.lucas.metodos.ex3;
/*
Aluno: Lucas Thiago Saiz Timoteo
Data: 11/01/2023
Execício 3 - Utilizando o return 
- Crie uma aplicação que calcula a área dos 3 quadriláteros
notáveis: quadrado, retângulo e trapézio. E os métodos devem utilizar o return
*/
public class Ex03_main {

	public static void main(String[] args) {
		
		// Quadrilátero
		System.out.println("Exercicio 2 - Utilizando sobrecarga"); // chamando os metodos com sobrecarga
		
		double areaQuadrado = Quadrilatero.area(3); // chama o primeiro metodo para calculador
		System.out.println("Area do quadrado: " + areaQuadrado);
		
		double areaRetangulo = Quadrilatero.area(5,  5); // chama o segundo metodo
		System.out.println("Área do retângulo: " + areaRetangulo);
		
		double areaTrapezio = Quadrilatero.area(7, 8, 9); // chama o terceiro metodo
		System.out.println("Área do quadrado: " + areaTrapezio);
	}

}
