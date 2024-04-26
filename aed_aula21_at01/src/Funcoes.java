import java.util.Scanner;

public class Funcoes {

    public void verificarPalindromo(){
        String normal = "";
        String invertida = "";
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a palavra ou frase que você deseja verificar que é palíndromo: ");
        normal = leitor.nextLine().toUpperCase();

        for (int i = normal.length(); i >= 0; i--) {
            invertida += normal.toUpperCase().charAt(i);
        }

        if (normal.equals(invertida)) {
            System.out.println("Você possui um palíndromo!");
            System.out.println("Normal: "+normal);
            System.out.println("Invertida: "+invertida);
        }else {
            System.out.println("Você NÃO POSSUI um palíndromo");
            System.out.println("Normal: "+normal);
            System.out.println("Invertida: "+invertida);
        }
        leitor.close();

    }

    public void ordenaArray(){
        int[] numeros = {1 ,6 ,8, 0, 3};
        int numAtual = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i; j < numeros.length; j++) {
                if (numeros[i] < numeros[j]) {
                   numAtual = numeros[j];
                   numeros[j] = numeros[i];
                   numeros[i] = numAtual;
            }
           
            }
        }

        System.out.println(numeros);
    }

    public void calculoJurosCompostos(){
        double montate = 0; 
        float capital = 0f;
        float taxaDeJuros = 0f;
        int tempo = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o valor do capital inicial que você deseja aplicar: ");
        capital = leitor.nextFloat();

        System.out.println("Informe a taxa de juros anual em porcento: ");
        taxaDeJuros = leitor.nextFloat();

        System.out.println("Informe por quanto tempo você deseja deixar essse dinheiro aplicado: ");
        tempo = leitor.nextInt();

        montate = capital * Math.pow((1 + taxaDeJuros), tempo);

        System.out.println("O montate final da sua aplicaççao é de: "+montate);

        leitor.close();
    }

    public void contaPalavras(){
        String palavras = "";
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        palavras = leitor.nextLine();

       int numerosInt = palavras.split(" ").length;

       System.out.println("O número de espaços é de: "+numerosInt);

       leitor.close();
       
    }

    public void calculaDistanciaPontos(){
        float x1 = 0;
        float y1 = 0;
        float x2 = 0;
        float y2 = 0;
        Scanner leitor = new Scanner(System.in);

    }

}
