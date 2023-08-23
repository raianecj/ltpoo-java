package br.com.control;


public class Consumo {
    private double kmInicial;
    private double kmFinal;
    private double litros;
            double consumoMedio;

    public double getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(double kmInicial) {
        this.kmInicial = kmInicial;
    }

    public double getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(double kmFinal) {
        this.kmFinal = kmFinal;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }
    public double calcularConsumo(){
        consumoMedio = (this.kmFinal - this.kmInicial)/this.litros;
        return consumoMedio;
    }
       
            
}
