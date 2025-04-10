package br.edu.up.calculadora.math;

import br.edu.up.calculadora.models.Cliente;
import br.edu.up.calculadora.models.Produto;

public class Calculadora {
    public void calcularDesconto(Cliente cliente, Produto produto, int quantidade) {
        var total = produto.getPreco() * quantidade;

        if (total > 60.00) {
            total *= 0.90;
        }

        System.out.println(String.format("""
            Olá %s
            Estamos processando a sua compra!
            Valor da compra é de R$ %.2f
            A nota fiscal será enviada para: %s"""
            , cliente.getNome(), total,  cliente.getEmail()));
    }
}
