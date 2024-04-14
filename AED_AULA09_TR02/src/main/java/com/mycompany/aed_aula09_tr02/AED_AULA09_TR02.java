/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aed_aula09_tr02;

import java.util.Scanner;

/**
 *
 * @author DevsMarcos
 */
public class AED_AULA09_TR02 {

    public static void main(String[] args) {
        byte mes = 0;
        
        System.out.println("QUE ESTAÇÃO ESTAMOS ?");
        
        Scanner leitorMes = new Scanner (System.in);
        System.out.println("""
                           Inform o número do mês desejado: 
                           1.Janeiro 
                           2.Fevereiro 
                           3.Março 
                           4.Abril 
                           5.Maio 
                           6.Junho 
                           7.Julho 
                           8.Agosto 
                           9.Setembro 
                           10.Outubro 
                           11.Novembro 
                           12.Dezembro
                           """);
        mes = leitorMes.nextByte();
        
        switch(mes){
            case 1: {
                System.out.println("Verão");
                break;
            }
            case 2: {
                System.out.println("Verão");
                break;
            }
            case 3:{
                System.out.println("Verão");
                break;
            }
            case 4:{
                System.out.println("Outuno");
                break;
            }
            case 5:{
                System.out.println("Ouutono");
                break;
            }
            case 6:{
                System.out.println("Outono");
                break;
            }
            case 7:{
                System.out.println("Inverno");
                break;
            }
            case 8: {
                System.out.println("Iverno");
                break;
            }
            case 9:{
                System.out.println("Inverno");
                break;
            }
            case 10:{
                System.out.println("Verão");
                break;
            }
            case 11:{
                System.out.println("Verão");
                break;
            }
            case 12:{
                System.out.println("Verão");
                break;
            }
        }
        leitorMes.close();
    }
}
