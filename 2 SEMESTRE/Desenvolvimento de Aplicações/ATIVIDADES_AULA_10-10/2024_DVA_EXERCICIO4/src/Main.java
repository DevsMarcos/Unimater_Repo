public class Main {
    public static void main(String[] args) {
        DispositivoConectado smartphone = new Smartphone();
        DispositivoConectado computador = new Computador();

        executarDispositivoInteligente(smartphone);
        executarDispositivoInteligente(computador);

    }
    public static void executarDispositivoInteligente(DispositivoConectado dispositivo){
        dispositivo.ligar();
        dispositivo.conectarInternet();
        dispositivo.deligar();
        System.out.println();
    }
}
