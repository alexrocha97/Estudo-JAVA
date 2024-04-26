import br.com.alura.screenmatch.modelos.Animal;
import br.com.alura.screenmatch.modelos.Cachorro;
import br.com.alura.screenmatch.modelos.Gato;
import br.com.alura.screenmatch.modelos.Produto;
import java.util.ArrayList;
import java.util.Collections;

public class MainExercicioListas
{
    public static void main(String[] args) {
        ArrayList<String> listaDeAnimais = new ArrayList<String>();
        listaDeAnimais.add("Cachorro");
        listaDeAnimais.add("Gato");
        listaDeAnimais.add("Rato");

        for (String item: listaDeAnimais)
        {
            System.out.println(item);
        }

        ArrayList<Animal> listaDeAnimais02 = new ArrayList<Animal>();
        listaDeAnimais02.add(new Cachorro("Bruce"));
        listaDeAnimais02.add(new Cachorro("Triz"));
        listaDeAnimais02.add(new Gato("Omar"));

        for (Animal item: listaDeAnimais02)
        {
            if(item instanceof Cachorro cachorro){
                System.out.println("Esse aqui é cachorro! - " + item.getNome());
            }
            else
            {
                System.out.println("Esse aqui é gato! - " + item.getNome());
            }
        }

        ArrayList<Produto> listaDeProdutos = new ArrayList<Produto>();
        listaDeProdutos.add(new Produto("Pão",9.99));
        listaDeProdutos.add(new Produto("Arroz",10.00));
        listaDeProdutos.add(new Produto("Feijão", 25.35));

        double totalPrecoDosProdutos = 0;
        for (Produto item: listaDeProdutos)
        {
             totalPrecoDosProdutos += item.getPreco();
        }
        double mediaDePrecos = totalPrecoDosProdutos / listaDeProdutos.size();
        System.out.printf("Média de preço: %.2f", mediaDePrecos);

        ArrayList<String> buscarPorArtista = new ArrayList<String>();
        buscarPorArtista.add("Alex");
        buscarPorArtista.add("Ventura");
        buscarPorArtista.add("Araujo");
        System.out.println(buscarPorArtista);

        Collections.sort(buscarPorArtista);
        System.out.println(buscarPorArtista);

        ArrayList<Integer> listaNumerosInteiros = new ArrayList<Integer>();
        listaNumerosInteiros.add(1);
        listaNumerosInteiros.add(3);
        listaNumerosInteiros.add(2);
        listaNumerosInteiros.add(4);

        Collections.sort(listaNumerosInteiros);
        System.out.println(listaNumerosInteiros);
    }
}
