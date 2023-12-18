package controler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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


    public Livro pega_livro_por_codigo(int codigo) {
        for (Livro livro: this.livros) {
            if (livro.getCodigo() == codigo) {
                return livro;
            }
        }
        return null;
    }


    public void incluirLivro() {
        Map<String, Object> dadosLivro = this.telaLivro.pegaDadosLivro();
        String titulo = (String) dadosLivro.get("titulo"); 
        int codigo = (int) dadosLivro.get("codigo");
        Livro novoLivro = new Livro(titulo, codigo);
        this.livros.add(novoLivro);     
    }

    public void alterarLivro() {
        this.listaLivro();
        int codigo_livro = this.telaLivro.selecionaLivro();
        Livro livro = this.pega_livro_por_codigo(codigo_livro);

        if (livro != null) {
        Map<String, Object> dadosLivro = this.telaLivro.pegaDadosLivro();
            int NovoCodigo = (int) dadosLivro.get("codigo");
            String NovoTitulo = (String) dadosLivro.get("titulo");
            livro.setTitulo(NovoTitulo);
            livro.setCodigo(NovoCodigo);
        } else {
            this.telaLivro.mostraMensagem("ATENÇÃO: Livro não existe!");
        }
    }


    public void listaLivro() {
        System.out.println("Código      Titulo");
        for (Livro livro: this.livros) {
            System.out.print(livro.getCodigo());
            System.out.print("           ");
            System.out.println(livro.getTitulo());
        }
    }

    public void retornar() {
        this.controladorSistema.abreTela();
    }

    public void excluirLivro() {
        this.listaLivro();
        int codigo_livro = this.telaLivro.selecionaLivro();
        Livro livro = this.pega_livro_por_codigo(codigo_livro);
        if (livro != null) {
            this.livros.remove(livro);
        } else {
            this.telaLivro.mostraMensagem("Anteção! Livro não existente");
        }
    }

    public void abreTela() {
        HashMap<Integer, Runnable> listaOpcoes = new HashMap<>();
        listaOpcoes.put(1, this::incluirLivro);
        listaOpcoes.put(2, this::alterarLivro);
        listaOpcoes.put(3, this::listaLivro);
        listaOpcoes.put(4, this::excluirLivro);
        listaOpcoes.put(0, this::retornar);

        while (true) {
            int opcao = this.telaLivro.abreTela();
            if (listaOpcoes.containsKey(opcao)) {
            listaOpcoes.get(opcao).run();
        } else {    
            this.abreTela();
        }
        }

    }
}