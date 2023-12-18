package view;

import java.util.HashMap;
import java.util.Scanner;

public class TelaAmigo {

    private final Scanner input;



    public TelaAmigo() {

    this.input = new Scanner(System.in);
        
    }
    
    
    public int telaOpcoes() {
        System.out.println("-------- AMIGOS ----------");
        System.out.println("Escolha a opcao");
        System.out.println("1 - Incluir Amigo");
        System.out.println("2 - Alterar Amigo");
        System.out.println("3 - Listar Amigos");
        System.out.println("4 - Excluir Amigo");
        System.out.println("0 - Retornar");
        int opcao = this.input.nextInt();
        this.input.nextLine();
        return opcao;

    }

    public HashMap<String, String> pegadaDadosAmigo() {
        HashMap<String, String> dadosAmigo = new HashMap<>();

        System.out.println("-------- DADOS AMIGO ----------");
        System.out.print("Nome: ");
        String nome = this.input.nextLine();

        System.out.print("Telefone: ");
        String telefone = this.input.nextLine();

        System.out.print("CPF: ");
        String cpf = this.input.nextLine();

        dadosAmigo.put("nome", nome);
        dadosAmigo.put("telefone", telefone);
        dadosAmigo.put("cpf", cpf);

        return dadosAmigo;
        
    }

    public void imprimeCabecalho() {
        System.out.println("LISTA DE AMIGOS");
        System.out.println("---------------"); 
        System.out.printf("%-15s %-15s %s\n", "Nome", "Telefone", "CPF"); 
    }
      
    public void imprimeAmigo(String nome, String telefone, String cpf) {
        System.out.printf("%-15s %-15s %s\n", nome, telefone, cpf);
    }

    public void mostraMensagem(String msg) {
        System.out.println(msg);
    }

}