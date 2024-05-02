/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aed_aula09_tr03;

import java.util.Scanner;

/**
 *
 * @author DevsMarcos
 */
public class AED_AULA09_TR03 {

    public static void main(String[] args) {
        byte Opt = 0;
        float temp1 = 0;
        double temp = 0;
        
        Scanner leitorTemp = new Scanner (System.in);

        Scanner leitorOpt = new Scanner (System.in);
        System.out.println("""
                           Escolha o tipo de conversão a ser realizada: 
                           1.Celsius X Fahreinheit
                           2.Fahreinheit X Celsius
                           """);
        Opt = leitorOpt.nextByte();
        
        switch(Opt){
            case 1:{
                System.out.println("Informe a temperatura em Celsius: ");
                temp1 = leitorTemp.nextFloat();
                temp = (temp1*1.8)+32;
                System.out.println("A temperatura em Fahreinheit é de: "+temp);}
                break;
            case 2:{
                System.out.println("Infome a temperatura em Fahreinheit: ");
                temp1 = leitorTemp.nextFloat();
                temp = (temp1-32)/1.8;
                System.out.println("A temperatura em Celsius é de: "+temp);
                break;
            }default: {
                System.out.println("Opção Inválida");
            }
                
        }

        leitorOpt.close();
        leitorTemp.close();
    }
}
