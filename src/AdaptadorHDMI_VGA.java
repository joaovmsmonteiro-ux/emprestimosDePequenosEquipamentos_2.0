package src;

public class AdaptadorHDMI_VGA {
     private int id;
    private String nome;
    private boolean disponibilidade;

    public AdaptadorHDMI_VGA(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.disponibilidade = true;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    public boolean getDisponibilidade() {
        return disponibilidade;
    }

    @Override 
    public String toString() {
        return "AdaptadorHDMI_VGA{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", disponibilidade=" + disponibilidade +
                '}';
    }
}
