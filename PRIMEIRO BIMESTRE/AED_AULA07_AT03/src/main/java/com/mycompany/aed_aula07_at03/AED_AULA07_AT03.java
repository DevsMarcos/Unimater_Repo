/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aed_aula07_at03;

import java.util.Scanner;

/**
 *
 * @author DevsMarcos
 */
public class AED_AULA07_AT03 {

    public static void main(String[] args) {
        String nome = "";
        
        Scanner leitorNome = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        nome = leitorNome.nextLine();
        
        Scanner leitorGenero = new Scanner(System.in);
        System.out.println("Informe o seu geneêro [M/F]: ");
        char genero = leitorGenero.nextLine().toUpperCase().charAt(0);
        
        if (genero == 'F'){
            System.out.println("Seja Bem-Vinda Sra. "+nome);
        }else if(genero == 'M'){
            System.out.println("Seja Bem-Vindo Sr. "+nome);
        }else{
            System.out.println("Genero informado não válido!");
        };

        leitorGenero.close();
        leitorNome.close();
    }
}
