package aed_aula15_ex03;

public class Main {
    public static void main(String[] args) {
        int [] numeros = {1 ,2, 3, 4, 5};

         
        //Forma 1 de passar pelo array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        //Forma 2 de passar pelo arrayf
        for(int numero : numeros){
            System.out.println(numero);
        }
    }
}