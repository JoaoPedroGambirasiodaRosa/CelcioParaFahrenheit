/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semanaltres;
import java.util.Scanner;
/**
 *
 * @author João Pedro Gambirasio da Rosa
 */
public class SemanalTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        double Ce, Fa;
                
        System.out.println("Digite o valor em Celsius");
        Ce = scan.nextDouble();
        
        Fa = (9*Ce/5)+32;
                
        System.out.println("Seu valor em fahrenheit: " +Fa);
    }
    
}
