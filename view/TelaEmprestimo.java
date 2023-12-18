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

    public HashMap<String, Object> pegaDadosEmprestimo() {
        HashMap<String, Object> dados = new HashMap<>();

        System.out.println("-------- DADOS EMPRESTIMO ----------");
        System.out.print("CPF Amigo: ");
        String cpfAmigo = this.input.nextLine();
        System.out.print("Codigo Livro: ");
        int codigoLivro = this.input.nextInt();
        this.input.nextLine();
        dados.put("cpfAmigo", cpfAmigo);
        dados.put("codigoLivro", codigoLivro);
        return dados;

    }

    public int selecionaEmprestimo() {
        return 0;
    }

    public void mostraMensagem(String msg) {
        System.out.println(msg);
    }

    public void imprimeCabecalho() {
        System.out.println("---------------------------------------------------"); 
        System.out.println("               LISTA DE EMPRESTIMOS                ");
        System.out.println("---------------------------------------------------");
        System.out.printf(
            "%-10s %-40s %-15s %-15s %s\n", 
            "Codigo", "Titulo do Livro", "Codigo do Livro", "Emprestimo"," CPF"
            ); 
    }

    public void imprimeEmprestimo(int codEmp, String titulo, int codLivro, String nome, String cpf) {
        System.out.printf(
                        "%-10d %-40s %-15d %-15s %s\n", 
                        codEmp, titulo, codLivro, nome, cpf);
      }
    
}