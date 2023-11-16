package model;

public class Emprestimo {
    private String livro;
    private Amigo amigo;
    private Integer codigo;

    public Emprestimo(String livro, Amigo amigo, Integer codigo) {
        this.livro = livro;
        this.amigo = amigo;
        this.codigo = codigo;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getLivro(){
        return this.livro;
    }

    public void setAmigo(Amigo amigo) {
        this.amigo = amigo;
    }

    public Amigo getAmigo() {
        return this.amigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return this.codigo;
    }

}
