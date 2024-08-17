import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setIdade(18);
        pessoa1.setNome("Marcos");
        pessoa1.setCidade("São lourenço do oeste");
        pessoa1.setRua("Travessa das mariposas");
        pessoa1.setNumero(10);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Amanda");
        pessoa2.setIdade(20);
        pessoa2.setCidade("São lourenço do oeste");
        pessoa2.setRua("Rua Pedro Álvares Cabral");
        pessoa2.setNumero(201);

        System.out.println(pessoa1.printarInformacoes());
        System.out.println(pessoa2.printarInformacoes());

        /*Como as funções para definir e obter valores ajudam a proteger e controlar o acesso aos dados dos objetos?
        * Pois permite realiza o acesso e modificação controlada dos tributos do objeto em questão, impedindo comportamentos inesperados
        * e a atribuição de valores indesejados aos atributos, ale´m de ser possível com essa prática, realizar a manutenção e evoluçaõ do código
        * de forma simplificada o tipos de aceeso em determinadas circunstâncias;
        * */

        /*Qual seria a vantagem de utilizar esses conceitos em um sistema mais complexo?
         A vantegem está justamente na manutenção do código, pois permite realizar refatorações de forma simplificada,
         reaalizar o controle de acesso e modificação dos atributos, e eseconder a complexidade dos projeto em si além de
         realizar a proteção dos dados como um todo
         */


    }
}