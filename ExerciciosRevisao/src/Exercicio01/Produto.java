package Exercicio01;
public class Produto {
    private String nome;
    private double preco;
    private Integer quantidade;

    public Produto(String nome, double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, double preco) {
        this(nome, preco, 0);
    }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public double getPreco() { return preco; }

    public void setPreco(double preco) { this.preco = preco; }

    public Integer getQuantidade() { return quantidade; }

    public void setQuantidade(Integer quantidade) { this.quantidade = quantidade; }    
}
