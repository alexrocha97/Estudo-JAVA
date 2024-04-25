package br.com.alura.desafios;

public class ExibirDesafio {
    public static void main(String[] args)
    {
        ConversorMoeda conversor = new ConversorMoeda();
        conversor.setValorEmReal(1.00);
        conversor.converterDolarParaReal(conversor.getValorEmReal());

        System.out.printf("Valor convertido em real: R$ %.2f%n",conversor.getValorConvertido());

        CalculadoraSalaRetangular calculoRetangulo01 = new CalculadoraSalaRetangular();
        CalculadoraSalaRetangular calculoRetangulo02 = new CalculadoraSalaRetangular();

        calculoRetangulo01.setAltura(15);
        calculoRetangulo01.setLargura(10);

        calculoRetangulo02.setAltura(30);
        calculoRetangulo02.setLargura(18);

        double valorArea = calculoRetangulo01.calculaArea();
        double valorPerimetro = calculoRetangulo02.calculaPerimetro();
        System.out.println("A = " + valorArea);
        System.out.println("P = " + valorPerimetro);


        TabuadaMultiplicacao multiplicacao = new TabuadaMultiplicacao();
        multiplicacao.setNumero(2);
        multiplicacao.mostrarTabuada();

        ConversorTemperaturaPadrao conversaoTemperatura = new ConversorTemperaturaPadrao();
        conversaoTemperatura.setValorTemperatura(37);

        conversaoTemperatura.celsiusParaFahrenheit();
        conversaoTemperatura.fahrenheitParaCelsius();
    }
}
