public class TestePessoa {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa("Rafael", 19);
        var filha = new Pessoa("Julia");

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

        System.out.println(filha.getNome());
        System.out.println(filha.getIdade());
    }
}
