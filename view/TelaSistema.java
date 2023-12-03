package view;

import java.util.Scanner;

public class TelaSistema{

    public int telaOpcoes(){
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("------AMIGO DO LIVRO------");
            System.out.println("1 - Livros");
            System.out.println("2 - Amigos");
            System.out.println("3 - Emprestimos");
            System.out.println("0 - Finalizar Sistema");
            System.out.print("Escolha a opção desejada: ");
            int opcao = input.nextInt();
            return opcao;
        }
    }
}