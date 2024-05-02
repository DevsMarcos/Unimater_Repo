/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aed_aula04_at01;

import java.util.Scanner;

/**
 *
 * @author devsmarcos
 */
public class AED_AULA04_AT01 {

    public static void main(String[] args) {
        String nome = "";
        double altura = 0;
        double peso = 0;
        
        System.out.println("Bem Vindo a calculadora de IMC");
        System.out.println("Meu nome é Ana e vou axilia-lo em em cálculo");
        
        Scanner leitorNome = new Scanner(System.in);
        System.out.println("Inicialmente digite seu  nome: ");
        nome = leitorNome.next();
        
        Scanner leitorAltura = new Scanner(System.in);
        System.out.println("Informe sua altura em (CM): ");
        altura = leitorAltura.nextDouble();
        
        Scanner leitorPeso = new Scanner(System.in);
        System.out.println("Agora informe seu peso (KG): ");
        peso = leitorPeso.nextDouble();
        
        double alturaEmMetros = Math.pow((altura/100), 2);
        double imc = peso/alturaEmMetros;
        
        System.out.println(nome+" seu IMC é de "+imc);

        leitorAltura.close();
        leitorNome.close();
        leitorPeso.close();
    }
}
