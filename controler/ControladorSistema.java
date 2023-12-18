package controler; 
import java.util.HashMap;
import view.TelaSistema;

public class ControladorSistema {
    private ControladorLivros controladorLivros;
    private ControladorAmigos controladorAmigos;
    private ControladorEmprestimos controladorEmprestimos;
    private TelaSistema telaSistema;

    public ControladorSistema() {
        this.controladorLivros = new ControladorLivros(this);
        this.controladorAmigos = new ControladorAmigos(this);
        this.controladorEmprestimos = new ControladorEmprestimos(this);
        this.telaSistema = new TelaSistema();
    }

    public ControladorLivros getControladorLivros(){
        return this.controladorLivros;
    }

    public ControladorAmigos getControladorAmigos(){
        return this.controladorAmigos;
    }

    public ControladorEmprestimos getControladorEmprestimos(){
        return this.controladorEmprestimos;
    }

    public void cadastraLivro() {
        this.controladorLivros.abreTela();
    }

    public void cadastraAmigo() {
        this.controladorAmigos.abreTela();
    }

    public void cadastraEmprestimo() {
        this.controladorEmprestimos.abreTela();
    }

    public void inicializaSistema() {
        this.abreTela();
    }

    public void encerraSistema(){
        System.out.println("Sistema foi encerrado!");
        System.exit(0);
    }

    public void abreTela() {
        HashMap<Integer, Runnable> listaOpcoes = new HashMap<>();
        listaOpcoes.put(1, this::cadastraLivro);
        listaOpcoes.put(2, this::cadastraAmigo);
        listaOpcoes.put(3, this::cadastraEmprestimo);
        listaOpcoes.put(0, this::encerraSistema);


        int opcao = this.telaSistema.telaOpcoes();

        if (listaOpcoes.containsKey(opcao)) {
            listaOpcoes.get(opcao).run();
        } else {
            System.out.println("Opção inválida. Tente novamente.");
            this.abreTela();
        }
    }
}
