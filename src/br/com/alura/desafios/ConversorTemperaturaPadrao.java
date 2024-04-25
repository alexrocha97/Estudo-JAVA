package br.com.alura.desafios;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    private double valorPadraoConversao = 1.8;
    private int escalaPadraoConversao = 32;
    private double valorTemperatura;

    public void setValorTemperatura(double valorTemperatura) {
        this.valorTemperatura = valorTemperatura;
    }

    @Override
    public void celsiusParaFahrenheit() {
        // F = C x 1.8 + 32;
        double f = (valorTemperatura * valorPadraoConversao) + escalaPadraoConversao;
        System.out.printf("\nF = %.1f",f);
    }

    @Override
    public void fahrenheitParaCelsius() {
        // C = (F - 32) / 1.8
        double c = (valorTemperatura - escalaPadraoConversao) / valorPadraoConversao;
        System.out.printf("\nC = %.1f",c);
    }
}
