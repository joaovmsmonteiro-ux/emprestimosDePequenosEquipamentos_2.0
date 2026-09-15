package src;

import java.time.LocalDateTime;

public class Cadastro {
    private int id;
    private String nome;
    private String email;
    private String nomeGestor;
    private String emailGestor;
    private LocalDateTime dataEmprestimo;

    public Cadastro(int id, String nome, String email, String nomeGestor, String emailGestor, LocalDateTime dataEmprestimo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.nomeGestor = nomeGestor;
        this.emailGestor = emailGestor;
        this.dataEmprestimo = dataEmprestimo;
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

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setNomeGestor(String nomeGestor) {
        this.nomeGestor = nomeGestor;
    }
    public String getNomeGestor() {
        return nomeGestor;
    }

    public void setEmailGestor(String emailGestor) {
        this.emailGestor = emailGestor;
    }
    public String getEmailGestor() {
        return emailGestor;
    }

    public void setDataEmprestimo(LocalDateTime dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    public LocalDateTime getDataEmprestimo() {
        return dataEmprestimo;
    }

    @Override
    public String toString() {
        return "Cadastro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", nomeGestor='" + nomeGestor + '\'' +
                ", emailGestor='" + emailGestor + '\'' +
                ", dataEmprestimo=" + dataEmprestimo +
                '}';
    }
}


/**
 * <!DOCTYPE html>

<html lang="pt-BR">

<head>

    <meta charset="UTF-8">

    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Document</title>

</head>

<body>

    <header>

        <h1></h1>

    </header>

    <nav></nav>

        <main>

            <p>Dados do Solicitante</p>



            <form action="/cadastro" method="POST">

                <!--Caixa de Seleção | Equipamento-->

                <label for="fnequip">Escolha o tipo de Equipamento:</label><br>

                <select name="select" id="selctEquip">

                    <option value="1">Controle do Projetor do Auditório.</option>

                    <option value="2">Pointer (Passador de Slides).</option>

                    <option value="3">Carregador de Notebook (Dell e HP).</option>

                </select><br>

                <!--STRING | Nome & E-mail-->

                <label for="formNome">Nome:</label><br>

                <input type="text" id="formNome" name="formNome" placeholder="Digite seu nome" required><br>

               

                <label for="formE-mail">E-mail:</label><br>

                <input type="email" id="email" name="email" placeholder="seu-email@exemplo.com" required><br>  

               

                <label for="formNomeGestor">Nome do seu Gestor:</label><br>

                <input type="text" id="formNomeGestor" name="formNomeGestor" placeholder="Digite o nome do seu gestor" required><br>

               

                <label for="formE-mailGestor">E-mail do seu Gestor:</label><br>

                <input type="email" id="formE-mailGestor" name="formE-mailGestor" placeholder="email-gestor@exemplo.com" required><br>  

               

                <!--DATE | Data de Empréstimo-->

                <label for="dataEmprestimo">Data de Empréstimo:</label><br>

                <input type="date" id="dataEmprestimo" name="dataEmprestimo" required><br>



                <label for="dataDevolucao">Data de Devolução:</label><br>

                <input type="date" id="dataDevolucao" name="dataDevolucao" required><br>

                <button type="submit">Finalizar Solicitação</button>

            </form>

        </main>

    <footer></footer>

</body>

</html> 
 * 
 * 
 * 
 * 
 */