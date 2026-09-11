package src;
public class CaboHDMI {
    private int id;
    private String nome;
    private boolean disponibilidade;

    public CaboHDMI(int id, String nome) {
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
        return "Pointer{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", disponibilidade=" + disponibilidade +
                '}';
    }

}
