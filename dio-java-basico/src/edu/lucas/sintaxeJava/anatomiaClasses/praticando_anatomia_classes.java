package edu.lucas.sintaxeJava.anatomiaClasses;
/*
 * Aluno: Lucas Thiago Saiz Timoteo
 * Data: 28/12/2022
 * 
 * 	criando o primeiro codigo +
 *	praticando anatomia de classes
 */
public class praticando_anatomia_classes {

	public static void main(String[] args) {
		
		int mediaFinal = 5;
		
		if (mediaFinal <6)
			System.out.println("REPROVADO!");
		else if (mediaFinal == 6)
			System.out.println("PROVA MINERVA");
		else
			System.out.println("APROVADO");
		
		System.out.println("FIM PROGRAMA.");
		
		double  salarioMedio = 1500.23; //nao recomendado abreviar variaveis
		String email = "aluno@escola.com"; //variaveis no singular
		String [] emails = {"aluno@escola.com","professor@escola.com"}; //arrays em plural
		String meuNome = "JOSEPH"; //utilizar um idioma mesmo com entradas em outros idiomas
	}

}
