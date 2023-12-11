package view;

import java.util.Scanner;

public class TelaAmigo {
    
    public int telaOpcoes() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("-------- AMIGOS ----------");
            System.out.println("Escolha a opcao");
            System.out.println("1 - Incluir Amigo");
            System.out.println("2 - Alterar Amigo");
            System.out.println("3 - Listar Amigos");
            System.out.println("4 - Excluir Amigo");
            System.out.println("0 - Retornar");
            int opcao = input.nextInt();
            return opcao;
        }

    }
}