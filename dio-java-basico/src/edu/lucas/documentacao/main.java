package edu.lucas.documentacao; 

import java.util.Locale;
import java.util.Scanner;
/**
 * Aluno: Lucas Thiago Saiz Timoteo
 * Data: 04/01/2023
 * DIO Java Basico - documentacao e comentarios
 */
public class main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in).useLocale(Locale.US); // importa o scanner para capturar entradas.
		Calculadora calc = new Calculadora(); // instancia o objeto calculadora para somar os valores
		int valor1 = 0, valor2 = 0; // variavel dos valores a serem somados
		int resultado; // variavel para guardar a soma
		
		System.out.println("Programa - Calcular soma de dois valores\n");
		System.out.println("Digite o primeiro valor: "); // recebe o primeiro valor
		valor1 = entrada.nextInt(); // recebe o primeiro valor e armazena
		System.out.println("Digite o segund2o valor: "); // recebe o segundo valor
		valor2 = entrada.nextInt(); // recebe o segundo valor e armazena
		
		calc.somar(valor1, valor2); //chama o metodo somar da calculadora
		System.out.println("Resultado da soma: " + calc.resultadoSoma); // exibe a soma dos valores 1 e 2
		
		entrada.close(); // para de receber entradas
	}

}
