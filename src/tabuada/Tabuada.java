
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabuada;
import java.util.Scanner;
/**
 *
 * @author labcc
 */
public class Tabuada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner tabuada = new Scanner(System.in);
        
        System.out.println("Digite um número para ver sua tabuada:");
        int numero = tabuada.nextInt();
        
        for(int i=1; i <= 10; i++){
            System.out.println("Tabuada de"+i+"x"+numero+"="+i*numero);
        }
        // TODO code application logic here
    }
    
}
