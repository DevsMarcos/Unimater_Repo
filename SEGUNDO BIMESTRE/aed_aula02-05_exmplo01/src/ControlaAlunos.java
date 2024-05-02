import java.util.Scanner;

public class ControlaAlunos {
    
    public String[] adiconaAluno(String[] alunos, Scanner leitor){
        System.out.println("Informe o nome do novo aluno: ");
        String novoAluno = leitor.nextLine();
        String[] novoArray;


        novoArray = new String[alunos.length + 1];


        for (int i = 0; i < alunos.length; i++) {
            novoArray[i] = alunos[i];
        }

        novoArray[novoArray.length -1 ] = novoAluno;


        return alunos;

    }
}
