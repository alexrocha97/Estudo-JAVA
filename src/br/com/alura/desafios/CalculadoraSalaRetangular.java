package br.com.alura.desafios;

public class CalculadoraSalaRetangular implements CalculoGeometrico
{
    private double altura;
    private double largura;
    private double valorPerimetro;

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public double calculaArea() {
        double area = altura * largura;
        return area;
    }

    @Override
    public double calculaPerimetro() {
        int valorMultiplicacao = 2;
        double perimetro = (altura * valorMultiplicacao) + (largura * valorMultiplicacao);
        return perimetro;
    }
}
