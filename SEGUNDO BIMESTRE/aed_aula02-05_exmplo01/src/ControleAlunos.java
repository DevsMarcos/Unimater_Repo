import java.util.Scanner;

public class ControleAlunos {

    public String[] adicionarAluno(String[] arrayParaAdicionar, Scanner leitor){
        // Cria um novo array que reflete o mesmo que já existia porém com mais um espaço
        String[] novoArray = new String[arrayParaAdicionar.length +1];
        // loop que copia o array que existia para o novo
        // para não perder os dados
        for (int i = 0; i < arrayParaAdicionar.length ; i++) {
            novoArray[i] = arrayParaAdicionar[i];
        }
        System.out.println("Informe o nome do novo aluno");
        // adiciona o novo aluno na ultima posição do novo array
        novoArray[novoArray.length -1] = leitor.nextLine();
        // devolve esse array
        return novoArray;
    }

    public double[][] adicionaAlunoListaNotas(double[][] notas){
        // cria um novo array com mais uma posição na primeira coluna do array
        // tem que fazer isso porque cada aluno vai ser representado por uma posição nova
        // na primeira coluna do array de notas
        double[][] novoArrayNotas;
        if(notas.length < 1){
            return new double[1][0];
        }
        // cria o novo array com o tamanho maior na primeira coluna, e mesmo tamanho na segunda
        novoArrayNotas = new double[notas.length + 1][notas[0].length];
        // funcao que copia os valores de um array que já existia para o novo
        copiaArray(notas, novoArrayNotas);
        return novoArrayNotas;

    }

    private void copiaArray(double[][] notas, double[][] novoArrayNotas) {
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                novoArrayNotas[i][j] = notas[i][j];
            }
        }
    }
}
