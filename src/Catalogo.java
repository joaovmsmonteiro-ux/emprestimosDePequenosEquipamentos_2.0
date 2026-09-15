package src;
import java.util.ArrayList;
import java.util.Scanner;

public class Catalogo {
    public static void main(String[] args) {
        /* Vai ler o que será digitado */
        Scanner scanner = new Scanner(System.in);

        ArrayList<AdaptadorDysplayVGA> adaptadoresDysplayVGAs = new ArrayList<>();
        ArrayList<AdaptadorHDMI_VGA> adaptadoresHDMI_VGAs = new ArrayList<>();
        ArrayList<CaboHDMI> cabosHDMIs = new ArrayList<>();
        ArrayList<Cadastro> cadastros = new ArrayList<>();
        ArrayList<Catalogo> catalogos = new ArrayList<>();
        ArrayList<ControleProjetor> controlesProjetores = new ArrayList<>(); 
        ArrayList<Pointer> pointers = new ArrayList<>();
        
        
        /* Criação de um objeto da classe Serviços */
        Servicos servicos = new Servicos();

        /* Laço de reptição */
        boolean parar = false;
        do{
            /* Recebe o valor inteiro digitado pelo usuário dentro da classe serviços, 
               linkcando com o objeto criado para a classe Serviços  */
            int opcao = servicos.opcoes();

            /* Switch Case - Configuração das funções das opções criadas na classe Servicos, 
               utilizando a variável opcao (que acessa o objeto servico criado para a classe Servicos) */
            switch (opcao) {
                case 1:                    
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
