import java.time.LocalDate;

public class TesteConta {
    public static void main(String[] args) throws Exception {
        Conta contaAluno = new Conta();
        contaAluno.nome = "Rafael";
        contaAluno.numero = 123;
        contaAluno.agencia = 789;
        contaAluno.saldo = 0.0;
        contaAluno.dataCriacao = LocalDate.now();

        Conta contaProfessor = new Conta();
        contaProfessor.nome = "Felipe";
        contaProfessor.numero = 456;
        contaProfessor.agencia = 932;
        contaProfessor.saldo = 0.0;
        contaProfessor.dataCriacao = LocalDate.now();

        // Comparando com ==
        if (contaAluno == contaProfessor) {
            System.out.println("Sim, são iguais");
        } else {
            System.out.println("Não são iguais");
        }

        // Comparando com equals()
        if (contaAluno.equals(contaProfessor)) {
            System.out.println("Sim, são iguais");
        } else {
            System.out.println("Não são iguais");
        }
    }
}
