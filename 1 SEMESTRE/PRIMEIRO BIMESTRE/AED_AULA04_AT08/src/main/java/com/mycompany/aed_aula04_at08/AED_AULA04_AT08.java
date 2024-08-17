/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aed_aula04_at08;

import java.util.Scanner;

/**
 *
 * @author devsmarcos
 */
public class AED_AULA04_AT08 {

    public static void main(String[] args) {
       //7 - Elaborar um programa que apresente o valor da conversão em real (R$) de um valor lido em dólar (US$). 
       //O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares disponível com o 
       //usuário e armazenar em memória o valor da conversão antes da apresentação.
       
       double cotacao = 10.15;
       double valorTotal = 20.15;
       
        System.out.println("Calculadora de Conversão");
       
        
        Scanner leitorValorTotal = new Scanner(System.in);
        System.out.println("Digite a quantidade de dólar que vc possui: ");
        valorTotal = leitorValorTotal.nextDouble();
        
        Scanner leitorCotacao = new Scanner(System.in);
        System.out.println("Informe o valor da cotação: ");
        cotacao = leitorCotacao.nextDouble();
        
        double valorConvertido = valorTotal * cotacao;

                        
        System.out.println("O valor em reais que você possui é de: "+valorConvertido);

        leitorValorTotal.close();
        leitorCotacao.close();
    }
}
