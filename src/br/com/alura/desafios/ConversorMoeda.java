package br.com.alura.desafios;

public class ConversorMoeda implements ConversaoFinanceira
{
    private double valorConvertido;
    private double valorEmReal;

    public double getValorEmReal() {
        return valorEmReal;
    }

    public void setValorEmReal(double valorEmReal) {
        this.valorEmReal = valorEmReal;
    }

    public double getValorConvertido() {
        return valorConvertido;
    }

    @Override
    public double converterDolarParaReal(double dolar) {
        valorConvertido = dolar * 5.15;
        return valorConvertido;
    }
}
