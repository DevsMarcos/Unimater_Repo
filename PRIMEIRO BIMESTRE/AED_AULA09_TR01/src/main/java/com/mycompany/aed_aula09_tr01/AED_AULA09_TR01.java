/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aed_aula09_tr01;

import java.util.Scanner;

/**
 *
 * @author DevsMarcos
 */
public class AED_AULA09_TR01 {

    public static void main(String[] args) {
        System.out.println("TIPOS DE TRIANGULOS");
        float lado1 = 0;
        float lado2 = 0;
        float lado3 = 0;
        
        Scanner valorLado = new Scanner (System.in);
        System.out.println("Informe o valor 1° lado do triangulo: ");
        lado1 = valorLado.nextFloat();
        
        System.out.println("Informe o valor do 2° lado do triangulo: ");
        lado2 = valorLado.nextFloat();
        
        System.out.println("Informe o valor do 3° lado do triangulo:  ");
        lado3 = valorLado.nextFloat();
        
        boolean equilatero = lado1==lado2 && lado1==lado3;
        boolean isosceles = (lado1==lado2)||(lado2==lado3)||(lado1==lado3);
        boolean escaleno = lado1!=lado2 && lado2!=lado3 && lado3!=lado1;
        
        if(equilatero){ 
            System.out.println("Este é um triangulo equilatero");
        }else if(isosceles){
            System.out.println("Você possui um Triângulo Isoceles");
        }else if(escaleno){
            System.out.println("Você tem im Triangulo Escaleno");
        }

        valorLado.close();
    }
}
