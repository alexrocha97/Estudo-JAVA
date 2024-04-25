package br.com.alura.desafios.appMusic;

public class mainMusic
{
    public static void main(String[] args)
    {
        Musica musica01 = new Musica();
        Podcasts podcasts01 = new Podcasts();

        musica01.setTitulo("Música relaxante");
        musica01.setTotalCurtidas(2);
        musica01.setClasificacao(10);
        musica01.setTotalDeReproducoes(3);
        musica01.setDuracao(3);

        podcasts01.setTitulo("Sobre a vida");
        podcasts01.setDuracao(10);
        podcasts01.setTotalCurtidas(7);
        podcasts01.setTotalDeReproducoes(5);
        podcasts01.setClasificacao(5);

        musica01.reproduzir();
        musica01.curtir();
        musica01.exibirFicha();

        podcasts01.reproduzir();
        podcasts01.curtir();
        podcasts01.exibirFicha();
    }
}
