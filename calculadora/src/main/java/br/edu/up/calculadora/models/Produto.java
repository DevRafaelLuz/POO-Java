package br.edu.up.calculadora.models;

public class Produto {
    private String nome;
    private Double preco;    

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirDetalhes() {
        System.out.println(String.format("Nome: %s, preço: %s", nome, preco));
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }
}
