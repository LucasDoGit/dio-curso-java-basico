package edu.lucas.metodos;

public class SmartTv {

	boolean ligada = false;
	int canal = 7;
	int volume = 35;
	
	// metodo que liga a tv
	public void ligar() {
		this.ligada = true;
	}
	
	// metodo que desliga a tv
	public void desligar() {
		this.ligada = false;
	}
	
	// metodo que aumenta o valor do volume
	public void aumentarVolume() {
		this.volume++;
		//System.out.println("Volume atual: " + this.volume); // verificar na execucao a troca do valor
	}
	
	// metodo que diminui o valor do volume
	public void diminuirVolume() {
		this.volume--;
	}
	
	// metodo que aumenta o valor do canal
	public void aumentarCanal() {
		canal++;
	}
	
	// metodo que diminui o valor do canal
	public void diminuirCanal() {
		canal++;
	}
	
	// metodo que define o canal
	public void definirCanal(int novoCanal) {
		this.canal = novoCanal;
	}
}
