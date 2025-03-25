public class Pessoa {
    private String nome;
    private Integer idade;
    private String genero;

    public String getNome() { return nome; }
    public Integer getIdade() { return idade; }    
    public String getGenero() { return genero; }
    public void setNome(String nome) { this.nome = nome; }
    
    public void setIdade(Integer idade) {
        if (idade >= 0) {
            this.idade = idade;
        }
    }

    public void setGenero(String genero) {
        if (isGeneroValido(genero)) {
            this.genero = genero;
        }
    }

    private boolean isGeneroValido(String genero) {
        return "Masculino".equalsIgnoreCase(genero) || "Feminino".equalsIgnoreCase(genero);
    }
}
