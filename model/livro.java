package model;

public class Livro{
    private String titulo;
    private Integer codigo;

    public Livro(String titulo, Integer codigo) {
        this.titulo = titulo;
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return this.codigo;
    }
}