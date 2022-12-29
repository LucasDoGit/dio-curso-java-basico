package edu.lucas.operadores;
import java.util.Date;

/*
 * Aluno: Lucas Thiago Saiz Timoteo
 * Data: 28/12/2022
 * 
 *  operadores de atribuicao
 */
public class operadores {

	public static void main(String[] args) {
	
	//atribuicao em variaveis
	String nome = "LUCAS";
	int idade = 20;
	double peso = 65.4;
	char sexo = 'M';
	boolean programadorAvancado = false;
	Date dataNascimento = new Date(); //novo objeto / necessario importar java.util.Date
	
	//atribuicao em variaveis com operacoes matematicas
	double soma = 10.5 + 15.7;
	int subtracao = 113 - 25;
	int multiplicacao = 20 * 7;
	int divisao = 15 / 3;
	int modulo = 18 % 3;
	double resultado = (10 * 7) + (20/4);
	
	//concatenacao
	String nomeCompleto = "LINGUAGEM " + "JAVA";
	System.out.println(nomeCompleto);
	
	//cacatecao com numeros e string
	String concatenacao = "?";
	
	concatenacao = 1+1+1+"1";
	
	concatenacao = 1+"1"+1+1;
	
	concatenacao = 1+"1"+1+"1";
	
	concatenacao = "1"+1+1+1;

	concatenacao = "1"+(1+1+1);
	
	System.out.println(concatenacao); //impressao do resultado da concatenacao
	}

}
