package Exercicio02;
public class TesteGerencimentoCursos {
    public static void main(String[] args) {
        var curso1 = new Curso("Medicina", 1);
        var curso2 = new Curso("Ciência da Computação", 2);

        var aluno1 = new Aluno("João", 123, curso1);
        var aluno2 = new Aluno("Felipe", 456, curso2);
        var aluno3 = new Aluno("Maria", 789, curso1);

        curso1.matricularAluno(aluno1);
        curso1.matricularAluno(aluno2);
        curso1.matricularAluno(aluno3);
        curso1.relatorio();
        curso1.removerAluno(456);
        curso1.relatorio();

        curso2.matricularAluno(aluno3);
        curso2.relatorio();
    }
}
