public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro("Honda", "Civc", 2025);
        carro.atualizarQuilometragem(1000.00);
        carro.atualizarQuilometragem(1000.00);
        carro.fazerRevisao();
        carro.atualizarQuilometragem(1000.00);
        carro.fazerRevisao();
    }
}
