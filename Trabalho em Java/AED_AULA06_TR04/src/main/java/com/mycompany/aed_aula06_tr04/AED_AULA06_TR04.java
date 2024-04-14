/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aed_aula06_tr04;

import java.util.Scanner;

/**
 *
 * @author devsmarcos
 */
public class AED_AULA06_TR04 {

    public static void main(String[] args) {
        double valorUser = 0;
     
        Scanner leitorValorUser = new Scanner(System.in);
        System.out.println("Informe o valor desejado: ");
        valorUser = leitorValorUser.nextFloat();
        
        double valor = valorUser/200;
        double resto = valorUser % 200;
        System.out.println("Notas de 200: "+(int)valor);
        /////////////////////////////////////////
        valor = resto /100;
        resto = resto%100;
        System.out.println("Notas de 100: "+(int)valor);
        ///////////////////////////////////////////////
        valor = resto/50;
        resto = resto%50;
        System.out.println("Notas de 50: "+(int)valor);
        //////////////////////////////
        valor = resto/20;
        resto = resto%20;
        System.out.println("Notas de 20: "+(int)valor);
        ////////////////////
        valor = resto/10;
        resto = resto%10;
        System.out.println("Notas de 10: "+(int)valor);
        /////////////////////////////
        valor = resto/5;
        resto = resto%5;
        System.out.println("Notas de 05: "+(int)valor);
        /////////////////////////
        valor = resto/2;
        resto = resto%2;
        System.out.println("Notas de 2: "+(int)valor);
        /////////////////
        valor = resto/1;
        resto = resto%1;
        System.out.println("Notas de 01: "+(int)valor);
        //////////////////////////////////
        valor = resto/0.50;
        resto = resto%0.50;
        System.out.println("Moedas de 0.50: "+(int)valor);
        ///////////////////////
        valor = resto/0.25;
        resto = resto%0.25;
        System.out.println("Moedas de 0.25: "+(int)valor);
        ///////////////////////////////////
        valor = resto/0.10;
        resto = resto%0.10;
        System.out.println("Moedas de 0.10: "+(int)valor);
        //////////////////////////////////
        valor = resto/0.05;
        resto = resto%0.05;
        System.out.println("Meodas de 0.05: "+(int)valor);
    }
}
