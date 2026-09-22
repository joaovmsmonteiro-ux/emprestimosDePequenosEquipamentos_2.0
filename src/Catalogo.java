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
                    //Chama o submenu para cadastrar cada item individualmente
                    int tipoEquipamento = servicos.cadastroTipoEquipamento();

                    switch (tipoEquipamento) {
                        case 1:
                            //Cria objeto da do submenu para ser adcionado no Formulário 
                            // utilizando as variaveis cirada para os IDS
                            adaptadoresDysplayVGAs.add(servicos.addAdaptadoresDisplayVGAs(id_AdaptadorDisplayVGA));
                            id_AdaptadorDisplayVGA++;                                
                            break;
                        case 2:
                            adaptadoresHDMI_VGAs.add(servicos.addAdaptadoresHDMI_VGAs(id_AdaptadorHDMI_VGA));
                            id_AdaptadorHDMI_VGA++;
                            break;
                        case 3:
                            cabosHDMIs.add(servicos.addCabosHDMI(id_CaboHDMI));
                            id_CaboHDMI++;
                            break;
                        case 4:
                            controlesProjetores.add(servicos.addControlesProjetores(id_ControleProjetor));
                            id_ControleProjetor++;
                            break;
                        case 5:
                            pointers.add(servicos.addPointers(id_Pointer));
                            id_Pointer++;
                            break;
                        case 0:
                            System.out.println("Retornando...");
                            break;                    
                        default:
                            break;
                    }
                break;
                case 6:
                    parar = true;
                    System.out.println("Encerrando...");                    
                    break;
                default:
                    System.out.println("Opção inválida no menu principal!");
            }
        }while(!parar);
        scanner.close();
    }
}
