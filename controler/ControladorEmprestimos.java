package controler;

import java.util.ArrayList;
import java.util.HashMap;

import model.Emprestimo;
import view.TelaEmprestimo;

public class ControladorEmprestimos {
    ControladorSistema controladorSistema;
    private TelaEmprestimo telaEmprestimo;
    private ArrayList<Emprestimo> emprestimos;

    public ControladorEmprestimos(ControladorSistema controladorSistema){
        this.controladorSistema =  controladorSistema;
        this.telaEmprestimo = new TelaEmprestimo();
        this.emprestimos = new ArrayList<>();
    }
    
    public Emprestimo pegaEmprestimoPorCodigo(int codigo) {
        for (Emprestimo emprestimo: emprestimos){
            if (emprestimo.getCodigo() == codigo) {
                return emprestimo;
            }
        }
        return null;
    }

    public void fazEmprestimo() {
        this.controladorSistema.getControladorAmigos().listaAmigos();
        this.controladorSistema.getControladorLivros().listaLivro();
        dados_emprestimo = this.telaEmprestimo.pegaDadosEmprestimo();
    }

    public void listaEmprestimos() {

    }

    public void devolveEmprestimo() {

    }

    public void voltar() {

    }




    public void abreTela(){
        HashMap<Integer, Runnable> listaOpcoes = new HashMap<>();
        listaOpcoes.put(1, this::fazEmprestimo);
        listaOpcoes.put(2, this::listaEmprestimos);
        listaOpcoes.put(3, this::devolveEmprestimo);
        listaOpcoes.put(0 , this::voltar);

        int opcao = this.telaEmprestimo.telaOpcoes();

        if (listaOpcoes.containsKey(opcao)) {
            listaOpcoes.get(opcao).run();
        } else {
            System.out.println("Opção inválida. Tente novamente.");
            this.abreTela();
        }
    }

    




}   