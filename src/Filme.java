public class Filme {
    private String nome;
    private int anoLancamento;
    private String genero;

    public Filme(String nome, int anoLancamento, String genero) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }


    public int getAnoLancamento() {
        return anoLancamento;
    }


    public String getGenero() {
        return genero;
    }
    @Override
    public String toString(){
        return "Nome: " + nome + ", Ano: " + anoLancamento + ", Gênero: " + genero;

    }


}
