package controler;

import java.util.ArrayList;
import java.util.HashMap;

import model.Amigo;
import view.TelaAmigo;

public class ControladorAmigos {
    private TelaAmigo telaAmigo;
    private ControladorSistema controladorSistema;
    private ArrayList<Amigo> amigos;

    public ControladorAmigos(ControladorSistema controladorSistema) {
        this.controladorSistema = controladorSistema;
        this.telaAmigo = new TelaAmigo();
        this.amigos = new ArrayList<>();
    }


    public void incluirAmigo() {
        HashMap<String, String> dadosAmigo = this.telaAmigo.pegadaDadosAmigo();
        String nome = dadosAmigo.get("nome");
        String telefone = dadosAmigo.get("telefone");
        String cpf = dadosAmigo.get("cpf");
        Amigo novo_amigo = new Amigo(nome, telefone, cpf);
        this.amigos.add(novo_amigo);

    }

    public void alterarAmigo() {
        this.listaAmigos();
        String cpfAmigo = this.telaAmigo.selecionaAmigo();
        Amigo amigo = this.pegaAmigoPorCpf(cpfAmigo);
        if (amigo != null) {
        HashMap<String, String> dadosAmigo = this.telaAmigo.pegadaDadosAmigo();
            String novoNome = dadosAmigo.get("nome");
            String novoTelefone = dadosAmigo.get("telefone");
            String novoCpf = dadosAmigo.get("cpf");
            
            amigo.setNome(novoNome);
            amigo.setTelefone(novoTelefone);
            amigo.setCpf(novoCpf);

        } else {
            this.telaAmigo.mostraMensagem("ATENÇÃO: Amigo não existe!");
        }
    }



    public Amigo pegaAmigoPorCpf(String cpfAmigo) {
        for (Amigo amigo: this.amigos) {
            if (amigo.getCpf().equals(cpfAmigo)) {
                return amigo;
            }
        }
        return null;
    }


    public void listaAmigos() {
        this.telaAmigo.imprimeCabecalho();
        
        for(Amigo amigo : amigos) {
          this.telaAmigo.imprimeAmigo(
            amigo.getNome(),
            amigo.getTelefone(), 
            amigo.getCpf()  
          );
        }
      }

    public void excluirAmigo() {
        this.listaAmigos();
        String cpfAmigo = this.telaAmigo.selecionaAmigo();
        Amigo amigo = this.pegaAmigoPorCpf(cpfAmigo);

        if (amigo != null) {
            this.amigos.remove(amigo);
            this.listaAmigos();
        } else {
            this.telaAmigo.mostraMensagem("Amigo não existente");
        }
        
    }

    public void retornar() {
        this.controladorSistema.abreTela();
    }

    public void abreTela() {
        HashMap<Integer, Runnable> listaOpcoes = new HashMap<>();
        listaOpcoes.put(1, this::incluirAmigo);
        listaOpcoes.put(2, this::alterarAmigo);
        listaOpcoes.put(3, this::listaAmigos);
        listaOpcoes.put(4, this::excluirAmigo);
        listaOpcoes.put(0, this::retornar);

        while (true) {
           int opcao = this.telaAmigo.telaOpcoes();
        if (listaOpcoes.containsKey(opcao)) {
            listaOpcoes.get(opcao).run();
        } else {
            System.out.println("Opção Inválida. Tente novamente");
            this.abreTela();
        }
    }
    }

}

