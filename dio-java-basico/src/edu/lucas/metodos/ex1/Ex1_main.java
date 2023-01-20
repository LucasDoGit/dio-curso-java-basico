package edu.lucas.metodos.ex1;
/*
Aluno: Lucas Thiago Saiz Timoteo
Data: 13/01/2023

Atividade 1 (Métodos) - Criacação de métodos.
- Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão. (2 valores devem ser passados)
- A partir da hora do dia deve ser exibido: "Bom dia", "Boa tarde" ou "Boa Noite".
- Calcule o valor final de um emprestimo, a partir do valor solicitado. Taxas e parcelas influenciam.
Defina arbitrariamente as faixasm que influenciam nos valores.
*/
public class Ex1_main {

	public static void main(String[] args) {
		
		System.out.println("Execícios Calculadora"); // chamando metodo da classe calculadora
		int numero1 = 10; int numero2 = 3;
		
		calculadora.soma(numero1, numero2);
		calculadora.subtracao(numero1, numero2);
		calculadora.multipliacao(numero1, numero2);
		calculadora.divisao(numero1, numero2);
		
		// Mensagem
		System.out.println("Exercício mensagem de hora"); // chamando metodo da classe mensagemHora
		mensagemHora.mensagemHora(7);
		mensagemHora.mensagemHora(12);
		mensagemHora.mensagemHora(22);
		mensagemHora.mensagemHora(3);
		
		// Empréstimo
		System.out.println("Exercício empréstimo"); // chamando metodo da classe emprestimo
		emprestimo.calcular(1000, emprestimo.getDuasParcelas());
		emprestimo.calcular(1000, emprestimo.getTresParcelas());
		emprestimo.calcular(1000, 5);
	}
}
