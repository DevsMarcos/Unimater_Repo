import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setIdade(18);
        pessoa1.setNome("Marcos");
        pessoa1.setCidade("São lourenço do oeste");
        pessoa1.setRua("Travessa das mariposas");
        pessoa1.setNumero(10);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Amanda");
        pessoa2.setIdade(20);
        pessoa2.setCidade("São lourenço do oeste");
        pessoa2.setRua("Rua Pedro Álvares Cabral");
        pessoa2.setNumero(201);

        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());

    }
}