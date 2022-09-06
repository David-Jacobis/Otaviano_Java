package com.mycompany.atividade_otaviano;
import java.util.Scanner;

/**
 *
 * @author Jake
 */
public class Questão3 {
    
     public static void main(String[] args) {
         Scanner myObj = new Scanner(System.in);
         //System.out.println("Hello World");
         String carros[] = new String[3];
         int consumo[] = new int [3], menor = 0;
         
         
        for (int i = 0; i < carros.length; i++) {    
            System.out.println("Digite o modelo do carro: ");
            carros[i] = myObj.nextLine();
            for (int j = 0; j < consumo.length; j++) {
             System.out.println("Digite quantos KM o carro consegue fazer por um litro: ");
             consumo[j] =myObj.nextInt();
            }   
            for (int j = 0; j <= consumo.length; j++) {
                if(consumo[j]<=consumo[0]){
               menor=consumo[j]; 
            } 
                
                }
            System.out.println("o Menor valor digitado : "+ menor);
        }
        
        
        
     }
}
