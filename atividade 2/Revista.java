// Revista.java
public class Revista extends Material {

    private int edicao;

    public Revista(String titulo, int anoPublicacao, int edicao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }

    @Override
    public void descricao() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Publicação: " + getAnoPublicacao());
        System.out.println("Edição: " + edicao);
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
}

