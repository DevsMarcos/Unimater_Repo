public class App {
    public static void main(String[] args){
        Carro car1 = new Carro("Ford", "Fusion", 2010, 165000, 11.5, 180);
        Carro car2 = new Carro("Ford", "Ecosport", 2007, 180000, 9, 200);
        car1.exibirDetalhes();
        car2.exibirDetalhes();

        CarroService serices = new CarroService();
        serices.CarroRodado(car1);
        serices.comparar(car1, car2);

    }
}
