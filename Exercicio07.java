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
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double n1, n2, n3, n4;
        double media;
        
        System.out.println("Informe a nota 1:");
        n1 = entrada.nextDouble();
        System.out.println("Informe a nota 2:");
        n2 = entrada.nextDouble();
        System.out.println("Informe a nota 3:");
        n3 = entrada.nextDouble();
        System.out.println("Informe a nota 4:");
        n4 = entrada.nextDouble();
        
        media = (n1+n2+n3+n4)/4;
        
        System.out.println("A media bimestral eh:"+media);
        
        
        if(media>=0 && media<=3.49){
            System.out.println(media+" - Reprovado!");
        
        }// fim if
        
        else if (media>=3.5 && media<=6.49){
            System.out.println(media+" - Recuperação!");
            
        }// fim else
        
        else {
            System.out.println(media+" - Aprovado!");
                
        
                }// fim else
       
        
        
    } // fim void
        
    } // fim public
        
     
                
            
            
            
            
            
            
        
        
        
        
        
        
        
    
    
    

