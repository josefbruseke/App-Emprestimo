package view;

import java.util.Scanner;

public class TelaEmprestimo {
    
    public int telaOpcoes() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("---------- EMPRESTIMOS ----------");
            System.out.println("1 - Fazer Emprestimo");
            System.out.println("2 - Listar Emprestimos");
            System.out.println("3 - Devolver Emprestimo");
            System.out.println("0 - Voltar");
            System.out.print("Escolha a opção desejada: ");
            int opcao = input.nextInt();
            return opcao;
        }
    }



}