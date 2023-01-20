package edu.lucas.estruturasRepeticao.execicios.arrays;
/*
Aluno: Lucas Thiago Saiz Timoteo
Data: 13/01/2023

Atividade 2 (Arrays) - Consoantes
- Faça um programa que leia um vetor de 6 caracteres,
e diga quantas Consoantes foram lidas.
imprima as consoantes.
*/
import java.util.Scanner;

public class Ex2_Consoantes
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // importa o scanner
        System.out.println("Atividade 2 (Arrays) - Consoantes");
        
        String[] consoantes = new String[6]; // cria um array com 6 posições de [0] até [5]
        int quantidadeConsoantes = 0; // contador de consoantes
        int count = 0; // contador do while
        
        do { // enquanto contador do loop for menor que a quantidade de consoantes no array é contado a quantidade consoantes
            System.out.println("Digite uma letra: "); // recebe entrada das consoantes
            String letra = entrada.next();
            
            if (!(letra.equalsIgnoreCase("a")| // se o caracter for diferente de A - E - I - O - U. Aumenta o contandor de consoantes.
            	letra.equalsIgnoreCase("e")|
            	letra.equalsIgnoreCase("i")|
            	letra.equalsIgnoreCase("o")|
            	letra.equalsIgnoreCase("u")) ) 
            {
                    consoantes[count] = letra;
                    quantidadeConsoantes++; // contador de consoantes recebe mais 1.
                }
                count++;
        } while (count < consoantes.length); 
        
        System.out.println("Quantidade de consoantes digitas: " + quantidadeConsoantes); //exibe a quantidade total de consoantes
        
        System.out.println("Consoantes :"); 
        for ( String consoante : consoantes ) { // recebe as consoantes em uma string para exibir no console.
        	if (consoante != null) // não mostra as vogais(null) no console
        	System.out.print(consoante + " ");
        }
    }
}
