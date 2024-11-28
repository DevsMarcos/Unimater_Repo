public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("aob3405", "Gasolina", 66);
        Caminhao caminhao = new Caminhao("aob4444", "Diesel", 500);

        carro.abastacer(60);
        caminhao.abastacer(560);

    }
}
