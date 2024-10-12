public class Main {
    public static void main(String[] args) {
        Pagamento cartaoCredito = new PagamentoCartaoCredito();
        Pagamento boleto = new PagamentoBoleto();
        Pagamento pix = new PagamentoPix();

        realizarPagamentoAgora(cartaoCredito);
        realizarPagamentoAgora(boleto);
        realizarPagamentoAgora(pix);
    }

    public static void realizarPagamentoAgora(Pagamento pagamento){
        pagamento.realizarPagamento(35);
    }
}
