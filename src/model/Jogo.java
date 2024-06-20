package model;

public class Jogo extends Produto {

    private String genero;
    private String plataforma;

    public Jogo(int id, String nome, float preco, String fabricante, String genero, String plataforma) {
        super(id, nome, preco, fabricante);
        this.genero = genero;
        this.plataforma = plataforma;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Gênero: " + this.genero);
        System.out.println("Plataforma: " + this.plataforma);
    }
}
