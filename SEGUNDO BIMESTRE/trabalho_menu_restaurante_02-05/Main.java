import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //-------------------



        //-------------
        int opcao = -1;

        while (opcao != 0) {
            opcao = ExibirMenu(leitor);
        }
    }

    private static int ExibirMenu(Scanner leitor){
        int opcao;
        System.out.println("""
                1 - Adicionar item
                2 - Atribuir valor ao item
                3 - Listar os itens
                4 - Criar novo pedido
                6 - Adicionar item no pedido
                7 - Mostrar valor total do pedido
                """);
        opcao = leitor.nextInt();
        leitor.nextLine();
        return opcao;
    }
}
