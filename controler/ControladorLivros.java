package controler;

import java.util.HashMap;

import view.TelaLivro;

public class ControladorLivros {
    TelaLivro telaLivro;

    public ControladorLivros(ControladorSistema controladorSistema) {
        this.telaLivro = new TelaLivro();
    }

    public void incluirLivro() {

    }

    public void alterarLivro() {

    }

    public void listaLivro() {

    }

    public void retornar() {
        
    }


    public void abreTela() {
        HashMap<Integer, Runnable> listaOpcoes = new HashMap<>();
        listaOpcoes.put(1, this::incluirLivro);
        listaOpcoes.put(2, this::alterarLivro);
        listaOpcoes.put(3, this::listaLivro);
        listaOpcoes.put(4, this::retornar);
        int opcao = this.telaLivro.abreTela();

        if (listaOpcoes.containsKey(opcao)) {
            listaOpcoes.get(opcao).run();
        } else {
            this.abreTela();
        }

    }
}