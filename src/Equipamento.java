package src;
import java.time.LocalDateTime;

public class Equipamento {
    private int id;    
    private String nomeEquipamento;
    private LocalDateTime cadastro;
    private boolean disponibilidade;    

    //CONSTRUTORES
    public Equipamento(int id, String nomeEquipamento, LocalDateTime cadastro) {
        this.id = id;
        this.nomeEquipamento = nomeEquipamento;
        this.cadastro = cadastro;
        this.disponibilidade = true;
    }

    //GETTERS AND SETTERS    
    //ID
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    //NomeEquipamento
    public String getNomeEquipamento() {
        return nomeEquipamento;
    }
    public void setNomeEquipamento(String nomeEquipamento) {
        this.nomeEquipamento = nomeEquipamento;
    }
    //CADASTRO
    public LocalDateTime getCadastro() {
        return cadastro;
    }
    public void setCadastro(LocalDateTime cadastro) {
        this.cadastro = cadastro;
    }
    //Disponibilidade    
    public boolean isDisponibilidade() {
        return disponibilidade;
    }
    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    @Override
    public String toString() {
        java.time.format.DateTimeFormatter formatadorExibicao = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return "Registro[ " + 
        "id=" + id + 
        ", nomeEquipamento='" + nomeEquipamento + '\'' + 
        ", cadastro=" + cadastro.format(formatadorExibicao) +
        ", disponibilidade=" + disponibilidade + 
        " ]";
    }
}
