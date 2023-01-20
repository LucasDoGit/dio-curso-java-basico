package edu.lucas.metodos.ex2;
/**
* <h1>Quadrilatero</h1>
* Calcula os lados de formas geometricas
* <p>
* <b>Note:</b> Método desenvolvido durante os estudos do autor.
*
* @author  Lucas Timoteo
* @version 1.0
* @since   18/01/2023
*/
public class Quadrilatero {
	
	public static void area(double lado) { 
		System.out.println("Área do quadrado: " + lado * lado);
	}
	
	public static void area(double lado1, double lado2) {
		System.out.println("Área do retângulo: " + lado1 * lado2);
	}
	
	public static void area(double baseMaior, double baseMenor, double altura ) {
		System.out.println("Área do quadrado: " + ((baseMaior + baseMenor)*altura) / 2);
	}
	
	public static void area(float diagonal1, float diagonal2) { 			// exemplo onde foi preciso mudar o tipo de dado caso exista outra 
		System.out.println("Área do retângulo: " + diagonal1 *diagonal2);	// sobrecarga com dois parametros
	}
}
