/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aed_aula04_at05;

/**
 *
 * @author devsmarcos
 */
public class AED_AULA04_AT05 {

    public static void main(String[] args) {
        //Declare duas variáveis do tipo int chamdas altura e largura e inicializa-as com quaisquer valores. 
        //Em seguida, calcule a área e o perímetro de um retângulo, com a largura e a altura e imnpreima os resultados.
        
        int altura = 5;
        int largura = 10;
        
        int area = altura*largura;
        int perimetro= 2*(altura+largura);
        
        System.out.println("O períemtro do retangulo é de "+perimetro+" e a área é de "+area);
        
    }
}
