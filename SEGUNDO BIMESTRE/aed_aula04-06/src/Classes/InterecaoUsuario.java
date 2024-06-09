package Classes;
import java.util.List;
import java.util.Scanner;

import Construtores.Defeito;
import Construtores.OrdemDeServico;

public class InterecaoUsuario {

    public int EscolhaOpcao(Scanner leitor){
        int opcaoEscolher = 0;

        System.out.println("""
                Oficina do Flávio
                Escolha uma das opções abaixo: 
                1. Adicionar Ordem de Serviço
                2. Verificar ordens de serviço abertas
                3. Aprovar Ordem de Serviço
                4. Sair
                """);

        opcaoEscolher = leitor.nextInt();
        return opcaoEscolher;
    }

    public void InterecaoEscolha(Scanner leitor, List<OrdemDeServico> listaDeOrndes, List<Defeito> defeito) {
    InterecaoUsuario opcaoIntereacao = new InterecaoUsuario();
    Servicos adicionarServico = new Servicos();

    int opcaoEscolhida = opcaoIntereacao.EscolhaOpcao(leitor);
        do {
            switch (opcaoEscolhida) {
                case 1:
                    adicionarServico.AdicionarOrdemLista(leitor, listaDeOrndes, defeito );
                    opcaoEscolhida = 0;
                    break;
            }
        } while (opcaoEscolhida != 4);
    }
    
}
