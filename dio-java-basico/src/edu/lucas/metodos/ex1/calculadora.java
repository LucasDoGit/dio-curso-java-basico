package edu.lucas.metodos.ex1;
/**
 * 
 * @author Lucas Thiago Saiz Timoteo
 * Classe utilizada para fazer operações básicas com dois valores do tipo double
 */
public class calculadora {

	public static void soma(double numero1, double numero2) { // metodo para somar dois valores
		double resultado = numero1 + numero2;
		System.out.println("A soma de " + numero1 + " mais " + numero2 + " é: " + resultado);
	}
	
	public static void subtracao(double numero1, double numero2) { // meotdo para fazer subtracao de de um valor por outro valor
		double resultado = numero1 - numero2;
		System.out.println("A subtração de " + numero1 + " menos " + numero2 + " é: " + resultado);
	}
	
	public static void multipliacao(double numero1, double numero2) { // multiplicacao entre valores
		double resultado = numero1 * numero2;
		System.out.println("A multiplicação de " + numero1 + " vezes " + numero2 + " é: " + resultado);
	}
	
	public static void divisao(double numero1, double numero2) { // divisao entre valores
		double resultado = numero1 / numero2;
		System.out.println("A divisao de " + numero1 + " por " + numero2 + " é: " + resultado);
	}
}
