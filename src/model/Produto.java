package model;

public abstract class Produto {

    private int id;
    private String nome;
    private float preco;
    private String fabricante;
    private int tipo;

    public Produto(int id, String nome, float preco, String fabricante, int tipo) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.fabricante = fabricante;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void visualizar() {

        System.out.println("\n\n***********************************************************");
        System.out.println("Dados do Produto:");
        System.out.println("***********************************************************");
        System.out.println("Id do produto: " + this.id);
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Preço do produto: " + this.preco);
        System.out.println("Fabricante: " + this.fabricante);

    }
}
