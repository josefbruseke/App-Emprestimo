package model;

public class Amigo {
    private String nome;
    private String telefone;
    private String cpf;

    public Amigo(String nome, String telefone, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTelefone(String telefoneUsuario) {
        this.telefone = telefoneUsuario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setCpf(String cpfUsuario) {
        cpf = cpfUsuario;
    }

    public String getCpf() {
        return cpf;
    }

}


