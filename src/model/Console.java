package model;

public class Console extends Produto {

    private String tipo;
    private String armazenamento;

    public Console(int id, String nome, float preco, String fabricante, String tipo, String armazenamento) {
        super(id, nome, preco, fabricante);
        this.armazenamento = armazenamento;
        this.tipo = tipo;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Armazenamento: " + this.armazenamento);
        System.out.println("Tipo: " + this.tipo);

    }
}
