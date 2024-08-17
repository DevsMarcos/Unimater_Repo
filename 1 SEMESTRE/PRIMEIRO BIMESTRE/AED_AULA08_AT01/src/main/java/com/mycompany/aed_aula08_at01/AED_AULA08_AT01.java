/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aed_aula08_at01;

import java.util.Scanner;

/**
 *
 * @author DevsMarcos
 */
public class AED_AULA08_AT01 {

    public static void main(String[] args) {
        byte idade = 0;
        
        Scanner leitorIdade = new Scanner(System.in);
        System.out.println("Informe a sua idade: ");
        idade = leitorIdade.nextByte();
        
        if(idade < 16){
            System.out.println("Você não é obrigado a votar");
        }else if(idade >= 18 && idade <= 65){
            System.out.println("Você tem obrigação de votar");
        }else if(idade >= 16 && idade < 18 || idade > 65){
            System.out.println("Você pode escolher se quer votar ou não.");
        }
        
        leitorIdade.close();
    }
}