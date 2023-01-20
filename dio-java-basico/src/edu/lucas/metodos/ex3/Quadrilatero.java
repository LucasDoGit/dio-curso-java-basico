package edu.lucas.metodos.ex3;
/**
* <h1>Quadrilatero</h1>
* Calcula os lados de formas geometricas
* <p>
* <b>Note:</b> Método desenvolvido durante os estudos do autor. 
* 
*
* @author  Lucas Timoteo
* @version 1.1
* @since   18/01/2023
*/
public class Quadrilatero {
	
	public static double area(double lado) {  // calcula area de um quadrado
		
		return lado * lado;
	}
	
	public static double area(double lado1, double lado2) { // calcula area de um retangulo
		
		return lado1 * lado2;
	}
	
	public static double area(double baseMaior, double baseMenor, double altura ) { // calcula area de um trapezio
		
		return ((baseMaior + baseMenor)*altura)/2;
	}
}
