package Class.Constructor;


public class Estudante extends Membro{
    private String curso;

    public Estudante(String nome, int idMembro, String curso) {
        super(nome, idMembro);
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "\n"+
                "Nome do estudante: "+super.getNome()+"\n"+
                "ID do membro: "+super.getIdMembro()+"\n"+
                "Curso: "+this.curso;
    }
}
