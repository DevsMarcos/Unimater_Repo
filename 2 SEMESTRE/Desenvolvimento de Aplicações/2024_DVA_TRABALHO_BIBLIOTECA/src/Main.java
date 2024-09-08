import Classes.InterecaoComUsuario;
import Construtores.Autor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Autor> listaDeAutores = new ArrayList<>();
        InterecaoComUsuario novaInteracao = new InterecaoComUsuario(leitor);

        listaDeAutores = novaInteracao.adcionarNaListaDeAutores(listaDeAutores);

        for (Autor autor : listaDeAutores){
            System.out.println(autor);
        }
    }
}