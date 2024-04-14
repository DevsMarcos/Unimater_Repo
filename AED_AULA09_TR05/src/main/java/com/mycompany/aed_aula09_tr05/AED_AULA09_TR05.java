/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aed_aula09_tr05;

import java.util.Scanner;

/**
 *
 * @author DevsMarcos
 */
public class AED_AULA09_TR05 {

    public static void main(String[] args) {
        float preco = 0;
        float precoDesc = 0;
        float desc = 0;
        byte opt = 0;
        float desc15 = 15f/100;
        float desc20  = 20f/100;
        float desc5 = 5f/100;
        
        Scanner leitorPreco = new Scanner (System.in);
        System.out.println("Informe o valor do seu produto: R$");
        preco = leitorPreco.nextFloat();
        
        Scanner leitorOpt = new Scanner (System.in);
        System.out.println("""
                           Escolha a categoria do seu produto; 
                           1.Eletronicos
                           2.Vestuário
                           3.Alimento
                           """);
        opt = leitorOpt.nextByte();
        
        switch(opt){
            case 1:{
                desc = preco * desc15;
                precoDesc = preco - desc;
                System.out.println("O valor do seu produto com 15% de desconto é de: R$"+precoDesc);
                break;
            }
            case 2:{
                desc = preco * desc20;
                precoDesc = preco - desc;
                System.out.println("O valor do seu produto com 20% de desconto é de: R$"+precoDesc);
                break;
            }
            case 3:{
                desc = preco * desc5;
                precoDesc = preco - desc;
                System.out.println("O valor do seu produto com 5% de desconto é de: R$"+precoDesc);
                break;
                
            }default: {
                System.out.println("Opção Inválida");
            }
        }
        leitorOpt.close();
        leitorPreco.close();
        
    }
}
