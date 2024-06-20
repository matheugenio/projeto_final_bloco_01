package model;

public class Console extends Produto {

    private String armazenamento;

    public Console(int id, String nome, float preco, String fabricante, int tipo, String armazenamento) {
        super(id, nome, preco, fabricante, tipo);
        this.armazenamento = armazenamento;

    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Armazenamento: " + this.armazenamento);


    }
}
