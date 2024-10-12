public class Main {
    public static void main(String[] args) {

        Veiculo carro = new Carro();
        Veiculo moto = new Moto();

        testeVeiculo(carro);
        testeVeiculo(moto);
    }

    public static void testeVeiculo(Veiculo veiculo){
        veiculo.acelerar();
        veiculo.frear();
        System.out.println(veiculo.getTipoCombustivel());
        System.out.println();
    }
};
