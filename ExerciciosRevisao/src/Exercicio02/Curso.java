package Exercicio02;
public class Curso {
    private String nome;
    private int codigo;
    private Aluno[] alunos;
    private int totalAlunos;
    
    public Curso(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.totalAlunos = 0;
        this.alunos = new Aluno[10];
    }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public int getCodigo() { return codigo; }

    public void setCodigo(int codigo) { this.codigo = codigo; }

    public Aluno[] getAluno() { return alunos; }

    public void setAluno(Aluno[] alunos) { this.alunos = alunos; }
    
    public void matricularAluno(Aluno aluno) {
        alunos[totalAlunos] = aluno;
        totalAlunos++;
    }

    public void removerAluno(int matricula) {
        int indexRemoved = 0;
        for (int i = 0; i < totalAlunos; i++) {
            if (alunos[i].getMatricula() == matricula) {
                alunos[i] = null;
                indexRemoved = i;
            }
        }

        for (int i = indexRemoved; i < totalAlunos - 1; i++) {
            alunos[i] = alunos[i + 1];
        }
        alunos[totalAlunos - 1] = null;
        totalAlunos--;
    }

    public void relatorio() {
        System.out.println(nome + " tem " + totalAlunos + " alunos");
        for (int i = 0; i < totalAlunos; i++) {
            System.out.println(alunos[i].getNome());
        }
    }
}
