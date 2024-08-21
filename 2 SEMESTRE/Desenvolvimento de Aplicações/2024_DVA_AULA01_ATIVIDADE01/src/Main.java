public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        Endereco endereco1 = new Endereco();

        endereco1.setRua("Avenida TUpinamba");
        endereco1.setNumero(54);
        endereco1.setCidade("Slo");

        pessoa1.setNome("Ana");
        pessoa1.setIdade(12);
        pessoa1.setEndereco(endereco1.toString());

        Endereco endereco2 = new Endereco();
        Pessoa pessoa2 = new Pessoa();

<<<<<<< HEAD
        endereco2.setRua("Avenida TUpinamba");
        endereco2.setNumero(54);
        endereco2.setCidade("Slo");
=======
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

>>>>>>> 30f5995c3e71d1930cf881c6e61d09345dc4d9f9

        pessoa2.setNome("Ana");
        pessoa2.setIdade(12);
        pessoa2.setEndereco(endereco1.toString());


        System.out.println(pessoa1.printarInfos());
        System.out.println(pessoa2.printarInfos());

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
