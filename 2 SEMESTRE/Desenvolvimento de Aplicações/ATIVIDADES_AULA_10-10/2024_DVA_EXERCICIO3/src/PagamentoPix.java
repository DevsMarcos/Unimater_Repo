public class PagamentoPix extends Pagamento{
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de "+valor+" realizado com Pix!");
    }
}
