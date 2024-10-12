public class PagamentoCartaoCredito extends Pagamento{

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de "+valor+" realizado com cartão de crédito!");
    }
}
