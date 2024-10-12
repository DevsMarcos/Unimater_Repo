public class PagamentoBoleto extends Pagamento{
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de "+valor+" realizaddo com Boleto!");
    }
}
