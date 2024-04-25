package br.com.alura.desafios.appMusic;

public class Audio
{
    private String titulo;
    private int duracao;
    private int totalDeReproducoes;
    private int totalCurtidas;
    private int clasificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void setTotalDeReproducoes(int totalDeReproducoes) {
        this.totalDeReproducoes = totalDeReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public void setTotalCurtidas(int totalCurtidas) {
        this.totalCurtidas = totalCurtidas;
    }

    public int getClasificacao() {
        return clasificacao;
    }

    public void setClasificacao(int clasificacao) {
        this.clasificacao = clasificacao;
    }

    public void curtir()
    {
        totalCurtidas++;
        System.out.println("\nVocê curtiu!");
    }

    public void reproduzir()
    {
        System.out.printf("\nReproduzindo - %s", titulo);
    }

    public void exibirFicha()
    {
        System.out.printf(
                """
                \nTítulo - %s
                Duração - %d
                Classificação - %s
                Curtidas - %d
                """,
                titulo,
                duracao,
                formatarClassificacao(),
                totalCurtidas);
    }

    public String formatarClassificacao()
    {
        String classificacao = "";

        if(totalCurtidas > 3){
            classificacao = Character.toString(128155) + Character.toString(128155) + Character.toString(128155);
            return classificacao;
        } else {
            classificacao = Character.toString(128155);
            return classificacao;
        }
    }
}
