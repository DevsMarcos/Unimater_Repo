package Classes;
import java.util.List;
import java.util.Scanner;
import Construtores.Carro;
import Construtores.Defeito;
import Construtores.OrdemDeServico;

public class InterecaoUsuario {

    private final Scanner leitor;

    Servicos adicionarServico = new Servicos();

    public InterecaoUsuario(Scanner leitor){
        this.leitor = leitor;
    }


    final String RECIVE_CAR = "Informe a marca do carro: ";
    final String RECIVE_MODEL = "Informe o modelo do carro: ";
    final String RECIVE_YEAR = "Informe o ano do carro: ";
    final String ORDER_ID = "Qual das ordens de serviço você deseja rescolver: ";

    public int escolhaOpcao() {
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
        leitor.nextLine();
        return opcaoEscolher;
    }

    public Carro criarCarro() {
        String marca = "";
        String modelo = "";
        int ano = 0;

        System.out.println(RECIVE_CAR);
        marca = leitor.nextLine();

        System.out.println(RECIVE_MODEL);
        modelo = leitor.nextLine();

        System.out.println(RECIVE_YEAR);
        ano = leitor.nextInt();
        return new Carro(marca, modelo, ano);
    }

    public OrdemDeServico criarOrdem(List<Defeito> defeitos){
        Carro carro = this.criarCarro();
        OrdemDeServico novaOrdem = adicionarServico.gerarOrdemDeServico(carro, defeitos);
        return novaOrdem;
        
    }

    public OrdemDeServico ordemAResolver(List<OrdemDeServico> listaDeOrdens) {
        System.out.println(ORDER_ID);
        apresentaOrdems(listaDeOrdens);
        int numeroOrder = 0;
        numeroOrder = leitor.nextInt();
        return listaDeOrdens.get(numeroOrder-1);
    }

   

    public void apresentaOrdems(List<OrdemDeServico> listaDeOrdens){
        listaDeOrdens.forEach(
            ordem -> {
                System.out.println(
                    (listaDeOrdens.indexOf(ordem) + 1) + "----------------------------------------" + "\n" + ordem);
            }
        );
    }

    

}
