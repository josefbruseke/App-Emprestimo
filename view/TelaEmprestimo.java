package view;

import java.util.HashMap;
import java.util.Scanner;

public class TelaEmprestimo {

    private final Scanner input;

    public TelaEmprestimo() {
        this.input = new Scanner(System.in);
    }
    
    public int telaOpcoes() {
        System.out.println("---------- EMPRESTIMOS ----------");
        System.out.println("1 - Fazer Emprestimo");
        System.out.println("2 - Listar Emprestimos");
        System.out.println("3 - Devolver Emprestimo");
        System.out.println("0 - Voltar");
        System.out.print("Escolha a opção desejada: ");
        int opcao = this.input.nextInt();
        this.input.nextLine();
        return opcao;
    }

    public HashMap<String, Integer> pegaDadosEmprestimo() {
        HashMap<String, Integer> dados = new HashMap<>();

        System.out.println("-------- DADOS EMPRESTIMO ----------");
        System.out.println("CPF Amigo: ");
        int cpfAmigo = this.input.nextInt();
        this.input.nextLine();
        System.out.println("Codigo Livro: ");
        int codigoLivro = this.input.nextInt();
        this.input.nextLine();
        dados.put("cpf Amigo", cpfAmigo);
        dados.put("codigo Livro", codigoLivro);
        return dados;

    }

    


}