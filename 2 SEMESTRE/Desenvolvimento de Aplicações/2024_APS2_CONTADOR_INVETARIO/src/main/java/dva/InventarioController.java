package dva;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

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
    private ListView listView;
    @FXML
    private TextField txtLabel;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        txtLabel.setOnAction(event -> onKeyPress());
    }

    List<Produto> listaAtualizada = new ArrayList<>();


    private void onKeyPress() {
        String textoDigitado = txtLabel.getText();


        Produto produto = buscarProdutoPorCodigo(textoDigitado, Estoque.estoqueAtual());

        if (produto == null){
            System.out.println("Produto inexistente");
        }else {
            produto.setSaldo(1);
            listaAtualizada.add(produto);
            System.out.println("Lista atualizada");
            System.out.println(listaAtualizada);


        }
    }

    private Produto buscarProdutoPorCodigo(String codigo, List<Produto> produtos){
        for (Produto produto : produtos){
            if (produto.getCodBarras().equals(codigo)){
                return produto;
            }
        }
        return null;
    }
}
