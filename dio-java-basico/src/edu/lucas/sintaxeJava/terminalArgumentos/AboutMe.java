package edu.lucas.sintaxeJava.terminalArgumentos;
import java.util.Locale;
import java.util.Scanner;
/**
 * Aluno: Lucas Thiago Saiz Timoteo
 * Data: 04/01/2023
 * DIO Java Basico - praticando o uso de argumentos e scanner
 */

public class AboutMe {

	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in).useLocale(Locale.US); // importa o scanner para capturar entradas.
	
	System.out.println("Digite seu nome: ");
	String nome = entrada.next(); // scanner recebe o nome e armazena na variavel string.
	
	System.out.println("Digite seu sobrenome: ");
	String sobrenome = entrada.next(); // scanner recebe o sobrenome e armazena na variavel string.
	
	System.out.println("Digite sua idade: ");
	int idade = entrada.nextInt(); // scanner recebe a idade e armazena na variavel int.
	
	System.out.println("Digite sua altura: ");
	double altura = entrada.nextDouble(); // scanner recebe a altura e armazena na variavel double.
	
	// exibe no terminal as variaveis
	System.out.println("Olá, me chamo " + nome + " " + sobrenome);
	System.out.println("Tenho " + idade + " anos ");
	System.out.println("Minha altura é " + altura + "cm");
	}
	
}
