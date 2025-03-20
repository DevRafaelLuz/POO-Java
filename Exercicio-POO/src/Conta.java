import java.time.LocalDate;

public class Conta {
    public String nome;
    public Integer numero;
    public Integer agencia;
    public Double saldo;
    public LocalDate dataCriacao;

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (saldo > valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void calcularRendimento() {
        saldo *= 1.10;
    }

    public String recuperarDadosParaImpressao() {
        return String.format("[Agência: %d, Número: %d, Nome: %s, Data Criação: %s, Saldo: %f]",
            agencia, numero, nome, dataCriacao.toString(), saldo);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numero == null) ? 0 : numero.hashCode());
        result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Conta other = (Conta) obj;
        if (numero == null) {
            if (other.numero != null)
                return false;
        } else if (!numero.equals(other.numero))
            return false;
        if (agencia == null) {
            if (other.agencia != null)
                return false;
        } else if (!agencia.equals(other.agencia))
            return false;
        return true;
    }    
}
