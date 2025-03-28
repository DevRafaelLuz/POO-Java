package Exercicio01;
public class Pedido {
    private Produto[] itens;

    public Produto[] getItens() { return itens; }

    public void setItens(Produto[] itens) { this.itens = itens; }

    public double calcularValorTotal() {
        double valor = 0.0;
        for (Produto produto : itens) {
            valor += produto.getPreco();
        }
        return valor;
    }
}
