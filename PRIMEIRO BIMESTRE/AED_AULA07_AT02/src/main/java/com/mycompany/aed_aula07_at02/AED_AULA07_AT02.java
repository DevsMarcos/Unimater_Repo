/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aed_aula07_at02;

import java.util.Scanner;

/**
 *
 * @author DevsMarcos
 */
public class AED_AULA07_AT02 {

    public static void main(String[] args) {
        float n1 = 0;
        float n2 = 0;
        float n3 = 0;
        float n4 = 0;
        float media = 0;
        String resultado = "";
        
        Scanner leitorNota = new Scanner(System.in);
        System.out.println("Informe o valor da sua primeira nota: ");
        n1 = leitorNota.nextFloat();
        
        System.out.println("Informe o valor da sua segunda nota: ");
        n2 = leitorNota.nextFloat();
        
        System.out.println("Informe o valor da terceira nota: ");
        n3 = leitorNota.nextFloat();
        
        System.out.println("Informe o valor da quarta nota: ");
        n4 = leitorNota.nextFloat();
        
        media = (n1+n2+n3+n4) / 4;
        
        if(media >= 7.0){
            System.out.println("Parabéns você foi aprovado!!");
            System.out.println("Sua nota é: "+media);
        }else{
            System.out.println("Infelizmente você foi reprovado :(");
            System.out.println("Sua nota é: "+media);
        };
        
        resultado = media >= 7 ? "Parabéns você foi aprovado" : "Infelizmente você foi reprovado";

        System.out.println(resultado);

        leitorNota.close();
        
    }
}
