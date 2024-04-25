package br.com.alura.screenmatch.modelos;
import br.com.alura.screemacth.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel
{
    public Filme(String nome, int anoLancamento) {
        super(nome,anoLancamento);
    }

    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int)ObterMediaFilme() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoLancamento() + ")";
    }
}
