package edu.lucas.estruturasRepeticao.execicios.arrays;
/*
Aluno: Lucas Thiago Saiz Timoteo
Data: 13/01/2023

Atividade 1 (Arrays) - Ordem Inversa
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class Ex1_OrdemInversa
{
    public static void main(String[] args) {
        System.out.println("Atividade 1 (Arrays) - Ordem inversa");
        
        int[] vetor = {2, -53, 19, 64, 38, 22}; // cria vetor com 6 posições
        int count = 0; // contador do while
        
        //System.out.println(vetor.length); // saber quantas o vetor tem
        
        System.out.println("Vetor original: "); // mostra o vetor com as posições orginais
        while(count <= (vetor.length-1)){ // lenght-1 para contar de [0] a [5] e não [0] a [6]
            System.out.print(vetor[count] + " "); // exibe o valor de cada posição.
            count++;
        }
        
        System.out.println("\nVetor ordem inversa: "); // exibe o vetor com as posições inversas
        for (int i = (vetor.length - 1); i >= 0; i--){ // vetor recebe a quantidade das posições e diminui a cada loop.
            System.out.print(vetor[i] + " "); // exibe o valor inverso de cada posição.
        }
        
        System.out.println("Fim do programa!");
    }
}
