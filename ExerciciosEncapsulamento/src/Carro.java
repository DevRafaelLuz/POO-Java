public class Carro {
    private String marca;
    private String modelo;
    private Integer anoFabricacao;
    private Double quilometragem;

    public Carro(String marca, String modelo, Integer ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = ano;
        this.quilometragem = 0.0;
    }

    public void trocarOleo() {
        System.out.println("Troca de óleo realizada com sucesso nova troca deve ser com " + (quilometragem + 2500) + "km");
    }

    public void fazerRevisao() {
        var messagem = String.format("Veículo %s %s ano de fabricação %d com KM: %.2f", marca, modelo, anoFabricacao, quilometragem);
        System.out.println(messagem);

        if (quilometragem >= 2500) {
            trocarOleo();
        }
    }

    public void atualizarQuilometragem(Double valor) {
        if (valor > 0) {
            this.quilometragem += valor;
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public Double getQuilometragem() {
        return quilometragem;
    }
}
