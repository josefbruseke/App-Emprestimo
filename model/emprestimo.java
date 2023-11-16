package model;

public class Emprestimo {
    private String livro;
    private Amigo amigo;
    private Integer codigo;

    public void setLivro(String LivroUsuario) {
        livro = LivroUsuario;
    }

    public String getLivro(){
        return livro;
    }

    public void setAmigo(Amigo AmigoUsuario) {
        amigo = AmigoUsuario;
    }

    public Amigo getAmigo() {
        return amigo;
    }

    public void setCodigo(Integer CodigoUsuario) {
        codigo = CodigoUsuario;
    }

    public Integer getCodigo() {
        return codigo;
    }

}
