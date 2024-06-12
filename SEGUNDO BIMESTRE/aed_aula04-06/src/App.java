import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Classes.InterecaoUsuario;
import Classes.Servicos;
import Construtores.Defeito;
import Construtores.OrdemDeServico;

public class App {
    public static void main(String[] args) {
        InterecaoUsuario opcaoIntereacao = new InterecaoUsuario();
        Servicos adicionarServico = new Servicos();

        Scanner leitor = new Scanner(System.in);

        List<OrdemDeServico> listaDeOrdens = new ArrayList<>();

        List<Defeito> defeito = new ArrayList<>();
        defeito.add(new Defeito("Engrenagens da Caixa Quebradas", 3200, 3));
        defeito.add(new Defeito("Velas pifadas", 650, 1));
        defeito.add(new Defeito("Bateria Fraca", 350, 1));
        defeito.add(new Defeito("Pastilhas de freio gastas", 430, 2));

        int opcaoEscolhida = 0;
        do {
            opcaoEscolhida = opcaoIntereacao.EscolhaOpcao(leitor);
            switch (opcaoEscolhida) {
                case 1:
                    listaDeOrdens = adicionarServico.adicionarOrdemLista(leitor, listaDeOrdens, defeito);
                    opcaoEscolhida = 0;
                    break;
                case 2:
                    adicionarServico.printarOrdens(listaDeOrdens);
                    opcaoEscolhida = 0;
                    break;
            }
        } while (opcaoEscolhida != 4);

        listaDeOrdens.forEach(System.out::println);

    }

}
