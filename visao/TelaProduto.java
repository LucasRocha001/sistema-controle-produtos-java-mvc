
package visao;

import java.awt.*;
import java.awt.event.*;

public class TelaProduto extends Frame {

    private TextField txtNome = new TextField(20);
    private TextField txtPreco = new TextField(20);
    private TextField txtQuantidade = new TextField(20);

    private Button btnSalvar = new Button("Salvar");
    private Button btnListar = new Button("Listar");

    private TextArea areaTexto = new TextArea(5, 30);

    public TelaProduto() {

        setTitle("Cadastro de Produtos");
        setSize(400, 300);
        setLayout(new BorderLayout(10, 10));

        Panel painelCampos = new Panel(new GridLayout(3, 2, 5, 5));

        painelCampos.add(new Label("Nome:"));
        painelCampos.add(txtNome);

        painelCampos.add(new Label("Preço:"));
        painelCampos.add(txtPreco);

        painelCampos.add(new Label("Quantidade:"));
        painelCampos.add(txtQuantidade);

        Panel painelBotoes = new Panel(new FlowLayout());

        painelBotoes.add(btnSalvar);
        painelBotoes.add(btnListar);

        Panel painelSuperior = new Panel(new BorderLayout(5, 5));
        painelSuperior.add(painelCampos, BorderLayout.CENTER);
        painelSuperior.add(painelBotoes, BorderLayout.SOUTH);

        add(painelSuperior, BorderLayout.NORTH);
        add(areaTexto, BorderLayout.CENTER);

        areaTexto.setEditable(false);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public String getNome() {
        return txtNome.getText();
    }

    public String getPreco() {
        return txtPreco.getText();
    }

    public String getQuantidade() {
        return txtQuantidade.getText();
    }

    public void exibirMensagem(String mensagem) {
        areaTexto.setText(mensagem);
    }

    public void adicionarListener(ActionListener listener) {
        btnSalvar.addActionListener(listener);
        btnListar.addActionListener(listener);
    }

    public void limparCampos() {
        txtNome.setText("");
        txtPreco.setText("");
        txtQuantidade.setText("");
    }
}
