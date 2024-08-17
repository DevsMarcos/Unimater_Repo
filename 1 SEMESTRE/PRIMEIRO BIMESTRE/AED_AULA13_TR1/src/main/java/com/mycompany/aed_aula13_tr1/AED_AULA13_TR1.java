/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.aed_aula13_tr1;

import java.util.Scanner;

/**
 *
 * @author DevsMarcos
 */
public class AED_AULA13_TR1 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        String user = "MarcosMacedo";
        String password = "007890";
        String userDigitado = "";
        String passDigitado = "";
        int tentativas = 1;

        Scanner leitorUser = new Scanner(System.in);
        System.out.println("Digite seu usuário: ");
        userDigitado = leitorUser.nextLine();

        Scanner leitorPass = new Scanner(System.in);
        System.out.println("Digite sua senha: ");
        passDigitado = leitorPass.nextLine();

        if (!user.equals(userDigitado) || !password.equals(passDigitado)) {
            System.out.println("Usuário ou senha incorretos, informe novamente seu usuário" + tentativas);
            System.out.println("Digite seu usuário: ");
            userDigitado = leitorUser.nextLine();
            System.out.println("Digite sua senha: ");
            passDigitado = leitorPass.nextLine();
            tentativas++;
        } else {
            System.out.println("Login Bem-Sucedido");
            return;
        }

        if (!user.equals(userDigitado) || !password.equals(passDigitado)) {
            System.out.println("Usuário ou senha incorretos, informe novamente seu usuário" + tentativas);
            System.out.println("Digite seu usuário: ");
            userDigitado = leitorUser.nextLine();
            System.out.println("Digite sua senha: ");
            passDigitado = leitorPass.nextLine();
            tentativas++;
        } else {
            System.out.println("Login Bem-Sucedido");
            return;
        }
        
        if (!user.equals(userDigitado) || !password.equals(passDigitado) && tentativas == 3) {
            System.out.println("Numero de tantivas excedido, tente novamente mais tarde." + tentativas);
        } else {
            System.out.println("Login Bem-Sucedido");
            return;
        }
         leitorPass.close();
         leitorUser.close();
    }
}
