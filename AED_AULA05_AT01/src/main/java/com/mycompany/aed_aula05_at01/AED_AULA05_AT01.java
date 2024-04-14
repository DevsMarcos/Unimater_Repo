/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aed_aula05_at01;

import java.util.Scanner;

/**
 *
 * @author devsmarcos
 */
public class AED_AULA05_AT01 {

    public static void main(String[] args) {
        float n1 = 0;
        float n2 = 0;
        float n3 = 0;
        float media1 = 0;
        float media2 = 0;
        float media3 = 0;
        float mediaFinal = 0;
        
        Scanner leitorNota = new Scanner(System.in);
        Scanner leitorMedia = new Scanner(System.in);
        
        System.out.println("Informe o valor da primeira nota (0 a 10): ");
        n1 = leitorNota.nextFloat();
        
        System.out.println("Informe o valor da segunda nota (0 a 10): ");
        n2 = leitorNota.nextFloat();
        
        System.out.println("Informe o valor da terceira nota (0 a 10): ");
        n3 = leitorNota.nextFloat();
        
        System.out.println("Informe o valor da ponderada da primeira nota (%): ");
        media1 = leitorMedia.nextFloat();
        
        System.out.println("Informe o valor da ponderada da segunda nota (%): ");
        media2 = leitorMedia.nextFloat();
        
        System.out.println("Informe o valor da ponderada da terceira nota (%): ");
        media3 = leitorMedia.nextFloat();
        
        mediaFinal = (((n1*media1) + (n2*media2)+ (n3*media3)) / (media1 + media2 + media3));
        
        System.out.println("A media final é de: "+mediaFinal);

        leitorMedia.close();
        leitorNota.close();
        
        
    }
}
