/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aed_aula03_at01;

import java.util.Scanner;

/**
 *
 * @author devsmarcos
 */
public class AED_AULA03_AT01 {

    public static void main(String[] args) {
        String nome = "Jose";
        int idade = 19;
        double altura = 1.80;
        boolean moradorDePb = false;
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o seu nome: ");
        nome = leitor.next();

        Scanner leitorIdade = new Scanner(System.in);
        System.out.println("Informe a sua idade:");
        idade = leitorIdade.nextInt();
        
        Scanner leitorAltura = new Scanner(System.in);
        System.out.println("Informe a sua altura: ");
        altura = leitorAltura.nextDouble();
        
        Scanner leitorBool = new Scanner(System.in);
        System.out.println("Você mora em Pato Branco [Sim/Não]: ");
        moradorDePb = leitorBool.next().toUpperCase().equals("Sim");
        

        System.out.println("Sua idade é de: "+idade);
        System.out.println("Seu nome é: "+nome);
        System.out.println("Sua altura é: "+altura);
        System.out.println("Você mora em Pato Branco: "+moradorDePb);
        leitor.close();
        leitorAltura.close();
        leitorBool.close();
        leitorIdade.close();
       
    }
}
