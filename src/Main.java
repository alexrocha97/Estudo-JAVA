import br.com.alura.screemacth.calculo.CalculadoraDeTempo;
import br.com.alura.screemacth.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Pessoa;
import br.com.alura.screenmatch.modelos.Serie;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        var novaSerie = new Serie();
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        var filtro = new FiltroRecomendacao();
        Episodio epp = new Episodio();

        var novoFilme = new Filme("The Batman");
        novoFilme.setAnoLancamento(2023);
        novoFilme.setDuracaoEmMinutos(120);
        novoFilme.setIncluidoNoPlano(true);
        novoFilme.setDiretor("Matt Reeves");

        Filme novoFilme02 = new Filme("Avatar");
//        novoFilme02.setNome("Avatar");
        novoFilme02.setAnoLancamento(2023);
        novoFilme02.setDuracaoEmMinutos(200);
        novoFilme02.setIncluidoNoPlano(true);
        novoFilme02.setDiretor("Alex Rocha");

        var novoFilme03 = new Filme("Dogville");
//        novoFilme03.setNome("Dogville");
        novoFilme03.setAnoLancamento(2003);
        novoFilme03.setDuracaoEmMinutos(200);

        novoFilme03.avaliarNota(10);

        novaSerie.setNome("Lost");
        novaSerie.setAnoLancamento(2000);
        novaSerie.setTemporadas(10);
        novaSerie.setEpisodiosPorTemporada(10);
        novaSerie.setMinutosPorEpisodio(50);

        ArrayList<Filme> listaDeFilmes = new ArrayList<Filme>();
        listaDeFilmes.add(novoFilme);
        listaDeFilmes.add(novoFilme02);
        listaDeFilmes.add(novoFilme03);

        System.out.println("Tamanho da lista - " + listaDeFilmes.size());
        System.out.println("Nome do primeiro item da lista - " + listaDeFilmes.get(0).getNome());
        System.out.println("Nome do primeiro item da lista - " + listaDeFilmes.get(0).toString());
        System.out.println(listaDeFilmes);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<Pessoa>();
        var pessoa01 = new Pessoa();
        var pessoa02 = new Pessoa();

        pessoa01.setNome("Ventura");
        pessoa01.setIdade(27);

        pessoa02.setNome("Alex");
        pessoa02.setIdade(26);

        listaDePessoas.add(pessoa01);
        listaDePessoas.add(pessoa02);

        System.out.printf("\nTamanho da lista: %d", listaDePessoas.size());
        System.out.printf("\nA primeira pessoa da lista: %s", listaDePessoas.get(0).toString());
        System.out.println("\nLista: " + listaDePessoas);

//        novoFilme.avaliarNota(8);
//        novoFilme.avaliarNota(10);
//        novoFilme.avaliarNota(5);
//
//        novaSerie.avaliarNota(8);
//        novaSerie.avaliarNota(10);
//        novaSerie.avaliarNota(5);
//
//        novoFilme.exibirFichaTecnica();
//        novaSerie.exibirFichaTecnica();
//
//        calculadora.inclui(novoFilme02);
//        calculadora.inclui(novoFilme);
//        calculadora.inclui(novaSerie);
//
////        System.out.println(calculadora.getTempoTotal());
//
//        filtro.filtra(novoFilme);
//        filtro.filtra(novoFilme02);
//
//        epp.setNumero(1);
//        epp.setSerie(novaSerie);
//        epp.setTotalDeAvaliacoes(300);
//
//        filtro.filtra(epp);
    }
}