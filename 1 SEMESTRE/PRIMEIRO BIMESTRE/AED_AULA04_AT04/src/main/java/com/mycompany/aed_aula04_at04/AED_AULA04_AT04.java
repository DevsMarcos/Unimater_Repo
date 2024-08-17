/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aed_aula04_at04;

import java.util.Scanner;

/**
 *
 * @author devsmarcos
 */
public class AED_AULA04_AT04 {

    public static void main(String[] args) {
        //Declare e ininicialize uma variável do tipo String chamada name com o seu pŕoŕio nome. 
        //Em seguida imprima uma mensagem que diga "Olá, meu nome é[nome], sequenvcia delcare outra vairável, e através da Class Scanner, pela ao usuário informar
        // seu sobrenome e em seguida printa seu nome completo.
        
        String nome = "Marcos";
        String sobrenome = "";
        
        System.out.println("Ola meu nome é "+nome);
        
        Scanner leitorSobrenome = new Scanner(System.in);
        System.out.println("Informe seu sobrenome: ");
        sobrenome = leitorSobrenome.next();
        
        System.out.println("Ola meu nome é "+nome+" "+sobrenome);

        leitorSobrenome.close();
    }
}
