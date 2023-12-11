package view;

import java.util.Scanner;

public class TelaLivro {

    public int abreTela() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("-------- LIVROS ----------");
            System.out.println("Escolha a opcao");
            System.out.println("1 - Incluir Livro");
            System.out.println("2 - Alterar Livro");
            System.out.println("3 - Listar Livro");
            System.out.println("4 - Excluir Livro");
            System.out.println("0 - Retornar");
            int opcao = input.nextInt();
            return opcao;
        }
    }

}