package Classes;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Consumer;

import Construtores.Carro;
import Construtores.Defeito;
import Construtores.OrdemDeServico;

public class Servicos {

    InterecaoUsuario resposta = new InterecaoUsuario();
    
    public OrdemDeServico gerarOrdemDeServico(Carro carro, List<Defeito> defeitos){
        Random random = new Random();
        int defeitoSelecionado = random.nextInt(0, defeitos.size());
        OrdemDeServico novaOrdem = new OrdemDeServico(carro, defeitos.get(defeitoSelecionado));
        return novaOrdem;
    }

    public List<OrdemDeServico> adicionarOrdemLista(Scanner leitor, List<OrdemDeServico> listaDeOrndes, List<Defeito> defeitos ){
        Carro carro = resposta.criarCarro(leitor);
        OrdemDeServico ordem = this.gerarOrdemDeServico(carro, defeitos);
        listaDeOrndes.add(ordem);
        System.out.println("Ordem adicioada com sucesso!");
        return listaDeOrndes;
    }

    public void printarOrdens(List<OrdemDeServico> listaDeOrdens){
        Consumer<OrdemDeServico> printaComIndex =
        evento -> {
            System.out.println((listaDeOrdens.indexOf(evento)+1) + "----------------------------------------"+ "\n" + evento);
        };
        listaDeOrdens.stream()
        .forEach(printaComIndex);
}

}
