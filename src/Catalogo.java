package src;
import java.util.ArrayList;
import java.util.Scanner;

public class Catalogo {
    public static void main(String[] args) {
        /* Vai ler o que será digitado */
        Scanner scanner = new Scanner(System.in);

        ArrayList<AdaptadorDisplayVGA> adaptadoresDysplayVGAs = new ArrayList<>();
        ArrayList<AdaptadorHDMI_VGA> adaptadoresHDMI_VGAs = new ArrayList<>();
        ArrayList<CaboHDMI> cabosHDMIs = new ArrayList<>();
        ArrayList<Cadastro> cadastros = new ArrayList<>();
        ArrayList<ControleProjetor> controlesProjetores = new ArrayList<>(); 
        ArrayList<Pointer> pointers = new ArrayList<>();
        
        
        /* Criação de um objeto da classe Serviços */
        Servicos servicos = new Servicos();

        /* Laço de reptição */
        boolean parar = false;

        /* variaveis para as IDS dos equipamentos, quando o switch case 
           acessar a opção 1 (atráves do array list criado) para cadastro de equipamento */
        int id_AdaptadorDisplayVGA = 1;
        int id_AdaptadorHDMI_VGA = 1;
        int id_CaboHDMI = 1;
        int id_Cadastro = 1;
        int id_ControleProjetor = 1;
        int id_Pointer = 1;

        do{
            /* Recebe o valor inteiro digitado pelo usuário dentro da classe serviços, 
               linkcando com o objeto criado para a classe Serviços  */
            int opcao = servicos.opcoes();

            /* Switch Case - Configuração das funções das opções criadas na classe Servicos, 
               utilizando a variável opcao (que acessa o objeto servico criado para a classe Servicos) */
            switch (opcao) {
                case 1:  
                    /* Cria um objeto da ArrayList para adcionar equipamentos */
                    adaptadoresDysplayVGAs.add(servicos.adicionarAdaptadoresDysplayVGAs(id_AdaptadorDisplayVGA));
                    adaptadoresHDMI_VGAs.add(servicos.adicionarAdaptadoresHDMI_VGAs(id_AdaptadorHDMI_VGA));
                    cabosHDMIs.add(servicos.adicionarCabosHDMIs(id_CaboHDMI));
                    cadastros.add(servicos.adicionarCabosHDMIs(id_Cadastro));                    
                    controlesProjetores.add(servicos.adicionarControlesProjetores(id_ControleProjetor));                    
                    pointers.add(servicos.adcionarPointers(id_Pointer));                    

                    break;
                case 6:
                    parar = true;
                    System.out.println("Encerrando...");                    
                    break;
            }
        }while(!parar);


        /* microEquipamentos */




    }
}
