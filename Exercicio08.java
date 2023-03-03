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
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double hp, lp, ha, la;
        double areaparede;
        double areaazulejo;
        double areaqtd;
        
        System.out.println("Informe a altura e a largura da parede:");
        hp = entrada.nextDouble();
        lp = entrada.nextDouble();
        
        System.out.println("Informe a altura e a largura do azulejo");
        ha = entrada.nextDouble();
        la = entrada.nextDouble();
        
        areaparede = hp*lp;
        areaazulejo = ha*la;
        areaqtd = areaparede / areaazulejo;
        
        System.out.println("A quantidade aproximada de azulejos necessarios para cobbrir a parede eh igual a:"+areaqtd);
        
 
    } // fim void
    
}// fim public
