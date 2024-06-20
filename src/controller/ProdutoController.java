package controller;

import model.Produto;
import repository.ProdutoRepository;

import java.util.ArrayList;
import java.util.Objects;

public class ProdutoController implements ProdutoRepository {

    private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
    int id = 0;

    @Override
    public void procurarProduto(int id) {
        var produto = buscarNaLista(id);

        if (produto != null)
            produto.visualizar();
        else
            System.out.println("\nO produto de id : " + id + " não foi encontrado!");

    }

    @Override
    public void procurarPorNome(String nome) {
        var produto = buscarPorNome(nome);

        if (produto != null)
            produto.visualizar();
        else
            System.out.println("\nO Produto : " + nome + " não foi encontrado!");

    }

    @Override
    public void listarProdutos() {
        for (var produto : listaProdutos) {
            produto.visualizar();
        }
    }

    @Override
    public void cadastrar(Produto produto) {
        listaProdutos.add(produto);
        System.out.println("\nO produto  " + produto.getNome() + " foi cadastrado com sucesso!");

    }

    @Override
    public void atualizar(Produto produto) {
        var buscarProduto = buscarNaLista(produto.getId());

        if (buscarProduto != null) {
            listaProdutos.set(listaProdutos.indexOf(buscarProduto), produto);
            System.out.println("\n o produto de ID: " + produto.getId() + " foi atualizado com sucesso!");
        } else
            System.out.println("\nO produto de id : " + id + " não foi encontrado!");
    }

    @Override
    public void deletar(int id) {
        var produto = buscarNaLista(id);

        if (produto != null) {
            if (listaProdutos.remove(produto))
                System.out.println("\nO produto de ID: " + id + " foi deletado com sucesso!");
        } else
            System.out.println("\nO produto de id : " + id + " não foi encontrado!");
    }

    public Produto buscarNaLista(int id) {
        for (var produto : listaProdutos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public Produto buscarPorNome(String nome) {

        String nomeMinusculo = nome.toLowerCase();

        for (var produto : listaProdutos) {
            if (Objects.equals(produto.getNome().toLowerCase(), nomeMinusculo)) {
                return produto;
            }
        }
        return null;
    }

    public int gerarId() {
        return ++id;
    }
}
