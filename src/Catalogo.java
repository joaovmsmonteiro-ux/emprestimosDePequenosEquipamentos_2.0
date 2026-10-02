import java.util.ArrayList;
import java.util.Scanner;

public class Catalogo {
    public static void main(String[] args) {
        /* Vai ler o que será digitado */
        Scanner scanner = new Scanner(System.in);

        //Criação de uma ArrayLista para a classe Equipamento
        ArrayList<Equipamento> equipamentos = new ArrayList<>();
                
        /* Criação de um objeto da classe Serviços */
        Servicos servicos = new Servicos();

        /* Laço de reptição */
        boolean parar = false; 
        
        //Varíaveis para globais criadas cadastrar equipamentos no laço de repetição
        int id_equipamento = 1;


        do{
            /* Recebe o valor inteiro digitado pelo usuário dentro da classe serviços, 
               linkcando com o objeto criado para a classe Serviços  */
            int opcao = servicos.opcoes();

            /* Switch Case - Configuração das funções das opções criadas na classe Servicos, 
               utilizando a variável opcao (que acessa o objeto servico criado para a classe Servicos) */
            switch (opcao) {
                case 1:
                    equipamentos.add(servicos.adicionarEquipamento(id_equipamento));
                    id_equipamento++;
                    break;
                case 2:
                    servicos.listarEquipamentos(equipamentos);
                    break;
                case 6:
                    parar = true;
                    System.out.println("Encerrando...");
                    System.out.println();                    
                    System.out.println("...");                    
                    System.out.println();
                    System.out.println("Encerrado!!!");
                    break;
                default:
                    System.out.println("Opção inválida no menu principal!");
            }
        }while(!parar);
    }
}
