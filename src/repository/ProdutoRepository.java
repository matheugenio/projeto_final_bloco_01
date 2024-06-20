package repository;

import model.Produto;

public interface ProdutoRepository {

    public void procurarProduto(int id);

    public void listarProdutos();

    public void cadastrar(Produto produto);

    public void atualizar(Produto produto);

    public void deletar(int id);
}
