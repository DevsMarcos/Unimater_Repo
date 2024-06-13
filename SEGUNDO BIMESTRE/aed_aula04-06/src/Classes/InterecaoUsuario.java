package Classes;
import java.util.Scanner;

import Construtores.Carro;

public class InterecaoUsuario {

    public int EscolhaOpcao(Scanner leitor) {
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

    public Carro criarCarro(Scanner leitor){
        String marca = "";
        String modelo = "";
        int ano = 0;

        System.out.println("Informe a marca do carro: ");
        marca = leitor.nextLine();
        
        System.out.println("Informe o modelo do carro: ");
        modelo = leitor.nextLine();
        
        System.out.println("Inform o ano do carro");
        ano = leitor.nextInt();
        return new Carro(marca, modelo, ano);
    }


}
