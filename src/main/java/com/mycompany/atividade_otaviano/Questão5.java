
package com.mycompany.atividade_otaviano;
import java.util.Scanner;
/**
 *
 * @author Jake
 */
public class Questão5 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		ArrayEscrita[] arr = new ArrayEscrita[3];
		
		arr[0] = new ArrayEscrita();
		arr[1] = new ArrayEscrita();
		arr[2] = new ArrayEscrita();
		
		do {			
			for(int i = 0; i <  arr.length; i++) {
				if(arr[i].getModificado() == false) {
					System.out.print("Digite um valor"+(i + 1)+" : ");
					arr[i].setValor(entrada.nextInt());
					arr[i].setModificado(true);
				}else {
					System.out.println("Valor não pode mais ser alterado");
				}
				
			 }

			System.out.print("\n 1 = voltar ou 0 = sair");
		} while ( entrada.nextInt() == 1);
                
                    entrada.close();
                    System.out.println("Finalizado");
	}
}

