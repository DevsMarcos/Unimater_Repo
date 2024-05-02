import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        ControlaAlunos ControlaAlunos = new ControlaAlunos();
        int optMenu = -1;
        String[] alunos = new String[0];
        float[][] notas = new float[0][0];

        while (optMenu != 0) {
            optMenu=  listarMenu(leitor);

            switch (optMenu) {
                case 1:{
                    alunos = ControlaAlunos.adiconaAluno(alunos, leitor);
                }
                    
                    break;
                case 4: {

                    for (int i = 0; i < alunos.length; i++) {
                        System.out.println(i + alunos[i]);
                    }
                }
                break;
                default:
                    break;
            }
        }
}


    private static int listarMenu(Scanner leitor){
        int optMenu;

        System.out.println("""
            1-Cadastrar Aluno
            2-Adcionar Avaliação
            3-Lançar nota
            4-Listar Alunos
            """);

        optMenu = leitor.nextInt();
        leitor.nextLine();

        return optMenu;

    }
}
