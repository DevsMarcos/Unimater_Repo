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

        endereco2.setRua("Avenida TUpinamba");
        endereco2.setNumero(54);
        endereco2.setCidade("Slo");

        pessoa2.setNome("Ana");
        pessoa2.setIdade(12);
        pessoa2.setEndereco(endereco1.toString());


        System.out.println(pessoa1.printarInfos());
        System.out.println(pessoa2.printarInfos());
    }
}