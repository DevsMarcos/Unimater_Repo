import java.util.Scanner;

public class VerificarPalindromos {
    public void FuncaoPalidromos(Scanner leitor){
        String normal = "";
        String invertida = "";

        System.out.println("Informe a palavra ou frase que você deseja verificar que é palíndromo: ");
        normal = leitor.nextLine().toUpperCase().replace(" ", "");

        for (int i = normal.length()-1; i >= 0; i--) {
            invertida += normal.toUpperCase().replace(" ", "").charAt(i);
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
        
    }
}
