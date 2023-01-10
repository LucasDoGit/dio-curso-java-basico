package edu.lucas.sintaxeJava.metodos;
/*
 * Aluno: Lucas Thiago Saiz Timoteo
 * Data: 30/12/2022
 * 
 *  java basico - metodos em java
 */

public class Usuario {

	public static void main(String[] args) {
	
	System.out.println("PROJETO SMART TV");
		
	SmartTv tvSmart = new SmartTv(); // instancia o objeto smartTv
	
	System.out.println("\nStatus incial da smart tv");
	System.out.println("Status da TV:  " + tvSmart.ligada);
	System.out.println("canal atual: " +	tvSmart.canal);
	System.out.println("volume atual:  " + tvSmart.volume);
	System.out.println("");
	
	// chamando os metodos
	System.out.println("Executando metodos");
	tvSmart.ligar(); // altera status da tv
	System.out.println("Novo status da TV:  " + tvSmart.ligada);
	
	tvSmart.desligar(); // altera status da tv
	System.out.println("Novo status da TV:  " + tvSmart.ligada);
	
	tvSmart.aumentarVolume(); // altera volume da tv
	System.out.println("volume atual:  " + tvSmart.volume);
	
	tvSmart.diminuirVolume(); // altera volume da tv
	tvSmart.diminuirVolume(); // altera volume da tv
	System.out.println("volume atual:  " + tvSmart.volume);
	
	tvSmart.aumentarCanal(); // altera canal da tv
	System.out.println("canal atual:  " + tvSmart.canal);
	
	tvSmart.diminuirCanal(); // altera canal da tv
	System.out.println("canal atual:  " + tvSmart.canal);
	
	tvSmart.definirCanal(12); // altera canal da tv
	System.out.println("canal atual:  " + tvSmart.canal);
	}

}
