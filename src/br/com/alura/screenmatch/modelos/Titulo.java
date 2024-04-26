package br.com.alura.screenmatch.modelos;

public class Titulo implements Comparable<Titulo> {
    private String nome;
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacao() {
        return totalDeAvaliacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void exibirFichaTecnica()
    {
        double media = ObterMediaFilme();
        System.out.printf(
                """
                Nome do filme: %s
                Ano de lançamento: %d
                Duração(Em minutos): %d
                Avaliação: %.1f
                %n""",
                nome,
                anoLancamento,
                duracaoEmMinutos,
                media);
    }

    public void avaliarNota(double nota)
    {
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    public double ObterMediaFilme()
    {
        return somaDasAvaliacoes / totalDeAvaliacao;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
