/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aed_aula08_at02;

import java.util.Scanner;

/**
 *
 * @author DevsMarcos
 */
public class AED_AULA08_AT02 {

    public static void main(String[] args) {
        byte num = 0;
        
        Scanner leitorNum = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7: ");
        num = leitorNum.nextByte();
        
        switch (num) {
            case 1: {
                System.out.println("Domingo");
                break;
            }
            case 2: {
                System.out.println("Segunda-Feira");
                break;
            }
            case 3: {
                System.out.println("Terça-Feira");
                break;
            }
            case 4:{
                System.out.println("Quarta-Feira");
                break;
            }
            case 5:{
                System.out.println("Quinta-Feira");
                break;
            }
            case 6:{
                System.out.println("Sexta-Feira");
                break;
            }
            case 7:{
                System.out.println("Sábado");
                break;
            }
            default:{
                System.out.println("Opção Inválida");
                break;
            }
        }
        leitorNum.close();
    }
}
