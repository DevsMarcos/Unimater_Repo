package Class;


public class Professor extends Membro {
    private String departamento;
    private String materia;

    public Professor(String nome, int idMembro, String departamento, String materia) {
        super(nome, idMembro);
        this.departamento = departamento;
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "\n"+
                "Nome do Professor: "+super.getNome()+"\n"+
                "ID do membro: "+super.getIdMembro()+"\n"+
                "Departamento: "+this.departamento+"\n"+
                "Matéria: "+this.materia;
    }
}
