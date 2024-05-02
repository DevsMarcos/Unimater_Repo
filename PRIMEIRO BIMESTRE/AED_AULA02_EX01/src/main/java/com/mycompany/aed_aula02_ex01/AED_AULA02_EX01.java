package com.mycompany.aed_aula02_ex01;

import java.util.Scanner;

public class AED_AULA02_EX01 {

    public static void main(String[] args) {
        //Declaração das Variáveis
        //Usar Scanners para leitura das vars
       //Substituir as variáveis nos devidos locais do texto abaixo
       String provedor ="";
       String atendete = "";
       String nome = "";
       
       
        Scanner leitorProvedor = new Scanner(System.in);
        System.out.println("Informe o nome do provedor: ");
        provedor = leitorProvedor.next();
        
        Scanner leitorAtendente =new Scanner(System.in);
        System.out.println("Informe o nome da atendente: ");
        atendete = leitorAtendente.next();
        
        System.out.println("Ola! Seja bem-vindo(a) ao"
        + " atendimento digital da "+provedor);
        System.out.println("Meu nome é "+atendete+", sou seu assistente virtual.");
        System.out.println("Durante o atendimento siga minhas isntruções");
        
        Scanner leitorNome = new Scanner(System.in);
        System.out.println("Primeiramente informe seu nome: ");
        nome = leitorNome.next();
        
        System.out.println("Obrigdo "+nome+" como posso lhe ajudar ?");

        leitorProvedor.close();
        leitorAtendente.close();
        leitorNome.close();
    }
}
