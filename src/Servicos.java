package src;

import java.util.Scanner;

public class Servicos {

    /* Vai ler o que será digitado */
    Scanner scanner = new Scanner(System.in);

    public int opcoes(){
        System.out.println("Digite a opção desejada: ");
        System.out.println("[1] Adcionar Equipamento");
        System.out.println("[2] Listar Equipamento");
        System.out.println("[3] Emprétimo de Equipamento");
        System.out.println("[4] Devolver Equipamento");
        System.out.println("[5] Excluir Equipamento");
        System.out.println("[6] Encerrar Formulário");
        /* Cria uma varável para o usuário escolher as opções acima e o sistema ler a opção escolhida*/
        int opcao = scanner.nextInt();
        /* Inicio da converção de String para int:*/
        /* -> 1 - Leitura da string */
        scanner.nextLine();
        /* -> 2 - Retorna o que foi escrito (String) para valores inteiros (int) */
        return opcao;
    }
}
