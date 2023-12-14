package controler;

import java.util.ArrayList;
import java.util.HashMap;

import model.Livro;
import view.TelaLivro;

public class ControladorLivros {
    TelaLivro telaLivro;
    private ArrayList<Livro> livros;
    private ControladorSistema controladorSistema;

    public ControladorLivros(ControladorSistema controladorSistema) {
        this.controladorSistema = controladorSistema;
        this.telaLivro = new TelaLivro();
        this.livros = new ArrayList<>();
    }

    public void incluirLivro() {
        Object[] dadosLivro = this.telaLivro.pega_dados_livro();
        String titulo = (String) dadosLivro[0]; 
        int codigo = (int) dadosLivro[1];
        Livro novo_livro = new Livro(titulo, codigo);
        this.livros.add(novo_livro);
        this.abreTela();        
    }

    public void alterarLivro() {

    }

    public void listaLivro() {
        System.out.println("Código      Titulo");
        for (int i = 0; i < this.livros.size(); i++) {
            Livro livro = this.livros.get(i);
            System.out.print(livro.getCodigo());
            System.out.print("           ");
            System.out.println(livro.getTitulo());
        }
        this.abreTela();
    }

    public void retornar() {
        this.controladorSistema.abreTela();
    }

    public void excluirLivro() {

    }

    public void abreTela() {
        HashMap<Integer, Runnable> listaOpcoes = new HashMap<>();
        listaOpcoes.put(1, this::incluirLivro);
        listaOpcoes.put(2, this::alterarLivro);
        listaOpcoes.put(3, this::listaLivro);
        listaOpcoes.put(4, this::excluirLivro);
        listaOpcoes.put(0, this::retornar);

        int opcao = this.telaLivro.abreTela();

        if (listaOpcoes.containsKey(opcao)) {
            listaOpcoes.get(opcao).run();
        } else {    
            this.abreTela();
        }

    }
}