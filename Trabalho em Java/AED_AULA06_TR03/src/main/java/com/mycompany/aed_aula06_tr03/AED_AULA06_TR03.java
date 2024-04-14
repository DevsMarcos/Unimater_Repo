/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aed_aula06_tr03;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author devsmarcos
 */
public class AED_AULA06_TR03 {

    public static void main(String[] args) {
        //Imposto ICMS 17%
        //Imposto PIS 7%
        //Imposto COFINS 1.65
        float custo = 0;
        float margem = 150f/100;
        double imposto = 74.35f/100;
        double precoDeVendaSemImposto = 0;
        double precoDeVendaComImposto = 0;
        double valorImpostos = 0;
        
        Scanner leitorCusto = new Scanner(System.in);
        System.out.println("Informe o valor de custo do seu produto:");
        DecimalFormat deci = new DecimalFormat("0.00");

        custo = leitorCusto.nextFloat();
        
        precoDeVendaSemImposto = custo + (custo*margem);
        precoDeVendaComImposto = precoDeVendaSemImposto/(imposto);
        valorImpostos = precoDeVendaComImposto - precoDeVendaSemImposto;
        
        System.out.println("O valor do seu produto SEM IMPOSTOS é de: "+deci.format(precoDeVendaSemImposto));
        System.out.println("Valor mínimo de venda do produto é: "+deci.format(precoDeVendaComImposto));
        System.out.println("Valor de impostos:"+deci.format(valorImpostos));

        
        
    }
}
