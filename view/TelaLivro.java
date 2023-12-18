package view;

import java.util.HashMap;
import java.util.Map;
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

    public Map<String, Object> pegaDadosLivro() {
        System.out.println("-------- DADOS LIVRO ----------");
        
        System.out.print("Titulo: ");
        String titulo = this.input.nextLine();
        
        System.out.print("Codigo: ");
        int codigo = this.input.nextInt();
        this.input.nextLine();
        
        Map<String, Object> dados = new HashMap<>(); 
        dados.put("titulo", titulo);
        dados.put("codigo", codigo);
        
        return dados;
    }


    public int selecionaLivro() {
        System.out.print("Digite o código do livro que você deseja seleciona: ");
        int codigo = this.input.nextInt();
        this.input.nextLine();
        return codigo;
    }

    public void mostraMensagem(String msg) {
        System.out.println(msg);
    }

}