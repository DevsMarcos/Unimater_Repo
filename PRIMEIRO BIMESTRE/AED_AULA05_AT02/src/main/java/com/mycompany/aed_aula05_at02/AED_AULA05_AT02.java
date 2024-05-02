/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aed_aula05_at02;

import java.util.Scanner;

/**
 *
 * @author devsmarcos
 */
public class AED_AULA05_AT02 {

    public static void main(String[] args) {
        
        float raio = 0;
        double volume = 0;
        
        Scanner leitorRaio = new Scanner(System.in);
        System.out.println("Informe o valor do raio da esfera: ");
        raio = leitorRaio.nextFloat();
        
        volume = ((4*Math.PI*(Math.pow(raio, 3))) / 3);
        
        
        System.out.println("O volume do esfera em questão é de: "+volume);

        leitorRaio.close();
    }
}
