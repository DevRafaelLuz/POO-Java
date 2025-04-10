package br.edu.up.calculadora;

import br.edu.up.calculadora.math.Calculadora;
import br.edu.up.calculadora.models.Cliente;
import br.edu.up.calculadora.models.Produto;

public class Main {
    public static void main(String[] args) {
        Produto p = new Produto("Leite", 6.99);
        Cliente c = new Cliente("João", "joao@email.com");

        p.exibirDetalhes();
        c.exibirDetalhes();

        Calculadora calc = new Calculadora();
        calc.calcularDesconto(c, p, 5);
    }
}