/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aed_aula06_tr02;

import java.util.Scanner;

/**
 *
 * @author devsmarcos
 */
public class AED_AULA06_TR02 {

    public static void main(String[] args) {
        double altura = 0;
        double base = 0;
        double area = 0;
        double perimetro = 0;
        
        Scanner leitorAltura = new Scanner(System.in);
        System.out.println("Informe o valor da altura do retângulo: ");
        altura = leitorAltura.nextDouble();
        
        Scanner leitorLargura = new Scanner(System.in);
        System.out.println("Informe o valor da largura do retângulo: ");
        base = leitorLargura.nextDouble();
        
        area = base * altura;
        perimetro = (2*base) + (2*altura);
        
        System.out.println("O valor da area do retângulo é de: "+area);
        System.out.println("O valor do perímetro do retângulo é de: "+perimetro);
    }
}
