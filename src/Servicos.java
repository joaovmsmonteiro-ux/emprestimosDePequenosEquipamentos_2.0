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

    //Submenu para escolher qual tipo de equipamento cadastrar    
    public int cadastroTipoEquipamento(){
        System.out.println("\n--- Escolha o Equipamento para Cadastrar ---");
        System.out.println("[1] Adaptador DisplayPort/VGA");
        System.out.println("[2] Adaptador HDMI/VGA");
        System.out.println("[3] Cabo HDMI");
        System.out.println("[4] Controle de Projetor");
        System.out.println("[5] Pointer");
        System.out.println("[0] Voltar ao menu principal");

        int tipo = scanner.nextInt();
        scanner.nextLine();
        return tipo;
    }

    //Metodos de adição de equipamento
    public AdaptadorDisplayVGA addAdaptadoresDisplayVGAs(int id){
        System.out.println("Cadastrando Adaptador Display / VGA (ID: ");
        String nome = scanner.nextLine();
        //AdaptadorDisplayVGA adaptadorDisplayVGA = new AdaptadorDisplayVGA(id, nome);
        //return adaptadorDisplayVGA;
        System.out.println("Adaptador Display / VGA adcionado com sucesso!");
        return new AdaptadorDisplayVGA(id, nome);
    }

    public AdaptadorHDMI_VGA addAdaptadoresHDMI_VGAs(int id){
        System.out.println("Cadastrando Adaptador HDMI / VGA (ID: ");
        String nome = scanner.nextLine();
        System.out.println("Adaptador HDMI / VGA adcionado com sucesso!");
        return new AdaptadorHDMI_VGA(id, nome);
    }

    public CaboHDMI addCabosHDMI(int id){
        System.out.println("Cadastrando Cabos HDMI (ID: ");
        String nome = scanner.nextLine();
        System.out.println("Cabos HDMI adcionado com sucesso!");
        return new CaboHDMI(id, nome);
    }

    public ControleProjetor addControlesProjetores(int id){
        System.out.println("Cadastrando Controle de Projetor (ID: ");
        String nome = scanner.nextLine();
        System.out.println("Controle de Projetor adcionado com sucesso!");
        return new ControleProjetor(id, nome);
    }

    public Pointer addPointers(int id){
        System.out.println("Cadastrando Pointer (ID: ");
        String nome = scanner.nextLine();
        System.out.println("Pointer adcionado com sucesso!");
        return new Pointer(id, nome);
    }
}
