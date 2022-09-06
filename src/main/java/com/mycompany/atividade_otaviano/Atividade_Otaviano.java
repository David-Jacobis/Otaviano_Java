package com.mycompany.atividade_otaviano;

/**
 *
 * @author Jake
 */
public class Atividade_Otaviano {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //Questão 1
        int tabuada[][] = new int[10][10];
        for (int i = 0; i <= tabuada.length; i++) {
            
            for (int j = 0; j <= tabuada[1].length; j++) {
               
             int soma = i + j;
                System.out.println("Primeiro valor: "+i+" Segundo Valor: "+j+" Soma: " +soma+"\n");
            }
            
        }
        
    }
}
