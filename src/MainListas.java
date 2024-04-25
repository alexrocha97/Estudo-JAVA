import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class MainListas
{
    public static void main(String[] args) {

        var novoFilme = new Filme("The Batman",2023);
        novoFilme.avaliarNota(9);
        Filme novoFilme02 = new Filme("Avatar",2023);
        novoFilme02.avaliarNota(6);
        var novoFilme03 = new Filme("Dogville",2003);
        novoFilme03.avaliarNota(10);
        var novaSerie = new Serie("Lost",2000);

        ArrayList<Titulo> lista = new ArrayList<Titulo>();
        lista.add(novoFilme);
        lista.add(novoFilme02);
        lista.add(novoFilme03);
        lista.add(novaSerie);

        for (Titulo item: lista)
        {
            System.out.println(item.getNome());
            if (item instanceof Filme filme) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
    }
}
