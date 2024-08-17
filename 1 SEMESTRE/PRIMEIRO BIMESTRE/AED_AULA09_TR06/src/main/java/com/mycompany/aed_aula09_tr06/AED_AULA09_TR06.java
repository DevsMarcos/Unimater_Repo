/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aed_aula09_tr06;

import java.util.Scanner;

/**
 *
 * @author DevsMarcos
 */
public class AED_AULA09_TR06 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int notas200 = 10;
        int notas100 = 15;
        int notas50 = 65;
        int notas20 = 30;
        int notas10 = 15;
        int notas5 = 35;
        int notas2 = 20;
        int somaNotas = (notas200*200)+(notas100*100)+(notas50*50)+(notas20*20)+(notas10*10)+(notas5*5)+(notas2*2);
        
        int valorSacar = 0;
        int resultado = 0;
        int resto = 0;

        
        Scanner leitorSacar = new Scanner (System.in);
        System.out.println("Informe o valor que você deseja sacar: ");
        valorSacar  = leitorSacar.nextInt();
        
        resultado = valorSacar/200;
        resto = valorSacar%200;
        
        if(valorSacar <= somaNotas){
        
        if(resultado > notas200){
               System.out.println("O número de notas de 200 utilizada é de: "+notas200);
               resto +=((resultado - notas200) * 200);
        }else{
            System.out.println("O número de notas de 200 utilizada é de: "+resultado);
            if(resto == 0) return;
        }
        
        resultado = resto/100;
        resto = resto%100;
        
        if(resultado > notas100){
            System.out.println("O número de notas de 100 utilizadas é de: "+notas100);
            resto +=((resultado - notas100)*100);
        }else{
            System.out.println("O número de notas de 100 utlizadas é de: "+resultado);
            if(resto == 0 )return;
        }
        
        resultado = resto/50;
        resto = resto%50;
        
        if(resultado > notas50){
            System.out.println("O número de notas de 50 utilizadas é de: "+notas50);
            resto +=((resultado -notas50)*50);
        }else{
            System.out.println("O números de notas de 50 utilizadas é de: "+resultado);
            if(resto ==0) return;
        }
        
        resultado = resto/20;
        resto = resto%20;
        if(resultado > notas20){
            System.out.println("O número de notas de 20 utlizadas é de: "+notas20);
            resto += ((resultado - notas20)*20);
        }else{
            System.out.println("O número de notas de 20 utilizadas é de: "+resultado);
            if(resto == 0) return;
        }
        
        resultado = resto/10;
        resto = resto%10;
        if(resultado > notas10){
            System.out.println("O número de notas de 10 utlizadas é de: "+notas10);
            resto += ((resultado - notas10)*10);
        }else{
            System.out.println("O número de notas de 10 utilizadas é de: "+resultado);
            if(resto == 0) return;
        }
        
        resultado = resto/5;
        resto = resto%5;
        if(resultado > notas5){
            System.out.println("O número de notas de 5 utlizadas é de: "+notas5);
            resto += ((resultado - notas5)*5);
        }else{
            System.out.println("O número de notas de 10 utilizadas é de: "+resultado);
            if(resto == 0) return;
        }
        
        resultado = resto/2;
        resto = resto%2;
        if(resultado > notas2){
            System.out.println("O número de notas de 2 utlizadas é de: "+notas2);
            resto += ((resultado - notas2)*2);
        }else{
            System.out.println("O número de notas de 2 utilizadas é de: "+resultado);
            if(resto == 0) return;
        }}
        else{
            System.out.println("Valor para saque indisponível");
        }
        leitorSacar.close();

        
    }
        
        
    }
