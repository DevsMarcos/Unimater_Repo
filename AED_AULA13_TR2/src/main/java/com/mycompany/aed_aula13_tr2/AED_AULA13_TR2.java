/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.aed_aula13_tr2;

import java.util.Scanner;

/**
 *
 * @author DevsMarcos
 */
public class AED_AULA13_TR2 {

    public static void main(String[] args) {
        byte optGame = 0;
        byte optHD = 0;
        short hd1 = 450;
        short hd2 = 140;
        int conta = 0;
        String ok = "";

        Scanner leitorHD = new Scanner(System.in);
        Scanner leitorOpt = new Scanner(System.in);
        System.out.println(""" 
        Bem vindo ao sistema de instalção de games!
        Escolha uma dos games a seguir:
        1.Red Dead Redemption 2 - 116GB
        2.Days Gones - 70GB 
        3.Call of Duty: Modern Warfare - 231GB 
        4.Hitman - 150GB                    """);
        optGame = leitorOpt.nextByte();

        switch (optGame) {
            case 1:
                System.out.println("""
                                   Você escolheu R2D2, em que Unidade de Armazenamento vc prentede instalar ?
                                   1.SSD
                                   2.HD
                                   """);
                optHD = leitorHD.nextByte();
                if (optHD == 1) {
                    conta = hd1 - 116;
                    hd1 -= 116;
                    ok = conta <= 0 ? "Você não possui espaço para esse game" : "Game em instalação, espaço livre disponível restante: " + hd1 + " GB";
                    System.out.println(ok);
                    break;
                } else if (optHD == 2) {
                    conta = hd2 - 231;
                    ok = conta <= 0 ? "Você não possui espaço para esse game" : "Game em instalação, espaço livre disponível restante: " + hd2 + " GB";
                    System.out.println(ok);
                    break;
                }
            case 2:
                System.out.println("""
                                   Você escolheu Days Gone, Em que HD vc prentede instalar ?
                                   1.SSD
                                   2.HD
                                   """);
                optHD = leitorHD.nextByte();
                if (optHD == 1) {
                    conta = hd1 - 70;
                    hd1 -= 70;
                    ok = conta <= 0 ? "Você não possui espaço para esse game" : "Game em instalação, espaço livre disponível restante: " + hd1 + " GB";
                    System.out.println(ok);
                    break;
                } else if (optHD == 2) {
                    conta = hd2 - 70;
                    hd2 -= 70;
                    ok = conta <= 0 ? "Você não possui espaço para esse game" : "Game em instalação, espaço livre disponível restante: " + hd2 + " GB";
                    System.out.println(ok);
                    break;
                }
            case 3:
                System.out.println("""
                                   Você escolheu Call of Duty: Modern Warfare, em que HD vc prentede instalar ?
                                   1.SSD
                                   2.HD
                                   """);
                optHD = leitorHD.nextByte();
                if (optHD == 1) {
                    conta = hd1 - 231;
                    hd1 -= 231;
                    ok = conta <= 0 ? "Você não possui espaço para esse game" : "Game em instalação, espaço livre disponível restante: " + hd1 + " GB";
                    System.out.println(ok);
                    break;
                } else if (optHD == 2) {
                    conta = hd2 - 231;
                    hd2 -= 231;
                    ok = conta <= 0 ? "Você não possui espaço para esse game" : "Game em instalação, espaço livre disponível restante: " + hd2 + " GB";
                    System.out.println(ok);
                    break;
                }
            case 4:
                System.out.println("""
                                   Você escolheu Hitman, em que HD vc prentede instalar ?
                                   1.SSD
                                   2.HD
                                   """);
                optHD = leitorHD.nextByte();
                if (optHD == 1) {
                    conta = hd1 - 150;
                    hd1 -= 150;
                    ok = conta <= 0 ? "Você não possui espaço para esse game" : "Game em instalação, espaço livre disponível restante: " + hd1 + " GB";
                    System.out.println(ok);
                    break;
                } else if (optHD == 2) {
                    conta = hd2 - 150;
                    hd2 -= 150;
                    ok = conta <= 0 ? "Você não possui espaço para esse game" : "Game em instalação, espaço livre disponível restante: " + hd2 + " GB";
                    System.out.println(ok);
                    break;
                }

            default:
                System.out.println("Opção Inválida");
                break;
        }
        leitorHD.close();
        leitorOpt.close();
    }
}
