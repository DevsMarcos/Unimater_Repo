package Class;

//Classe Professor que herda classe Membro
public class Professor extends Membro {
    //Atributos Específicos da Classe Professor
    private String departamento;
    private String materia;

    //Construtor da classe Professor, recebe como parâmetro os atributos da Classe Membro, mais os atributos específicos da Classe
    public Professor(String nome, int idMembro, String departamento, String materia) {
        super(nome, idMembro);
        this.departamento = departamento;
        this.materia = materia;
    }

    //método toStrig para realizar a representação textual, ou seja, em forma de forma de String da Classe. 
    //Utiliza de métodos para acessar atributos da Classe Pai Membro, como nome e ID.
    @Override
    public String toString() {
        return "\n"+
                "Nome do Professor: "+super.getNome()+"\n"+
                "ID do membro: "+super.getIdMembro()+"\n"+
                "Departamento: "+this.departamento+"\n"+
                "Matéria: "+this.materia;
    }
}
