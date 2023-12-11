package controler;

import view.TelaEmprestimo;

public class ControladorEmprestimos {
    ControladorSistema controladorSistema;
    TelaEmprestimo telaEmprestimo;

    public ControladorEmprestimos(ControladorSistema controladorSistema){
        this.controladorSistema =  controladorSistema;
        this.telaEmprestimo = new TelaEmprestimo();
    }


    public void abreTela(){
        this.telaEmprestimo.telaOpcoes();
    }


}   