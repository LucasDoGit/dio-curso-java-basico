package edu.lucas.metodos.ex1;

public class mensagemHora {
	
	public static void mensagemHora(int hora) {
		if (hora >= 5 && hora <= 11) { // dia
			System.out.println("Bom dia!");
		}
		else if (hora >= 12 && hora <= 17) { // tarde
			System.out.println("Boa tarde!");
		}
		else if (hora >= 18 && hora <= 24) { // noite
			System.out.println("Boa noite!");
		}
		else if (hora >= 0 && hora <= 4) { // madrugada
			System.out.println("Boa noite!");
		} else {
			System.out.println("Valor de hora inválido!"); // mensagem de erro de hora.
			}
		}
		
		// segunda maneira de fazer o método
		
		public static void obterMensagem(int hora) {
			
			switch (hora) {
			case 5:  // dia
			case 6: 
			case 7: 
			case 8: 
			case 9: 
			case 10: 
			case 11:
			case 12:
				mensagemBomDia();
				break;
			case 13: // tarde
			case 14:
			case 15:
			case 16:
			case 17:
				mensagemBoaTarde();
				break;
			case 18: // noite
			case 19:
			case 20:
			case 21:
			case 22:
			case 23:
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				mensagemBoaNoite();
				break;
			default:
				System.out.println("Valor de hora inválido!"); // mensagem de erro de hora.
				break;
		}
	}
		public static void mensagemBomDia() {
			System.out.println("Bom dia!");
		}
		public static void mensagemBoaTarde() {
			System.out.println("Boa Tarde!");
		}
		public static void mensagemBoaNoite() {
			System.out.println("Boa noite!");
		}
}
