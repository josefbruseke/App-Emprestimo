package view;

import java.util.Scanner;

public class TelaLivro {
    
    private final Scanner input;

    public TelaLivro() {
        this.input = new Scanner(System.in);
    }

    public int abreTela() {
        System.out.println("-------- LIVROS ----------");
        System.out.println("1 - Incluir Livro");
        System.out.println("2 - Alterar Livro");
        System.out.println("3 - Listar Livro");
        System.out.println("4 - Excluir Livro");
        System.out.println("0 - Retornar");
        System.out.print("Escolha a opção desejada: ");
        int opcao = this.input.nextInt();
        this.input.nextLine();
        return opcao;
    }

    public Object[] pega_dados_livro() {
        System.out.println("----- DADOS DO LIVRO ------");
        System.out.print("Título: ");
        String titulo = this.input.nextLine();
        System.out.print("\n");
        System.out.print(" Codigo: ");
        int codigo = this.input.nextInt();
        this.input.nextLine();
        Object[] dados = {titulo, codigo};
        return dados;
    }

}