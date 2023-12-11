package controler;

import java.util.HashMap;

import model.Amigo;
import view.TelaAmigo;

public class ControladorAmigos {
    private Amigo amigo;
    private TelaAmigo telaAmigo;
    private ControladorSistema controladorSistema;

    public ControladorAmigos(ControladorSistema controladorSistema) {
        this.controladorSistema = controladorSistema;
        this.telaAmigo = new TelaAmigo();
    }


    public void incluirAmigo() {

    }

    public void alterarAmigo() {

    }

    public void listaAmigos() {

    }

    public void excluirAmigo() {

    }

    public void retornar() {
        
    }

    public void abreTela() {
        HashMap<Integer, Runnable> listaOpcoes = new HashMap<>();
        listaOpcoes.put(1, this::incluirAmigo);
        listaOpcoes.put(2, this::alterarAmigo);
        listaOpcoes.put(3, this::listaAmigos);
        listaOpcoes.put(4, this::excluirAmigo);
        listaOpcoes.put(0, this::retornar);

        int opcao = this.telaAmigo.telaOpcoes();
        if (listaOpcoes.containsKey(opcao)) {
            listaOpcoes.get(opcao).run();
        } else {
            System.out.println("Opção Inválida. Tente novamente");
            this.abreTela();
        }

    }


}

