package Classes;

import java.util.List;
import java.util.Random;

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

}
