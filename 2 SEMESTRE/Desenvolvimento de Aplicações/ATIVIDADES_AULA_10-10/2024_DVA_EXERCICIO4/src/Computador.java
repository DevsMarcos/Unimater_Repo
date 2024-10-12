public class Computador implements DispositivoConectado{
    @Override
    public void conectarInternet() {
        System.out.println("O computador se encontra conectado na internet!");
    }

    @Override
    public void ligar() {
        System.out.println("O computador está iniciando!");

    }

    @Override
    public void deligar() {
        System.out.println("O computador está desligando!");

    }
}
