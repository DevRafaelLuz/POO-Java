public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Felipe");
        p.setIdade(25);
        p.setGenero("Masculino");
        imprimir(p);

        p.setNome("João");
        p.setIdade(10);
        p.setGenero("masculino");
        imprimir(p);
    }

    private static void imprimir(Pessoa p) {
        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
        System.out.println("Genero: " + p.getGenero());
    }
}
