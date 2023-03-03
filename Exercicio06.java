/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista01Sintaxe;
import java.util.Scanner;


/**
 *
 * @author aryan
 */
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double comprimento;
        double altura;
        double area;
        double perimetro;
        
        System.out.println("Informe o valor o comprimento:");
        comprimento = entrada.nextDouble();
        System.out.println("Informe o valor da altura:");
        altura = entrada.nextDouble();
        
        area = comprimento * altura;
        perimetro = 2*comprimento + 2*altura;
        
        System.out.println("A area desse retangulo eh:"+area);
        System.out.println("O perimetro desse retangulo eh"+perimetro);
        
    } // fim public static    

} // fim public class
        
        
        
        
        
        
        
        
        
        
        
       
        
    
    
