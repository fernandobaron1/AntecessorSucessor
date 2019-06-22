
package antecessorsucessor;

import java.util.Scanner;


public class AntecessorSucessor {

    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        int numero = 0;
        int sucessor = 0;
        int antecessor = 0;
        
        System.out.println("Digite o número a qual você deseja saber o seu sucessor e antecessor:");
        numero = leia.nextInt();
        
        antecessor = numero - 1;
        sucessor = numero + 1;
        
        System.out.println("Número Antecessor: "+antecessor);
        System.out.println("Número Sucessor: "+sucessor);
       
    }
    
}
