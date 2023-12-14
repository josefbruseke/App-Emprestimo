package view;

import java.util.Scanner;

public class TelaSistema{

    private final Scanner input;

    public TelaSistema() {
        this.input = new Scanner(System.in);
    }
    
    public int telaOpcoes(){
        System.out.println("------AMIGO DO LIVRO------");
        System.out.println("1 - Livros");
        System.out.println("2 - Amigos");
        System.out.println("3 - Emprestimos");
        System.out.println("0 - Finalizar Sistema");
        System.out.print("Escolha a opção desejada: ");
        int opcao = this.input.nextInt();
        this.input.nextLine();
        return opcao;
    }
}