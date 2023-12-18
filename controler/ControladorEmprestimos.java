package controler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import model.Amigo;
import model.Emprestimo;
import model.Livro;
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
        Random random = new Random();
        this.controladorSistema.getControladorAmigos().listaAmigos();
        this.controladorSistema.getControladorLivros().listaLivro();
        HashMap<String, Object> dadosEmprestimo = this.telaEmprestimo.pegaDadosEmprestimo();
        String cpf = (String) dadosEmprestimo.get("cpfAmigo");
        int codigo = (int) dadosEmprestimo.get("codigoLivro");

        Amigo amigo = this.controladorSistema.getControladorAmigos().pegaAmigoPorCpf(cpf);
        Livro livro = this.controladorSistema.getControladorLivros().pega_livro_por_codigo(codigo);
        Emprestimo emprestimo = new Emprestimo(livro, amigo, random.nextInt(201));   

        this.emprestimos.add(emprestimo);

    }

    public void listaEmprestimos() {
        this.telaEmprestimo.imprimeCabecalho();
        for (Emprestimo emprestimo: emprestimos) {
            telaEmprestimo.imprimeEmprestimo( 
            emprestimo.getCodigo(), 
            emprestimo.getLivro().getTitulo(), 
            emprestimo.getLivro().getCodigo(), 
            emprestimo.getAmigo().getNome(),
            emprestimo.getAmigo().getCpf());
        }
    }

    public void devolveEmprestimo() {
        this.listaEmprestimos();
        int codigoEmprestimo = this.telaEmprestimo.selecionaEmprestimo();
        Emprestimo emprestimo = this.pegaEmprestimoPorCodigo(codigoEmprestimo);

        if (emprestimo != null) {
            emprestimos.remove(emprestimo);
        } else {
            this.telaEmprestimo.mostraMensagem("Emprestimo não existente!");
        }

    }

    public void voltar() {
        this.controladorSistema.abreTela();
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