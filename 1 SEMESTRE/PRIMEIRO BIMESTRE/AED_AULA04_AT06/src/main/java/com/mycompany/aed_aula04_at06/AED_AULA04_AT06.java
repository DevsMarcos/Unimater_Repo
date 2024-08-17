/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aed_aula04_at06;

import java.util.Scanner;

/**
 *
 * @author devsmarcos
 */
public class AED_AULA04_AT06 {

    public static void main(String[] args) {
        //Bhaskara
        
        double a = 0;
        double b = 0;
        double c = 0;
        
        System.out.println("Calculadora de Bhaskara");
        
        Scanner leitorA = new Scanner(System.in);
        System.out.println("Informe o valor de a: ");
        a = leitorA.nextDouble();
       
        Scanner leitorB = new Scanner(System.in);
        System.out.println("Informe o valor de b: ");
        b = leitorB.nextDouble();
        
         Scanner leitorC = new Scanner(System.in);
        System.out.println("Informe o valor de c: ");
        c = leitorC.nextDouble();
        
        double delta = (Math.pow(b, 2))- 4*(a*c);
        delta = delta < 0 ? delta * (-1) : delta;
        double deltaResult = Math.sqrt(delta);
        
    
        double xPositivo = ((-(b) + deltaResult) / 2*a);
        double xNegativo = ((-(b) - deltaResult) / 2*a);
        
        System.out.println("O valor de delta + é: "+xPositivo);
        System.out.println("O valor de delta - é: "+xNegativo);

        leitorA.close();
        leitorB.close();
        leitorC.close();

    }
}
