package Classes;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Construtores.Carro;
import Construtores.Defeito;
import Construtores.OrdemDeServico;

public class Servicos {
    
    public OrdemDeServico gerarOrdemDeServico(Carro carro, List<Defeito> defeitos){
        Random random = new Random();
        int defeitoSelecionado = random.nextInt(0, defeitos.size());
        OrdemDeServico novaOrdem = new OrdemDeServico(carro, defeitos.get(defeitoSelecionado));
        return novaOrdem;
    }

    public void AdicionarOrdemLista(Scanner leitor, List<OrdemDeServico> listaDeOrndes, List<Defeito> defeitos ){

        String marca = "";
        String modelo = "";
        int ano = 0;

        System.out.println("Informe a marca do carro: ");
        marca = leitor.nextLine();
        
        System.out.println("Informe o modelo do carro: ");
        modelo = leitor.nextLine();
        
        System.out.println("Inform o ano do carro");
        ano = leitor.nextInt();

        Carro carroAdd = new Carro(marca, modelo, ano);

        var ordem = this.gerarOrdemDeServico(carroAdd, defeitos);

        listaDeOrndes.add(ordem);

        System.out.println("Ordem adicioada com sucesso!");
    }

}
