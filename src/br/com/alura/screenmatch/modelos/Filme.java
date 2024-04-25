package br.com.alura.screenmatch.modelos;
import br.com.alura.screemacth.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel
{
    public Filme(String nome) {
        this.setNome(nome);
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
        var filme = "Filme: " + this.getNome() + " (" + this.getAnoLancamento() + ")";
        return filme;
    }
}
