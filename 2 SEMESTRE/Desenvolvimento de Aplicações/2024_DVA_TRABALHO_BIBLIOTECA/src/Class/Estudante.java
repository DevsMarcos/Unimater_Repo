package Class;

//Classe estudante que herda a Classe Membro
public class Estudante extends Membro {
    //Possui como atributo adicional StringCurso; 
    private String curso;

    //Método Construtor, recebe como parâmetro os atributos da Classe Membro mais o atributo específico da Classe Estudante.
    public Estudante(String nome, int idMembro, String curso) {
        super(nome, idMembro);
        this.curso = curso;
    }

    //Métodos toString(), retorna uma representação em forma de String(tetxo), do objeto.
    //Aqui refereênciamos os atributos da classe Membro e da Classe Estudante, para obeter os valores.
    @Override
    public String toString() {
        return "\n"+
                "Nome do estudante: "+super.getNome()+"\n"+
                "ID do membro: "+super.getIdMembro()+"\n"+
                "Curso: "+this.curso;
    }
}
