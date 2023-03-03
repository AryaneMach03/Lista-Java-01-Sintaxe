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
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double areaterreno, areaconst, arealivre;
        double cterreno, cconst,itotal;
        
        System.out.println("Informe a area total do terreno:");
        areaterreno = entrada.nextDouble();
        
        System.out.println("Informe a area construída do terreno:");
        areaconst = entrada.nextDouble();
        
        arealivre = areaterreno - areaconst;
        cterreno = arealivre*3.80;
        cconst = areaconst*5.00;
        itotal = cterreno+cconst;
        
        System.out.println("O valor total de impostos a ser pago eh:"+itotal);
        
        
            
    } // fim public
    
} // public class
