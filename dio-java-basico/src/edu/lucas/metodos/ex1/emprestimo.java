package edu.lucas.metodos.ex1;

public class emprestimo {

	public static int getDuasParcelas() { // metodo para se obter a quantidade duas parcelas
		return 2;
	}
	public static int getTresParcelas() { // metodo para se obter a quantidade tres parcelas
		return 3;
	}
	public static double getTaxasDuasParcelas() { // metodo para se obter a taxa de duas parcelas
		return 0.3;
	}
	public static double getTaxasTresParcelas() { // metodo para se obter a taxa de tres parcelas
		return 0.45;
	}
	
	public static void calcular(double valor, int parcelas) { // metodo que verifica as parecelas e calcula a taxa
		
		if (parcelas == 2) {
			double valorFinal = valor + (valor * getTaxasDuasParcelas());
			System.out.println("Valor final do emprestimo para 2 parcelas: R$ " + valorFinal);
		} else if (parcelas == 3) {
			double valorFinal = valor + (valor * getTaxasTresParcelas());
			System.out.println("Valor final do emprestimo para 3 parcelas: R$ " + valorFinal);
		} else {
			System.out.println("A quantidade de parcelas não é aceita!");
		}
	}
}
