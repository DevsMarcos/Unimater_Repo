/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aed_aula06_tr06;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author devsmarcos
 */
public class AED_AULA06_TR06 {

    public static void main(String[] args) {
        double salario = 0;
        
        int aliquota0 = 0;
        
        double aliquota75 = 7.5;
        double salarioBruto75 = 0;
        double desc75 = 0;
        
        double aliquota15 = 15.0;
        double salarioBruto15 = 0;
        double desc15 = 0;
        
        double aliquota225 = 22.5;
        double salarioBruto225 = 0;
        double desc225 = 0;
        
        double aliquota275 = 27.5;
        double salarioBruto275 = 0;
        double desc275 = 0;
        
        Scanner leitorSalario = new Scanner(System.in);
        System.out.println("Informe o valor do salário bruto: ");
        salario = leitorSalario.nextDouble();
        DecimalFormat deci = new DecimalFormat("0.00");
        
        
        salarioBruto75 = salario - (salario*(aliquota75/100));
        desc75  = salario - salarioBruto75;
        
        salarioBruto15 = salario - (salario*(aliquota15/100));
        desc15 = salario - salarioBruto15;
        
        
        salarioBruto225 = salario - (salario*(aliquota225/100));
        desc225 = salario - salarioBruto225;
        
        salarioBruto275 = salario - (salario*(aliquota275/100));
        desc275 = salario - salarioBruto275;
        
        System.out.println("Lista de descontos, conforme da Tabela referência de 2024 ");
        System.out.println("Valor do salário bruto informado: "+salario);
        System.out.println("Aliquota de "+aliquota0+"%: R$"+deci.format(aliquota0));
        System.out.println("Aliquota de "+aliquota75+"%: R$"+deci.format(desc75));
        System.out.println("Aliquota de "+aliquota15+"%: R$"+deci.format(desc15));
        System.out.println("Aliquota de "+aliquota225+"%: R$"+deci.format(desc225));
        System.out.println("Aliquota de "+aliquota275+"%: R$"+deci.format(desc275));
        
        
        
    }
}
