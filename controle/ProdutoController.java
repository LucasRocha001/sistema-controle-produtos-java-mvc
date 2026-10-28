package controle;

import java.awt.event.*;
import java.util.ArrayList;

import modelo.Produto;
import visao.TelaProduto;

public class ProdutoController implements ActionListener {

    private TelaProduto tela;
    private ArrayList<Produto> produtos = new ArrayList<>();

    public ProdutoController(TelaProduto tela) {
        this.tela = tela;
        tela.adicionarListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String comando = e.getActionCommand();

        if (comando.equals("Salvar")) {
            salvarProduto();
        }

        if (comando.equals("Listar")) {
            listarProdutos();
        }
    }

    private void salvarProduto() {
        try {
            String nome = tela.getNome().trim();

            double preco = Double.parseDouble(
                tela.getPreco().trim().replace(",", ".")
            );

            int quantidade = Integer.parseInt(
                tela.getQuantidade().trim()
            );

            if (nome.isEmpty() || !Double.isFinite(preco)
                    || preco < 0 || quantidade < 0) {
                tela.exibirMensagem("Dados inválidos!");
                return;
            }

            Produto produto = new Produto(nome, preco, quantidade);
            produtos.add(produto);

            tela.exibirMensagem("Produto salvo com sucesso!");
            tela.limparCampos();

        } catch (NumberFormatException erro) {
            tela.exibirMensagem("Preço ou quantidade inválidos!");
        }
    }

    private void listarProdutos() {

        if (produtos.isEmpty()) {
            tela.exibirMensagem("Nenhum produto cadastrado.");
            return;
        }

        StringBuilder lista = new StringBuilder();

        for (Produto produto : produtos) {
            lista.append(produto.toString()).append("\n");
        }

        tela.exibirMensagem(lista.toString());
    }
}



