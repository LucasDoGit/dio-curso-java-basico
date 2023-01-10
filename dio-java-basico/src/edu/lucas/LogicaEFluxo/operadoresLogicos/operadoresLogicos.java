package edu.lucas.LogicaEFluxo.operadoresLogicos;
/*
 * Aluno: Lucas Thiago Saiz Timoteo
 * Data: 05/01/2023
 * 
 *  java basico - operacoes logicas
 */
public class operadoresLogicos {

	public static void main(String[] args) {
	    // exemplo 1
		// variaveis para testar as condicacoes
	    boolean b1 = true;
	    boolean b2 = false;
	    boolean b3 = true;
	    boolean b4 = false;
	     
	    System.out.println("b1 && b2 " + (b1 && b2)); // codicao "E" onde as duas precisam ser verdade.
	    System.out.println("b1 && b3 " + (b1 && b3));
	      
	    System.out.println("b2 || b3 " + (b2 || b3)); // condicao "ou" onde uma das duas precisam ser verdade. 
	    System.out.println("b2 || b4 " + (b2 || b4));
	    
	    System.out.println("b1 ^ b3 " + (b1 ^ b3)); // condicao "xor" onde as duas precisam ser opostos para ser verdade.
	    System.out.println("b4 ^ b1 " + (b4 ^ b1));
	    
	    System.out.println(!b1); // operacao que inverte o valor logico de um operando ou expressao.
	    System.out.println(!b2);
	    
	    // exemplo 2
	    // operadores logicos com operacoes aritmeticos
	    int i1 = 10, i2 = 5;
	    float f1 = 20f, f2 = 50f;
	    System.out.println("((i1 + i2)) + (f2 - f1)) && true " + (((i1 + i2) < (f2 - f1)) && true)); // operacao aritmetica com condicao
	    System.out.println("((i1 + i2)) + (f2 - f1)) && true " + (((i1 + i2) < (f2 - f1)) && true));
	    
	    // exemplo 3 
	    // operadores logicos com variaveis intermediarias
	    double salarioMensal = 11893.58d;
	    double mediaSalario = 10500d;
	    
	    int quantidadeDependentes = 4;
	    int mediaDependentes = 2;
	     
	    // verifica se o salario mensal e menor que a media && se quantidade de dependentes e maior que a media
	    System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)); 
	   
	    // mesma operacao logica utilizando variaveis intermediarias
	    boolean salarioBaixo = salarioMensal < mediaSalario;
	    boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
	   
	    // exibe o resultado das operacoes logicas
	    System.out.println((salarioBaixo) && (muitosDependentes));
	    
	    // terceira maneira de exibir o resultado
	    boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
	    System.out.println("recebeAuxilio " + recebeAuxilio);
	}

}
