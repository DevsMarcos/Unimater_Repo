public class App {
    public static void main(String[] args){
        Carro car1 = new Carro("Ford", "Fusion", 2010, 40000, 11.5, 180);

        Carro car2 = new Carro("Renault", "clio", 2002, 260000, 14, 90);
        car1.exibirDetalhes();
        car2.exibirDetalhes();

        CarroService serices = new CarroService();
        serices.CarroRodado(car1);
        serices.CarroRodado(car2);
        serices.comparar(car1, car2);

    }
}
