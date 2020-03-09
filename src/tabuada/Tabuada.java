package tabuada;
import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner tabuada = new Scanner(System.in);
        
        System.out.println("Digite um número para ver sua tabuada:");
        int numero = tabuada.nextInt();
        
        for(int i=1; i <= 10; i++){
            System.out.println("Tabuada de"+i+"x"+numero+"="+i*numero);
        }
    }
    
}
