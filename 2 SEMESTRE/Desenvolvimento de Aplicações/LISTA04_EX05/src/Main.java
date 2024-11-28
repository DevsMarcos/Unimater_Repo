import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int opcao = 0;
        Produto chaveiroDosVingadores = new Produto("Chaveiro dos Vingadores", 130.50);
        Produto cheirinhoParaCarroAmericano = new Produto("Perfume automotivo americano", 60.99);
        Produto jogoDeChavesIngles = new Produto("Jogo de Chaves Ingles", 440.30);

        Carro carro = new Carro();
        Moto moto = new Moto();
        Caminhao caminhao = new Caminhao();
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
                        carro.setCombustivel(combustivel);
                        carro.calcularCusto(litragem);

                        System.out.println("Carro abastecido como solicitado!");
                    }
                    if (tipo == 2){
                        System.out.println("Quantos litros deseja abastecer: ");
                        int litragem = leitor.nextInt();
                        carro.setCombustivel(combustivel);
                        carro.calcularCusto(litragem);
                        System.out.println("Moto abastecido como solicitado!");
                    }
                    if (tipo == 3){
                        System.out.println("Quantos litros deseja abastecer: ");
                        int litragem = leitor.nextInt();
                        carro.setCombustivel(combustivel);
                        carro.calcularCusto(litragem);
                        System.out.println("Caminhão abastecido como solicitado!");
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
                        } if (tipo == 2) {
                            moto.adicionarProduto(cheirinhoParaCarroAmericano);
                        }if (tipo == 3){
                            caminhao.adicionarProduto(chaveiroDosVingadores);
                        }
                    }
                    if (item == 2){
                        if (tipo == 1){
                            carro.adicionarProduto(cheirinhoParaCarroAmericano);
                        } if (tipo == 2) {
                            moto.adicionarProduto(cheirinhoParaCarroAmericano);
                        }if (tipo == 3){
                            caminhao.adicionarProduto(cheirinhoParaCarroAmericano);
                        }                    }
                    if (item == 3){
                        if (tipo == 1){
                            carro.adicionarProduto(jogoDeChavesIngles);
                        } if (tipo == 2) {
                            moto.adicionarProduto(jogoDeChavesIngles);
                        }if (tipo == 3){
                            caminhao.adicionarProduto(jogoDeChavesIngles);
                        }
                    }
                } case -> 3{
                    System.out.println("""
                            Informe o veiculo que deseja fechar a conta: 
                            1. Carro - Josimar
                            2. Moto - Tonho
                            3. Caminhão - Marcos
                            """);
                    int tipo = leitor.nextInt();
                }
            }
        }while (opcao != 0);




    }
}
