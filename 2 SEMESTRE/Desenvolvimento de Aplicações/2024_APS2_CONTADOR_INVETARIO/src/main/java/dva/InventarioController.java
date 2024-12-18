package dva;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
public class InventarioController implements Initializable {

    @FXML
    private Label labelCodigo;
    @FXML
    private Button btnEnviar;
    @FXML
    private ListView<String> listView;
    @FXML
    private TextField txtLabel;

    private List<Produto> listaEstoqueInicial;
    private List<Produto> listaAtualizada = new ArrayList<>();
    private ObservableList<String> listaObservavel = FXCollections.observableArrayList();
    private List<Produto> lista1;
    private List<Produto> lista2;
    private List<Produto> lista3;
    private int contadorFinalizar = 0;
    private int contadorFechamento = 5;
    private Timeline timeline;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        txtLabel.setOnAction(event -> onKeyPress());
        listView.setItems(listaObservavel);
        btnEnviar.setOnAction(event -> finalizar());
        listaEstoqueInicial = new ArrayList<>(Estoque.estoqueAtual());


    }

    private void onKeyPress() {
        String textoDigitado = txtLabel.getText();
        Produto produto = buscarProdutoPorCodigo(textoDigitado, Estoque.estoqueAtual());

        if (produto == null) {
            listaObservavel.clear();
            listaObservavel.add("Produto inexistente!");
        } else {
            atualizarOuAdicionarProduto(produto);

            adicionarProdutoNaLista(produto, listaAtualizada);

            atualizarListView();
            txtLabel.clear();
        }
    }

    private void adicionarProdutoNaLista(Produto novoProduto, List<Produto> lista) {
        boolean encontrado = false;
        for (Produto produto : lista) {
            if (produto.getCodBarras().equals(novoProduto.getCodBarras())) {
                produto.setSaldo(produto.getSaldo());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            Produto produtoParaAdicionar = new Produto(novoProduto.getCodBarras(), novoProduto.getDescricao(), 1);
            lista.add(produtoParaAdicionar);
        }
    }

    private void atualizarOuAdicionarProduto(Produto novoProduto) {
        boolean encontrado = false;
        for (Produto produto : listaAtualizada) {
            if (produto.getCodBarras().equals(novoProduto.getCodBarras())) {
                produto.setSaldo(produto.getSaldo() + 1);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            novoProduto.setSaldo(1);
            listaAtualizada.add(novoProduto);
        }
    }

    private void atualizarListView() {
        listaObservavel.clear();
        for (Produto produto : listaAtualizada) {
            listaObservavel.add(produto.getDescricao() + " - " + produto.getSaldo());
        }
    }

    private Produto buscarProdutoPorCodigo(String codigo, List<Produto> produtos) {
        for (Produto produto : produtos) {
            if (produto.getCodBarras().equals(codigo)) {
                return produto;
            }
        }
        return null;
    }

    private void finalizar() {
        contadorFinalizar++;

        Alert alertProxiamContagem = new Alert(Alert.AlertType.ERROR);
        alertProxiamContagem.setTitle("Aviso! ");
        alertProxiamContagem.setHeaderText("Contagem com divergência");
        alertProxiamContagem.setContentText("Contagem incorreta! "+(contadorFinalizar+1)+"° contagem iniciada!");

        Alert alertContagemCorreta = new Alert(Alert.AlertType.CONFIRMATION);
        alertContagemCorreta.setTitle("Confimação");
        alertContagemCorreta.setHeaderText("Contagem correta!");
        alertContagemCorreta.setContentText("Contagem correta e realizada com sucesso! O sistema será finalizado!");

        Alert alertDivergencia = new Alert(Alert.AlertType.INFORMATION);
        alertDivergencia.setTitle("Fianlização");
        alertDivergencia.setHeaderText("Contagem finalizanda com Divergência");

        if (contadorFinalizar == 1) {
            lista1 = new ArrayList<>(listaAtualizada);
            listaAtualizada.clear();
            if (listasIguais(lista1, listaEstoqueInicial)) {
                alertContagemCorreta.showAndWait();
                iniciarContadorFechamento();
            } else {
                listaObservavel.clear();
                alertProxiamContagem.showAndWait();
            }
        } else if (contadorFinalizar == 2) {
            lista2 = new ArrayList<>(listaAtualizada);
            listaAtualizada.clear();

            if (listasIguais(lista2, listaEstoqueInicial)) {
                alertContagemCorreta.showAndWait();
                iniciarContadorFechamento();

            } else if (listasIguais(lista2, lista1)) {

                alertDivergencia.setContentText("Contagem finalizada com divergência. Segue abaixo itens com saldo divergente:  \n"
                        + diferecasEstoque(lista2, listaEstoqueInicial));

                alertDivergencia.showAndWait();
                iniciarContadorFechamento();
            } else {
                listaObservavel.clear();
                alertProxiamContagem.showAndWait();            }

        } else if (contadorFinalizar == 3) {
            lista3 = new ArrayList<>(listaAtualizada);
            listaAtualizada.clear();

            if (listasIguais(lista3, listaEstoqueInicial)) {
                alertContagemCorreta.showAndWait();
                iniciarContadorFechamento();
            } else {
                listaObservavel.clear();
                alertDivergencia.setContentText("Contagem finalizada com divergência. Segue abaixo itens com saldo divergente:  \n"
                        + diferecasEstoque(lista3, listaEstoqueInicial));
            }
        }
    }

    private boolean listasIguais(List<Produto> listaA, List<Produto> listaB) {
        if (listaA.size() != listaB.size()) {
            return false;
        }
        ;
        for (Produto produtoA : listaA) {
            for (Produto produtoB : listaB) {
                if (produtoA.getCodBarras().equals(produtoB.getCodBarras()) &&
                        produtoA.getSaldo() == produtoB.getSaldo()) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    private String diferecasEstoque(List<Produto> listaA, List<Produto> listB) {
        StringBuilder resultado = new StringBuilder();
//        listaObservavel.add();

        for (Produto produtoA : listaA) {
            for (Produto produtoB : listB) {
                if (produtoA.getCodBarras().equals(produtoB.getCodBarras())) {
                    double diferenca = produtoA.getSaldo() - produtoB.getSaldo();
                    resultado.append(produtoA.getDescricao())
                            .append(" - Valor de Divergência: ")
                            .append(Math.abs(diferenca))
                            .append("\n");
                }
            }
        }
        return resultado.toString();

    }

    private void iniciarContadorFechamento() {
        contadorFechamento = 6;
        listaObservavel.clear();

        listaObservavel.add("Contagem realizada! O sistema irá finalizar, em 5 segundos");

        timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            contadorFechamento--;
            listaObservavel.add( "Fechando em " + contadorFechamento + " segundos...");

            if (contadorFechamento <= 0) {
                timeline.stop();
                fecharPrograma();
            }
        }));

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    private void fecharPrograma() {
        ((Stage) btnEnviar.getScene().getWindow()).close();
    }
}