package org.exercicio2;

public class Contato {
    protected String nome;
    protected String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return " nome: " + this.nome + ", email: " + this.email + ";/n";
    }
}
