package Classes;
import java.util.Scanner;



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


}
