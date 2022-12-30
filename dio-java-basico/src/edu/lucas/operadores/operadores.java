package edu.lucas.operadores;
import java.util.Date;

/*
 * Aluno: Lucas Thiago Saiz Timoteo
 * Data: 30/12/2022
 * 
 *  java basico - sintaxe e fundamentos
 */
public class operadores {

	public static void main(String[] args) {
	
	// atribuicao em variaveis
		
	System.out.println("// ATRIBUICAO //");
	String nome = "LUCAS";
	int idade = 20;
	double peso = 65.4;
	char sexo = 'M';
	boolean programadorAvancado = false;
	Date dataNascimento = new Date(); //novo objeto / necessario importar java.util.Date
	System.out.println("// FIM ATRIBUICAO //\n");
	
	// atribuicao em variaveis com operacoes matematicas
	System.out.println("// ARITMETICOS //");
	double soma = 10.5 + 15.7;
	int subtracao = 113 - 25;
	int multiplicacao = 20 * 7;
	int divisao = 15 / 3;
	int modulo = 18 % 3;
	double resultado = (10 * 7) + (20/4);

	// concatenacao
	String nomeCompleto = "LINGUAGEM " + "JAVA";
	System.out.println(nomeCompleto);
	
	// cacatecao com numeros e string
	String concatenacao = "?";
	
	concatenacao = 1+1+1+"1";
	concatenacao = 1+"1"+1+1;
	concatenacao = 1+"1"+1+"1";
	concatenacao = "1"+1+1+1;
	concatenacao = "1"+(1+1+1);
	
	System.out.println(concatenacao); // impressao do resultado da concatenacao
	System.out.println("// FIM ARITMETICOS //\n");
	System.out.println("// UNARIOS //");
	
	// operadores unarios
	int numero = 5;
			
	// imprimindo o numero negativo
	System.out.println(- numero);

	// incrementando numero em mais 1 numero, imprime 6
	numero ++;
	System.out.println(numero);

	// incrementando numero em mais 1 numero, imprime 7
	System.out.println(numero ++);// ops algo de errado não está certo

	System.out.println(numero);// agora sim, numero virou 7

	// ordem de precedencia conta aqui
	System.out.println(++ numero);

	boolean verdadeiro = true;

	System.out.println("Inverteu " + !verdadeiro);
	
	// operadores ternarios
	
	System.out.println("// FIM UNARIOS //\n");
	System.out.println("// TERNARIOS //");
	int a, b;

	a = 5;
	b = 6;

	/* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
	if(a==b)
	   resultado = "verdadeiro";
	else
	   resultado = "falso";
	*/

	// MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
	String resultado2 = (a==b) ? "verdadeiro" : "false";
	
	System.out.println(resultado2);
	
	System.out.println("// FIM TERNARIOS //\n");
	System.out.println("// RELACIONAIS //");
	
	// relacionais
	int numero1 = 1;
	int numero2 = 2;

	// verifica se numero1 e maior que numero2
	if(numero1 > numero2)
		System.out.print("Numero 1 maior que numero 2");

	if(numero1 < numero2)
		System.out.print("Numero 1 menor que numero 2");

	if(numero1 >= numero2)
		System.out.print("Numero 1 maior ou igual que numero 2");

	if(numero1 <= numero2)
		System.out.print("Numero 1 menor ou igual que numero 2");

	if(numero1 != numero2)
		System.out.print("Numero 1 é diferente de numero 2");
	
	// comparacoes avancadas

     String nome1 = "JAVA";
     String nome2 = "JAVA";
        
     System.out.println(nome1 == nome2); //true

     String nome3 = new String("JAVA");
        
     System.out.println(nome1 == nome3); //false

     String nome4 = nome3;

     System.out.println(nome3 == nome4); //true
        
     //equals na parada
     System.out.println(nome1.equals(nome2)); //??
     System.out.println(nome2.equals(nome3)); //??
     System.out.println(nome3.equals(nome4)); //??
     
     int numero3 = 130;
     int numero4 = 130;
     System.out.println(numero3 == numero4); //true
     
     /*
     Integer numero3 = 130;
     Integer numero4 = 130;

     System.out.println(numero3 == numero4); //false
     
     // A razão pela qual o resultado é false, é devido o Java tratar os valores
     // Como objetos a partir de agora.
     // Qual a solução ?
     // Quando queremos comparar objetos, usamos o método equals
     
      System.out.println(numero3.equals(numero4));
      */ 
     
 	System.out.println("// FIM RELACIONAIS //\n");
 	System.out.println("// LÓGICOS //");
 	
     // && Operador logico "E"
     // || Operador logico "OU"
     
     boolean condicao1=true;

     boolean condicao2=false;

     /* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
     expressões. 
     É como se estivesse escrito:
      "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
     */

     if(condicao1 && condicao2)
     	System.out.println("Os dois valores precisam ser verdadeiros");;

     //Se condicao1 OU condicao2 for verdadeira, executar código.
     if(condicao1 || condicao2)
     	System.out.println("Um dos valores precisa ser verdadeiro");
     
     System.out.println("\n- complemento em comparacao avancada\n");
     
     int numero5 = 1;
     int numero6 = 1;
     
     if(numero5 ++ == 2 & numero6 ++ == 2 )
    	 System.out.println("As 2 condições são verdadeiras"); // condicao falsa
     
     System.out.println("O numero 5 agora é " + numero5);
     System.out.println("O numero 6 agora é " + numero6);
     System.out.println("FIM");
    }
}
