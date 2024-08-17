/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aed_aula06_tr05;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author devsmarcos
 */
public class AED_AULA06_TR05 {

    public static void main(String[] args) {
        int userInitialValue = 0;
        int userFinalValue = 0;
        int number = 0;
        Scanner leitorUserValue = new Scanner(System.in);
        System.out.println("Informe o valor inicial: ");
        userInitialValue = leitorUserValue.nextInt();
        
        Scanner leitorFinalValue = new Scanner(System.in);
        System.out.println("Informe o valor final: ");
        userFinalValue = leitorFinalValue.nextInt();
        
        Random random = new Random();
        number = random.nextInt(userInitialValue, userFinalValue);
        
        System.out.println("Numero aleatório: "+number);
    }
}
