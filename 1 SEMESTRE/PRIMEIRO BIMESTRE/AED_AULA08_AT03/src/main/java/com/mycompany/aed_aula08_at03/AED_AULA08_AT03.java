/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aed_aula08_at03;

import java.util.Scanner;

/**
 *
 * @author DevsMarcos
 */
public class AED_AULA08_AT03 {

    public static void main(String[] args) {
        int num = 0;
        
        Scanner leitorNum = new Scanner (System.in);
        System.out.println("Informe um número qualquer: ");
        num = leitorNum.nextInt();
        
        if(num%2 == 0){
            System.out.println("O número é PAR");
        }else{
            System.out.println("O número é impar");
        }

        leitorNum.close();
    }
}
