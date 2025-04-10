package br.edu.up.calculadora.models;

public class Cliente {
    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void exibirDetalhes() {
        System.out.println(String.format("Nome: %s, e-mail: %s", nome, email));
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
