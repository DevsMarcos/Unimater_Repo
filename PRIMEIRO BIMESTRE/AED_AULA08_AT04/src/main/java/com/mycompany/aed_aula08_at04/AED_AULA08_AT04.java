/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aed_aula08_at04;

import java.util.Scanner;

/**
 *
 * @author DevsMarcos
 */
public class AED_AULA08_AT04 {

    public static void main(String[] args) {
        System.out.println("CALCULADORA DE CALORIAS");
        byte prato = 0;
        byte sobremesa = 0;
        byte bebida = 0;
        int caloriasTotais = 0; 
        
        Scanner leitorPrato = new Scanner(System.in);
        System.out.print("""
        Escolha uma dos pratos do nosso menu: \s
        1.Vehetariano \s
        2.Peixe \s
        3.Frango \s
        4.Carne
        """);
        prato = leitorPrato.nextByte();
        
        Scanner leitorSobremesa = new Scanner(System.in);
        System.out.print("""
        Escolha uma das nossa sobremesas: \s
        1.Abacaxi \s
        2.Sorvete diet \s
        3.Mouse diet \s
        4.Mouse de Chocolate
        """);
        sobremesa = leitorSobremesa.nextByte();
        
        Scanner leitorBebida = new Scanner(System.in);
        System.out.print("""
        Escolha uma das nossa bebidas:
        1.Chá \s
        2.Suco de laranja \s
        3.Suco de melão \s
        4.Refriferante diet
        """);
        bebida = leitorBebida.nextByte();
        
        switch(prato){
            case 1:{
                caloriasTotais+=180;
                break;
            }
            case 2:{
                caloriasTotais+=230;
                break;
            }
            case 3:{
                caloriasTotais +=250;
                break;
            }
            case 4:{
                caloriasTotais += 350;
                break;
            }
            default: {
                System.out.println("Opção Inválida");
            }
        };
        
        switch(sobremesa){
            case 1:{
                caloriasTotais+=75;
                break;
            }
            case 2:{
                caloriasTotais+=110;
                break;
            }
            case 3:{
                caloriasTotais +=170;
                break;
            }
            case 4:{
                caloriasTotais +=200;
                break;
            }
            default: {
                System.out.println("Opção Inválida");
            }
        };
        
        
        switch(bebida){
            case 1:{
                caloriasTotais+=20;
                break;
            }
            case 2:{
                caloriasTotais+=70;
                break;
            }
            case 3:{
                caloriasTotais +=100;
                break;
            }
            case 4:{
                caloriasTotais += 65;
                break;
            }
            default: {
                System.out.println("Opção Inválida");
            }
        };

        
        System.out.println("As calorias totais consumidas nessa refeição é de: "+caloriasTotais);

        leitorBebida.close();
        leitorPrato.close();
        leitorSobremesa.close();
    }
}
