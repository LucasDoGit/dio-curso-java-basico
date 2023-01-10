package edu.lucas.LogicaEFluxo.controleFluxo;
/*
* Aluno: Lucas Thiago Saiz Timoteo
* Data: 06/01/2022
* 
*   //Praticando controle de fluxo.
*/
public class controleDeFluxo {

	public static void main(String[] args) {
        System.out.println("PRATICANDO IF E SWITCH");
        
        swtichDiaSemana();
        //ifNumeroMes();
        //switchNumero();
        
        System.out.println("Fim do programa!");
    }
    /**
    * metodo que verifica o numero do mes e exibe a forma escrita e se as ferias estao ativas.
    */
    public static void ifNumeroMes(){
        
        // variaveis para receber os numeros  textos dos meses.
        int mesAno = 3;
        String mesTexto = "";
        
        // exibe o nome do mes conforme o numero dos mes.
        if (mesAno == 1){
            mesTexto = "Janeiro";
            System.out.println("Mes: "+ mesAno + " = " + mesTexto);
        } else if (mesAno == 2) {
            mesTexto = "Fevereiro";
            System.out.println("Mes: "+ mesAno + " = " + mesTexto);
        } else if (mesAno == 3) {
            mesTexto = "Março";
            System.out.println("Mes: "+ mesAno + " = " + mesTexto);
        } else if (mesAno == 4) {
            mesTexto = "Abril";
            System.out.println("Mes: "+ mesAno + " = " + mesTexto);
        } else if (mesAno == 5) {
            mesTexto = "Maio";
            System.out.println("Mes: "+ mesAno + " = " + mesTexto);
        } else if (mesAno == 6) {
            mesTexto = "Junho";
            System.out.println("Mes: "+ mesAno + " = " + mesTexto);
        } else if (mesAno == 7) {
            mesTexto = "Julho";
            System.out.println("Mes: "+ mesAno + " = " + mesTexto);
        } else if (mesAno == 8) {
            mesTexto = "Agosto";
            System.out.println("Mes: "+ mesAno + " = " + mesTexto);
        } else if (mesAno == 9) {
            mesTexto = "Setembro";
            System.out.println("Mes: "+ mesAno + " = " + mesTexto);
        } else if (mesAno == 10) {
            mesTexto = "Outubro";
            System.out.println("Mes: "+ mesAno + " = " + mesTexto);
        } else if (mesAno == 11) {
            mesTexto = "Novembro";
            System.out.println("Mes: "+ mesAno + " = " + mesTexto);
        } else {
            mesTexto = "Dezembro";
            System.out.println("Mes: "+ mesAno + " = " + mesTexto);
        }
        
        // verificando as férias
        // verdadeiro quando mes de ferias for Janeiro, Julho ou Dezembro 
        if (mesTexto.equals("Julho") || mesTexto.equals("Dezembro") || mesTexto.equals("Janeiro")){
            System.out.println("Você está de Férias");
        }
        else {
            System.out.println("você não está de Férias");
        }
    }
    /**
     * verifica qual o dia da semana é e exibe o número correspondente da semana. 
     */
    public static void swtichDiaSemana(){
        
        String dia = "Terça";
        
        switch(dia) {
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sabado":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(1);
                break;
            default:
                System.out.println("Dia da semana inválido.");
                break;
        }
    }
    /**
     * Metodo que verifica o numero digitado e exibe um resposta. 
     */
    public static void switchNumero(){
        int numero = 5;
        
        switch(numero){
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default: 
                System.out.println("Número inválido.");
                break;
        }
    }
}