import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Servicos {

    /* Vai ler o que será digitado */
    Scanner scanner = new Scanner(System.in);

    public int opcoes(){
        System.out.println("Digite a opção desejada: ");
        System.out.println("[1] Adcionar Equipamento");
        System.out.println("[2] Listar Equipamento");
        System.out.println("[3] Empréstimo de Equipamento");
        System.out.println("[4] Devolver Equipamento");
        System.out.println("[5] Excluir Equipamento");
        System.out.println("[6] Encerrar Formulário");

        //Tratamento do erro para a não repetição do WHILE quando é digitado uma data inválida
        //Tratamento para ler como String e converter para int com segurança.
        try {
            return Integer.parseInt(scanner.nextLine());
        }catch(NumberFormatException e){
            //Retorna opção inválida caso digitem texto no menu
            return 0;
        }       
    }

    public Equipamento adicionarEquipamento(int id){
        //Nome do equipamento
        System.out.println("Digite o nome do equipamento: ");
        String nomeEquipamento = scanner.nextLine();   
        
        //Cria a formatação desejada para a data
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        //Declaração de varíavel que vai guardar a data válida
        LocalDateTime cadastro = null;

        //while que vai repetir a pergunta até o usuário digitar a data correta
        while (true) {
            //Data do cadastro do equipamento
            System.out.println("Digite a data de cadastro do item (ex: 30/09/2026 16:15): ");
            //Castrao iniciado como String
            String cadastroTexto = scanner.nextLine();
        
            try {
                //Converte o valor da variavel cadastro - String - em varável tipo LocalDataTime
                cadastro = LocalDateTime.parse(cadastroTexto, formatador);
                //Quebra o loop e vai para a criação do equipamento
                break;           
            } catch (DateTimeParseException e) {
                System.out.println("❌ Formato de data inválida! Cadastre com a data e hora atual.");
                //Se o usuário inserir uma data inválida, nula ou em um formato incorreto, o sistema 
                //deve tratá-la preventivamente utilizando a data e 
                // hora atual do servidor (DateTime.Now, new Date(), datetime.now(), etc.) para evitar 
                // falhas ou erros de execução (crashes).
                System.out.println();
             }
        }

        // Criação de objeto da classe equipamento utilizando a data que deu certo no loop
        Equipamento equipamento = new Equipamento(id, nomeEquipamento, cadastro);
        System.out.println();
        System.out.println("Equipamento adicionado com sucesso!");
        return equipamento;
    }

    //Como não retorna nada, apenas vai printar valores, a função vai ser void
    public void listarEquipamentos(ArrayList<Equipamento> equipamento){
        if (equipamento.isEmpty()) {
            System.out.println();
            System.out.println("Nenhum equipamento cadastrado!");
            System.out.println();
            return;             
        }
        System.out.println();
        System.out.println("Lista de equipamentos: ");
        for(int i = 0; i < equipamento.size(); i++){
            System.out.println(equipamento.get(i).toString());
        }
        System.out.println();
    }

    public void emprestarEquipamento(ArrayList<Equipamento> equipamentosEmprestados, int id){
        for (Equipamento equipamento : equipamentosEmprestados) {
            if (equipamento.getId() == id) {
                if(equipamento.getDisponibilidade()){
                    equipamento.setDisponibilidade(false);
                    System.out.println("Equipamento emprestado com sucesso!");
                } else {
                    System.out.println("❌ Equipamento indisponível para empréstimo.");
                }
            }
        }
    }
} 
