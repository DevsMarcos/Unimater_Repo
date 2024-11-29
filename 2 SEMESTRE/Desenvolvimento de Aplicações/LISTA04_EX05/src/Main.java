import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;

        Scanner leitor = new Scanner(System.in);
        ProdutoImportado chaveiroDosVingadores = new ProdutoImportado("Chaveiro dos Vingadores", 130.50);
        chaveiroDosVingadores.setValotItem(chaveiroDosVingadores.calculatImposto());
        System.out.println(chaveiroDosVingadores.getValotItem());


        ProdutoImportado cheirinhoParaCarroAmericano = new ProdutoImportado("Perfume automotivo americano", 60.99);
        cheirinhoParaCarroAmericano.setValotItem(cheirinhoParaCarroAmericano.calculatImposto());


        ProdutoImportado jogoDeChavesIngles = new ProdutoImportado("Jogo de Chaves Ingles", 440.30);
        jogoDeChavesIngles.setValotItem(jogoDeChavesIngles.calculatImposto());

        Carro carro = new Carro(66);
        Moto moto = new Moto(15);
        Caminhao caminhao = new Caminhao(550);
        System.out.println("Bem-Vindo ao Posto Ipiranga, seleciona uma das opções abaixo: ");

        do {
            System.out.println("""
                1. Abastecer Veículo
                2. Lojinha de lembrancinhas importadas;
                3. Fechar Conta
                """);
            opcao = leitor.nextInt();

            switch (opcao){
                case 1 -> {
                    System.out.println("""
                            Informe o veiculo de veículo: 
                            1. Carro - Josimar
                            2. Moto - Tonho
                            3. Caminhão - Marcos
                            """);
                    int tipo = leitor.nextInt();
                    System.out.println("""
                            Informe o tipo de combustível: 
                            1. Gasolina
                            2. Etanol
                            3. Diesel
                            """);
                    int combustivel = leitor.nextInt();
                    if (tipo == 1){
                        System.out.println("Quantos litros deseja abastecer: ");
                        int litragem = leitor.nextInt();
                        carro.setQuantidadeAbastecida(litragem);
                        carro.setTipoCombustivel(combustivel);
                        carro.calcularCusto(litragem);
                    }
                    if (tipo == 2){
                        System.out.println("Quantos litros deseja abastecer: ");
                        int litragem = leitor.nextInt();
                        moto.setQuantidadeAbastecida(litragem);
                        moto.setTipoCombustivel(combustivel);
                        System.out.println("Moto abastecido como solicitado!");
                    }
                    if (tipo == 3){
                        System.out.println("Quantos litros deseja abastecer: ");
                        int litragem = leitor.nextInt();
                        caminhao.setQuantidadeAbastecida(litragem);
                        caminhao.setTipoCombustivel(combustivel);

                    }
                } case 2 ->{
                    System.out.println("""
                            Bem Vindo a nossa lojinha, escolha um dos itens abaixo:
                            1. Chaveiro dos Vingadores
                            2. Perfume automotivo americano
                            3. Jogo de Chaves Ingles
                            """);
                    int item = leitor.nextInt();
                    System.out.println("""
                            Informe o veiculo de veículo à ser adicionado a compra: 
                            1. Carro - Josimar
                            2. Moto - Tonho
                            3. Caminhão - Marcos
                            """);
                    int tipo = leitor.nextInt();
                    if (item == 1){
                        if (tipo == 1){
                            carro.adicionarProduto(chaveiroDosVingadores);
                        } else if  (tipo == 2) {
                            moto.adicionarProduto(chaveiroDosVingadores);
                        }
                        else if (tipo == 3){
                            caminhao.adicionarProduto(chaveiroDosVingadores);
                        } else {
                            System.out.println("Veículo não encontrdo");

                        }
                    }
                    if (item == 2){
                        if (tipo == 1){
                            carro.adicionarProduto(cheirinhoParaCarroAmericano);
                        } else if (tipo == 2) {
                            moto.adicionarProduto(cheirinhoParaCarroAmericano);
                        }else if (tipo == 3){
                            caminhao.adicionarProduto(cheirinhoParaCarroAmericano);
                        } else {
                            System.out.println("Veículo não encontrdo");

                        }               }
                    if (item == 3){
                        if (tipo == 1){
                            carro.adicionarProduto(jogoDeChavesIngles);
                        }else if (tipo == 2) {
                            moto.adicionarProduto(jogoDeChavesIngles);
                        }else if (tipo == 3){
                            caminhao.adicionarProduto(jogoDeChavesIngles);
                        }else {
                            System.out.println("Veículo não encontrdo");
                        }
                    }
                } case 3 -> {
                    System.out.println("""
                            Informe o veiculo de veículo que deseja finalizar a venda: 
                            1. Carro - Josimar
                            2. Moto - Tonho
                            3. Caminhão - Marcos
                            """);
                    int tipo = leitor.nextInt();
                    if (tipo == 1){
                        carro.fecharConta(carro.getQuantidadeAbastecida());
                    }else if (tipo ==2 ){
                        moto.fecharConta(carro.getQuantidadeAbastecida());
                    }else if (tipo == 3){
                        caminhao.calcularCusto(caminhao.getQuantidadeAbastecida());
                    }else {
                        System.out.println("Veículo não encontrdo");
                    }
                }
            }
        }while (opcao != 0);
    }
}
