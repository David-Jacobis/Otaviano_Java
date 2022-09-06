package com.mycompany.atividade_otaviano;
import java.util.Scanner;
/**
 *
 * @author Jake
 */
public class Questão2 {
    
    public static void main(String[] args) {
        //System.out.println("Hello Wolrd!");
        Scanner myObj = new Scanner(System.in);
       int n[] = new int[10];    
         
        for (int i = 0; i < n.length; i++) {    
            System.out.println("Digite o numero: ");
            n[i] = myObj.nextInt();
        }
         
        for (int i = 0; i < n.length; i++) {
            if( ehPrimo(n[i]) )
                System.out.println(n[i] + " é primo. Posição no vetor: " + i);
        }    
    }
     
    private static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }
    
}
   
