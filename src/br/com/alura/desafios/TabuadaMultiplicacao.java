package br.com.alura.desafios;

public class TabuadaMultiplicacao implements Tabuada
{
    private int numero;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public void mostrarTabuada() {
        for (int i = 0; i < 11; i++)
        {
            int multiplicacao = i * numero;
            System.out.println(i + " X " + numero + " = " + multiplicacao);
        }
    }
}
