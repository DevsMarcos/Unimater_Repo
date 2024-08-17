import java.util.Scanner;

public class ControleNotas {

    // cria uma posição a mais na segunda coluna do array bi dos alunos
    public double[][] adicionarAvaliacao(String[] alunos, double[][] notas, Scanner leitor){
        // valida se já existe alunos
        if(alunos.length < 1){
            System.out.println("Primeiro adicione um aluno");
            return notas; // retorno interrompe o método
        }else if(notas[0].length < 1){ // valida se já existe alguma avaliação
            // caso não existe ele cria um array com um espaço na segunda coluna
            // e mantém o tamanho da primeira coluna
            System.out.println("Primeira avaliacao adicionada");
            return new double[alunos.length][1];
        }
        // cria um array com uma coluna a mais; 
        double[][] novoArray = new double[notas.length][notas[notas.length-1].length+1];
        // copia o array antigo para o novo
        for (int i = 0; i < notas.length ; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                novoArray[i][j] = notas[i][j];
            }
        }
        System.out.println("Avaliacao "+ novoArray[notas.length-1].length + " adicionada");
        return novoArray;
    }

    // adiciona valores no vetor bi que já existe
    public void lancarNotas(String[] alunos, double[][] notas, Scanner leitor){
        System.out.println("Informe o codigo do aluno");
        int codigoAluno = leitor.nextInt();
        leitor.nextLine();


        if(codigoAluno > (alunos.length -1)){
            System.out.println("Aluno não encontrado");
            return;
        } else if(notas[codigoAluno].length < 1){
            System.out.println("Cadastre uma avaliacao antes");
            return;
        }

        int codigoAvaliacao = -1;
        for (int i = 0; i < notas[codigoAluno].length; i++) {
            System.out.println("Avaliação " + (i+1) + ": " + notas[codigoAluno][i]);

        }
        System.out.println("Qual avaliação deseja lançar a nota?");
        codigoAvaliacao = leitor.nextInt() -1;
        leitor.nextLine();
        

        if(codigoAvaliacao > notas[codigoAluno].length){
            System.out.println("Avaliacao nao encontrada");
            return;
        }

        System.out.println("Informe a nota");
        double nota = leitor.nextDouble();
        leitor.nextLine();

        notas[codigoAluno][codigoAvaliacao] = nota;
    }
}
